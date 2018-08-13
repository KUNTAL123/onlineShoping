package net.kun.onlineShoping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.kun.shopingBeckend.dao.CategoryDAO;
import net.kun.shopingBeckend.dao.ProductDAO;
import net.kun.shopingBeckend.dto.Category;
import net.kun.shopingBeckend.dto.Product;

@Controller
public class PageController {
	
	
	@Autowired 
	CategoryDAO categoryDAO;
	
	@Autowired
	ProductDAO productDAO;
	
	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Home");
		mv.addObject("userClickHome",true);
		
		mv.addObject("categories",categoryDAO.list());
		return mv;
	}

	
	@RequestMapping(value="/about")
	public ModelAndView about()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout",true);
		return mv;
	}
	
	
	
	@RequestMapping(value="/contact")
	public ModelAndView contact()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Contact Us");
		mv.addObject("userClickContact",true);
		return mv;
	}
	
	/*
	 * Method to list all the products based on category
	 * */
	
	
	@RequestMapping(value="/show/all/products")
	public ModelAndView showAllProducts()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","All Products");
		mv.addObject("userClickAllProducts",true);
		
		mv.addObject("categories",categoryDAO.list());
		return mv;
	}
	
	
	
	@RequestMapping(value="/show/all/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id")int id)
	{
		ModelAndView mv=new ModelAndView("page");
		
		//categoryDAO to fatch a single categoey
		Category category=null;
		category=categoryDAO.get(id);
		
		mv.addObject("title",category.getName());
		
		mv.addObject("userClickCategoryProducts",true);
		// somgle category product
		mv.addObject("category",category);

		
		// list of products
		mv.addObject("categories",categoryDAO.list());
		return mv;
	}
	
	/*
	 * viewing a single product
	 * 
	 * */
	
	@RequestMapping(value="show/{id}/product")
	
	public ModelAndView showSingleProduct(@PathVariable int id)
	{
		ModelAndView mv=new ModelAndView("page");
		Product product =productDAO.get(id);
		
		//udate product
		product.setViews(product.getViews()+1);
		productDAO.update(product);
		//::::::::::::::::::::::::
		
		mv.addObject("title", product.getName());
		mv.addObject("product",product);
		mv.addObject("UserClickShowProduct",true);
		return mv;
		
	}
}


