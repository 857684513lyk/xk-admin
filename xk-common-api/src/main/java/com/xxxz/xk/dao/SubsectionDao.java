package com.xxxz.xk.dao;


import com.xxxz.xk.pojo.entity.Subsection;

public interface SubsectionDao {
    int deleteByPrimaryKey(Long id);

    int insert(Subsection record);

    int insertSelective(Subsection record);

    Subsection selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Subsection record);

    int updateByPrimaryKey(Subsection record);
}