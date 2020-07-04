package com.xxxz.xk.service;

import com.xxxz.xk.pojo.dto.PageDTO;
import com.xxxz.xk.pojo.dto.ResponseDTO;
import com.xxxz.xk.pojo.entity.Course;
import com.xxxz.xk.pojo.query.CourseQuery;

/**
 * creator：djx
 * date: 2020/7/4 9:43
 */
public interface CourseService {
    PageDTO  AjaxListCourse(CourseQuery query);

    ResponseDTO   addCourse(Course course);

    ResponseDTO  delCourse(Course course);

    ResponseDTO  updateCourse(Course course);
}
