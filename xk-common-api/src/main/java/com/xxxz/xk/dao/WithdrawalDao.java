package com.xxxz.xk.dao;


import com.xxxz.xk.pojo.entity.Withdrawal;

public interface WithdrawalDao {
    int deleteByPrimaryKey(Long id);

    int insert(Withdrawal record);

    int insertSelective(Withdrawal record);

    Withdrawal selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Withdrawal record);

    int updateByPrimaryKey(Withdrawal record);
}