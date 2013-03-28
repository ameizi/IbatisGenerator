package com.ibatis.generator.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import com.ibatis.generator.dao.ProductDAO;
import com.ibatis.generator.model.Product;
import com.ibatis.generator.model.ProductCriteria;
import com.ibatis.sqlmap.client.SqlMapClient;

@Repository(value="generatorProductDao")
public class ProductDAOImpl extends SqlMapClientDaoSupport implements ProductDAO {

    public ProductDAOImpl() {
        super();
    }
    
    @SuppressWarnings("unused")
	private SqlMapClient sqlMapClients;
    
    @Resource(name="sqlMapClient")
	public void setSqlMapClients(SqlMapClient sqlMapClients) {
		super.setSqlMapClient(sqlMapClients);
	}
    
    public int countByExample(ProductCriteria example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("product.countByExample", example);
        return count;
    }

    public int deleteByExample(ProductCriteria example) {
        int rows = getSqlMapClientTemplate().delete("product.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(Integer id) {
        Product _key = new Product();
        _key.setId(id);
        int rows = getSqlMapClientTemplate().delete("product.deleteByPrimaryKey", _key);
        return rows;
    }

    public Integer insert(Product record) {
        Object newKey = getSqlMapClientTemplate().insert("product.insert", record);
        return (Integer) newKey;
    }

    public Integer insertSelective(Product record) {
        Object newKey = getSqlMapClientTemplate().insert("product.insertSelective", record);
        return (Integer) newKey;
    }

    @SuppressWarnings("unchecked")
    public List<Product> selectByExample(ProductCriteria example) {
        List<Product> list = getSqlMapClientTemplate().queryForList("product.selectByExample", example);
        return list;
    }

    public Product selectByPrimaryKey(Integer id) {
        Product _key = new Product();
        _key.setId(id);
        Product record = (Product) getSqlMapClientTemplate().queryForObject("product.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByExampleSelective(Product record, ProductCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("product.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(Product record, ProductCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("product.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(Product record) {
        int rows = getSqlMapClientTemplate().update("product.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(Product record) {
        int rows = getSqlMapClientTemplate().update("product.updateByPrimaryKey", record);
        return rows;
    }

    protected static class UpdateByExampleParms extends ProductCriteria {
        private Object record;

        public UpdateByExampleParms(Object record, ProductCriteria example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}