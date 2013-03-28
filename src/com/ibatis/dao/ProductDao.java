package com.ibatis.dao;

import java.util.List;

import com.ibatis.model.Product;

public interface ProductDao {
	
	List<Product> listAll();
	
	boolean save(Product product);
	
	boolean update(Product product);
	
	Product getModel(int id);
}
