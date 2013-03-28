package com.ibatis.generator.dao;

import com.ibatis.generator.model.Category;
import com.ibatis.generator.model.CategoryCriteria;
import java.util.List;

public interface CategoryDAO {
    int countByExample(CategoryCriteria example);

    int deleteByExample(CategoryCriteria example);

    int deleteByPrimaryKey(Integer id);

    Integer insert(Category record);

    Integer insertSelective(Category record);

    List<Category> selectByExample(CategoryCriteria example);

    Category selectByPrimaryKey(Integer id);

    int updateByExampleSelective(Category record, CategoryCriteria example);

    int updateByExample(Category record, CategoryCriteria example);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}