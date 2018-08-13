package net.kun.shopingBeckend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.kun.shopingBeckend.dao.ProductDAO;
import net.kun.shopingBeckend.dto.Product;

public class ProductTestCase {

private static AnnotationConfigApplicationContext context;
private static ProductDAO productDAO;
private Product product=null;	
	
	@BeforeClass
	public static void init()
	{
	context=new AnnotationConfigApplicationContext();
	context.scan("net.kun.shopingBeckend");
	context.refresh();
	productDAO=(ProductDAO)context.getBean("productDAO");
	
	}
	
	@Test
	public void testCrudProduct()
	{
		product=new Product();
		product.setName("oppo Selfie S53");
		product.setBrand("oppo");
		product.setDescription("This is some description of oppo mobile phone");
		product.setUnitPrice(25000);
		product.setActive(true);
		product.setCategoryId(3);
		product.setSupplierId(3);

		assertEquals("somthing went wrong when inserting new product!",true, productDAO.add(product));
		/*//update
		product.setName("Samsung Galuxy S7");
		
		assertEquals("somthing went wrong when updating  an  existing product!",true, productDAO.update(product));
		*/
		product.setId(33);
		assertEquals("somthing went wrong when deleting  existing record!",true, productDAO.delete(product));
	}
	
}
