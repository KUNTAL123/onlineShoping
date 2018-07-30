package net.kun.shopingBeckend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.kun.shopingBeckend.dao.CategoryDAO;
import net.kun.shopingBeckend.dto.Category;

public class CategoryTestCase {
private static AnnotationConfigApplicationContext context;
private static CategoryDAO categoryDAO;
private Category category=null;	
	
	@BeforeClass
	public static void init()
	{
	context=new AnnotationConfigApplicationContext();
	context.scan("net.kun.shopingBeckend");
	context.refresh();
	categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
	
	}
	
	
	/*@Test
	public void testAddCategory()
	{
			category=new Category();
			category.setName("Laptop");
			category.setDescription("This is some description of  Laptop");
			category.setImgeURL("CAT_1.png");
			
			assertEquals("successfully added a cateory inside the table!",true,categoryDAO.add(category));
			
	}*/
	
/*	@Test
	public void testGetCategory()
	{
		category=categoryDAO.get(1);
		assertEquals("successfully fteched a single cateory from the table!","Television",category.getName());
		
	}*/
	
	/*@Test
	public void testupdateCategory()
	{
		category=categoryDAO.get(1);

			category.setName("T.V");
			category.setDescription("This is some description of  T.V");
		
			
			assertEquals("successfully updated a single cateory inside the table!",true,categoryDAO.update(category));
			
	}
	*/
	
	/*@Test
	public void testdeleteCategory()
	{   
		category=categoryDAO.get(1);

		
			assertEquals("successfully deleted a cateory from the table!",true,categoryDAO.delete(category));
			
	}*/
	
	
/*	@Test
	public void testgetListCategory()
	{   
		

		
			
		assertEquals("successfully fetched list of cateory from the table!",2,categoryDAO.list().size());
	}*/
	
	
	
}
