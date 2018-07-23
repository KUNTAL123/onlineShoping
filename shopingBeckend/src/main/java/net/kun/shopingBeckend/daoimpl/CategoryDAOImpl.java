package net.kun.shopingBeckend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kun.shopingBeckend.dao.CategoryDAO;
import net.kun.shopingBeckend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	

	public static List<Category> categories=new ArrayList<>();
	
	static {
		
		// first category 
		
		Category category=new Category();
		category.setId(1);

		category.setActive(true);
		category.setName("Television");
		category.setDescription("This is the description of  Television");
        category.setImgeURL("CT_1.png");
        categories.add(category);
        
     // second category 
		
     		Category category1=new Category();
    		category1.setId(2);

     		category1.setActive(true);
     		category1.setName("Mobile");
     		category1.setDescription("This is the description of  Mobile");
             category1.setImgeURL("CT_1.png");
             categories.add(category1);
		
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		
		//foreach
		
		for(Category category: categories)
		{
			if(category.getId()== id) return category;
		}
		
		return null;
		
	}

}