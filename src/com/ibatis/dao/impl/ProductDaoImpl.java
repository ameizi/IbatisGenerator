package com.ibatis.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import com.ibatis.dao.ProductDao;
import com.ibatis.model.Product;
import com.ibatis.sqlmap.client.SqlMapClient;

@Repository(value="productDaoImpl")
public class ProductDaoImpl extends SqlMapClientDaoSupport implements ProductDao {
	
	@SuppressWarnings("unused")
	private SqlMapClient sqlMapClients;
	
	@SuppressWarnings("unchecked")
	public List<Product> listAll() {
		return getSqlMapClientTemplate().queryForList("com.ibatis.model.Product.selectAll");
	}

	
	public boolean save(Product product) {
		Object object = getSqlMapClientTemplate().insert("com.ibatis.model.Product.save", product);
		return object==null?false:true;
	}


	public boolean update(Product product) {
		int n=getSqlMapClientTemplate().update("com.ibatis.model.Product.update", product);
		return n==1?true:false;
	}
	
	@Resource(name="sqlMapClient")
	public void setSqlMapClients(SqlMapClient sqlMapClients) {
		super.setSqlMapClient(sqlMapClients);
	}


	public Product getModel(int id) {
		return (Product) getSqlMapClientTemplate().queryForObject("com.ibatis.model.Product.selectById", id);
	}
}
