package com.xxxz.xk.dao;


import com.xxxz.xk.pojo.entity.Course;
import com.xxxz.xk.pojo.entity.CourseOrder;
import com.xxxz.xk.pojo.query.CourseOrderQuery;

import java.util.List;

public interface CourseDao {
    int deleteByPrimaryKey(Long courseId);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Long courseId);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);

}