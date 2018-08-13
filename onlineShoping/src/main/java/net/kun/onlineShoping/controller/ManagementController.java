package net.kun.onlineShoping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.kun.shopingBeckend.dao.CategoryDAO;
import net.kun.shopingBeckend.dao.ProductDAO;
import net.kun.shopingBeckend.dto.Category;
import net.kun.shopingBeckend.dto.Product;

@Controller
@RequestMapping("/manage")
public class ManagementController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	
	private ProductDAO productDAO;

	@RequestMapping(value="/products", method=RequestMethod.GET)
public ModelAndView showMangeProducts(@RequestParam(name="operation",required=false)String operation)
{
	ModelAndView mv =new ModelAndView("page");
	
	mv.addObject("userClickManageProducts",true);
	mv.addObject("title","ManageProducts");
    Product nproduct=new Product();
    // set few of the fields
    
    nproduct.setSupplierId(1);
    nproduct.setActive(true);
    
    mv.addObject("product",nproduct);
    if(operation!=null)
    {
    	if(operation.equals("product")){
    	
    		mv.addObject("message","Product has been sumitted successfully");
    	}
    } 
	
	return mv;
}
	//handle product submission
	@RequestMapping(value="/products", method=RequestMethod.POST)
	public String handleProductSubmission(@ModelAttribute("product") Product mProduct )
	{
	         // adding the product to databse
              productDAO.add(mProduct);		
		 
		return "redirect:/manage/products?operation=product";
	}

	
	
	
	@ModelAttribute("categories")
	public List<Category> getCategory()
	{
	return categoryDAO.list();
	}
}
