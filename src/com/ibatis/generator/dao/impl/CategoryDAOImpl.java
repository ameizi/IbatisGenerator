package com.ibatis.generator.dao.impl;

import com.ibatis.generator.dao.CategoryDAO;
import com.ibatis.generator.model.Category;
import com.ibatis.generator.model.CategoryCriteria;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class CategoryDAOImpl extends SqlMapClientDaoSupport implements CategoryDAO {

    public CategoryDAOImpl() {
        super();
    }

    public int countByExample(CategoryCriteria example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("category.countByExample", example);
        return count;
    }

    public int deleteByExample(CategoryCriteria example) {
        int rows = getSqlMapClientTemplate().delete("category.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(Integer id) {
        Category _key = new Category();
        _key.setId(id);
        int rows = getSqlMapClientTemplate().delete("category.deleteByPrimaryKey", _key);
        return rows;
    }

    public Integer insert(Category record) {
        Object newKey = getSqlMapClientTemplate().insert("category.insert", record);
        return (Integer) newKey;
    }

    public Integer insertSelective(Category record) {
        Object newKey = getSqlMapClientTemplate().insert("category.insertSelective", record);
        return (Integer) newKey;
    }

    @SuppressWarnings("unchecked")
    public List<Category> selectByExample(CategoryCriteria example) {
        List<Category> list = getSqlMapClientTemplate().queryForList("category.selectByExample", example);
        return list;
    }

    public Category selectByPrimaryKey(Integer id) {
        Category _key = new Category();
        _key.setId(id);
        Category record = (Category) getSqlMapClientTemplate().queryForObject("category.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByExampleSelective(Category record, CategoryCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("category.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(Category record, CategoryCriteria example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("category.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(Category record) {
        int rows = getSqlMapClientTemplate().update("category.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(Category record) {
        int rows = getSqlMapClientTemplate().update("category.updateByPrimaryKey", record);
        return rows;
    }

    protected static class UpdateByExampleParms extends CategoryCriteria {
        private Object record;

        public UpdateByExampleParms(Object record, CategoryCriteria example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}