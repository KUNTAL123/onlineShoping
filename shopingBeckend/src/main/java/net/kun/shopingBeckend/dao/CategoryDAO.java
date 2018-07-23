package net.kun.shopingBeckend.dao;

import java.util.List;

import net.kun.shopingBeckend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);

}
