package com.xxxz.xk.dao;


import com.xxxz.xk.pojo.entity.PayLog;

public interface PayLogDao {
    int deleteByPrimaryKey(Long payLogId);

    int insert(PayLog record);

    int insertSelective(PayLog record);

    PayLog selectByPrimaryKey(Long payLogId);

    int updateByPrimaryKeySelective(PayLog record);

    int updateByPrimaryKey(PayLog record);
}