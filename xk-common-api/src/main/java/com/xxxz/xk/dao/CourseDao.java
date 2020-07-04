package com.xxxz.xk.dao;


import com.xxxz.xk.pojo.entity.Course;

public interface CourseDao {
    int deleteByPrimaryKey(Long courseId);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Long courseId);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}