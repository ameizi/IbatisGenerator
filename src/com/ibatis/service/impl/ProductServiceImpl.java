package com.ibatis.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ibatis.dao.ProductDao;
import com.ibatis.model.Product;
import com.ibatis.service.ProductService;

@Service(value="productServiceImpl")
public class ProductServiceImpl implements ProductService {

	@Resource(name="productDaoImpl")
	private ProductDao productDao;
	
	@Transactional(propagation=Propagation.REQUIRED)
	public List<Product> listAll() {
		return productDao.listAll();
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean save(Product product) {
		return productDao.save(product);
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public boolean update(Product product) {
		return productDao.update(product);
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public Product getModel(int id) {
		return productDao.getModel(id);
	}

}
