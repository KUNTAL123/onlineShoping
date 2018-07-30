package net.kun.shopingBeckend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.kun.shopingBeckend.dao.ProductDAO;
import net.kun.shopingBeckend.dto.Product;

@Repository("productDAO")
@Transactional
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Product get(int id) {
	try{
		return sessionFactory.
				getCurrentSession().
			get(Product.class,Integer.valueOf(id));
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
	return null;
	}

	@Override
	public List<Product> list() {
		
		return sessionFactory.
				getCurrentSession().
				createQuery("From Product",Product.class)
				.getResultList();
	}

	@Override
	public boolean add(Product product) {    
		try
		{
			sessionFactory.getCurrentSession()
			.persist(product);
			return true;
		}
        catch(Exception e)
		{
        	e.printStackTrace();
        	return false;
		}
		
	
	}

	@Override
	public boolean update(Product product) {
	   try{
		   sessionFactory.getCurrentSession().update(product);
		   return true;
		   
	   }
	   
	   catch(Exception e)
	   {
		  e.printStackTrace();
			return false;

	   }
	}

	@Override
	public boolean delete(Product product) {
		try{
		product.setActive(false);
		sessionFactory.getCurrentSession().update(product);
		return true;
		}catch(Exception e)
		{
		e.printStackTrace();
		return false;
		}
	}

	@Override
	public List<Product> listActiveProducts() {
	return	sessionFactory.getCurrentSession().
		createQuery("FROM Product WHERE active= :active",Product.class).
		setParameter("active",true).
		getResultList();
		
	}

	@Override
	public List<Product> listActiveProductsByCategory(int categoryId) {
		
		return sessionFactory.getCurrentSession().
		createQuery("FROM Product WHERE active= :active AND categoryId= :categoryId",Product.class).
		setParameter("active",true).
		setParameter ("categoryId",categoryId).
		getResultList();
		
	
	}

	@Override
	public List<Product> getlistActiveProducts(int count) {
		return sessionFactory.getCurrentSession().
				createQuery("FROM Product WHERE active= :active AND ORDER BY id",Product.class)
				.setParameter("active",true)
				.setFirstResult(0)
				.setMaxResults(count)
				.getResultList();
	}

}
