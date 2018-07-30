package net.kun.shopingBeckend.dao;

import java.util.List;
import net.kun.shopingBeckend.dto.Product;

public interface ProductDAO {
	Product get(int id);

	List<Product> list();
	boolean add(Product product); 
	boolean update(Product product); 
	boolean delete(Product product); 

	
	// business method
	
		List<Product> listActiveProducts();
		List<Product> listActiveProductsByCategory(int categoryId);
		List<Product> getlistActiveProducts(int count);

}
