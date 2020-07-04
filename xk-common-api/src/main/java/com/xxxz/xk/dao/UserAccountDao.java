package com.xxxz.xk.dao;


import com.xxxz.xk.pojo.entity.UserAccount;

public interface UserAccountDao {
    int deleteByPrimaryKey(Long userId);

    int insert(UserAccount record);

    int insertSelective(UserAccount record);

    UserAccount selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(UserAccount record);

    int updateByPrimaryKey(UserAccount record);
}