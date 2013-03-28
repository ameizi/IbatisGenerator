package com.ibatis.generator.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ibatis.generator.dao.ProductDAO;
import com.ibatis.generator.model.ProductCriteria;
import com.ibatis.generator.service.GeneratorProductService;

@Service(value="generatorProductService")
public class GeneratorProductServiceImpl implements GeneratorProductService {

	@Resource(name="generatorProductDao")
	private ProductDAO productDao;

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public int countByExample(ProductCriteria example) {
		return productDao.countByExample(example);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public int deleteByExample(ProductCriteria example) {
		return productDao.deleteByExample(example);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public int deleteByPrimaryKey(Integer id) {
		return productDao.deleteByPrimaryKey(id);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Integer insert(com.ibatis.generator.model.Product record) {
		return productDao.insert(record);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Integer insertSelective(com.ibatis.generator.model.Product record) {
		return productDao.insertSelective(record);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public List<com.ibatis.generator.model.Product> selectByExample(
			ProductCriteria example) {
		return productDao.selectByExample(example);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public com.ibatis.generator.model.Product selectByPrimaryKey(Integer id) {
		return productDao.selectByPrimaryKey(id);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public int updateByExampleSelective(
			com.ibatis.generator.model.Product record, ProductCriteria example) {
		return productDao.updateByExampleSelective(record, example);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public int updateByExample(com.ibatis.generator.model.Product record,
			ProductCriteria example) {
		return productDao.updateByExample(record, example);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public int updateByPrimaryKeySelective(
			com.ibatis.generator.model.Product record) {
		return productDao.updateByPrimaryKeySelective(record);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public int updateByPrimaryKey(com.ibatis.generator.model.Product record) {
		return productDao.updateByPrimaryKey(record);
	}



}
