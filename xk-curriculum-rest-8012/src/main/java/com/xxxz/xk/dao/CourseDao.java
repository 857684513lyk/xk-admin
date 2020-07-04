package com.xxxz.xk.dao;

import com.xxxz.xk.pojo.entity.Course;
import com.xxxz.xk.pojo.query.CourseQuery;
import com.xxxz.xk.pojo.vo.CourseVO;

import java.util.List;

public interface CourseDao {
    int deleteByPrimaryKey(Long courseId);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Long courseId);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);

    List<CourseVO> listCourse(CourseQuery query);

    Integer  listCourseCount(CourseQuery query);
}