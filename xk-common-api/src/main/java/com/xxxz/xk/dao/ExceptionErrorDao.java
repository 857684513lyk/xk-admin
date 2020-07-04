package com.xxxz.xk.dao;


import com.xxxz.xk.pojo.entity.ExceptionError;

public interface ExceptionErrorDao {
    int deleteByPrimaryKey(Long exceptionErrorId);

    int insert(ExceptionError record);

    int insertSelective(ExceptionError record);

    ExceptionError selectByPrimaryKey(Long exceptionErrorId);

    int updateByPrimaryKeySelective(ExceptionError record);

    int updateByPrimaryKey(ExceptionError record);
}