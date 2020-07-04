package com.xxxz.xk.dao;


import com.xxxz.xk.pojo.entity.BrainMap;

public interface BrainMapDao {
    int deleteByPrimaryKey(Long id);

    int insert(BrainMap record);

    int insertSelective(BrainMap record);

    BrainMap selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BrainMap record);

    int updateByPrimaryKey(BrainMap record);
}