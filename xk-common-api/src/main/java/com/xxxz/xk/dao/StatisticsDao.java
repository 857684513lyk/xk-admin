package com.xxxz.xk.dao;


import com.xxxz.xk.pojo.entity.Statistics;

public interface StatisticsDao {
    int deleteByPrimaryKey(Long id);

    int insert(Statistics record);

    int insertSelective(Statistics record);

    Statistics selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Statistics record);

    int updateByPrimaryKey(Statistics record);
}