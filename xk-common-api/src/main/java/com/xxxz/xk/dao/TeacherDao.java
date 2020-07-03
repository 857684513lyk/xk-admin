package com.xxxz.xk.dao;


import com.xxxz.xk.pojo.entity.Teacher;

public interface TeacherDao {
    int deleteByPrimaryKey(Long userId);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}