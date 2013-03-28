package com.ibatis.service;

import java.util.List;

import com.ibatis.model.Product;

public interface ProductService {
	
	List<Product> listAll();
	
	boolean save(Product product);
	
	boolean update(Product product);
	
	Product getModel(int id);
}
