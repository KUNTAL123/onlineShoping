package net.kun.onlineShoping.controller;

import java.util.List;	

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.kun.shopingBeckend.dao.ProductDAO;
import net.kun.shopingBeckend.dto.Product;

@Controller
@RequestMapping("/json/data")
public class JasonDataControler {
	@Autowired
	private ProductDAO productDAO;  
	
	@RequestMapping("/all/products")
	@ResponseBody
	public List<Product> getAllProducts()
	{
	return productDAO.listActiveProducts();
	}
	
	@RequestMapping("/category/{id}/products")
	@ResponseBody
	public List<Product> getAllProductsByCategory(@PathVariable int id)
	{
	return productDAO.listActiveProductsByCategory(id);
	}
	
	

}
