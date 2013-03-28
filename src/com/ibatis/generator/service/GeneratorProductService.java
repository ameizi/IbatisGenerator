package com.ibatis.generator.service;

import java.util.List;

import com.ibatis.generator.model.Product;
import com.ibatis.generator.model.ProductCriteria;

public interface GeneratorProductService {
	
	int countByExample(ProductCriteria example);

	int deleteByExample(ProductCriteria example);

	int deleteByPrimaryKey(Integer id);

	Integer insert(Product record);

	Integer insertSelective(Product record);

	List<Product> selectByExample(ProductCriteria example);

	Product selectByPrimaryKey(Integer id);

	int updateByExampleSelective(Product record, ProductCriteria example);

	int updateByExample(Product record, ProductCriteria example);

	int updateByPrimaryKeySelective(Product record);

	int updateByPrimaryKey(Product record);
	
}
