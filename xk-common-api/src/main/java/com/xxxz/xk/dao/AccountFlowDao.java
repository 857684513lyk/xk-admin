package com.xxxz.xk.dao;


import com.xxxz.xk.pojo.entity.AccountFlow;

public interface AccountFlowDao {
    int deleteByPrimaryKey(Long account_flow_id);

    int insert(AccountFlow record);

    int insertSelective(AccountFlow record);

    AccountFlow selectByPrimaryKey(Long account_flow_id);

    int updateByPrimaryKeySelective(AccountFlow record);

    int updateByPrimaryKey(AccountFlow record);
}