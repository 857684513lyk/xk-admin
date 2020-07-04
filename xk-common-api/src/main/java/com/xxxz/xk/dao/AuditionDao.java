package com.xxxz.xk.dao;


import com.xxxz.xk.pojo.entity.Audition;

public interface AuditionDao {
    int deleteByPrimaryKey(Long auditionId);

    int insert(Audition record);

    int insertSelective(Audition record);

    Audition selectByPrimaryKey(Long auditionId);

    int updateByPrimaryKeySelective(Audition record);

    int updateByPrimaryKey(Audition record);
}