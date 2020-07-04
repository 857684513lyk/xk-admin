package com.xxxz.xk.dao;


import com.xxxz.xk.pojo.entity.CourseOrder;

public interface CourseOrderDao {
    int deleteByPrimaryKey(Long orderId);

    int insert(CourseOrder record);

    int insertSelective(CourseOrder record);

    CourseOrder selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(CourseOrder record);

    int updateByPrimaryKey(CourseOrder record);
}