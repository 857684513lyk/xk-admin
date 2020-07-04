package com.xxxz.xk.rest.course;

import com.xxxz.xk.pojo.dto.PageDTO;
import com.xxxz.xk.pojo.dto.ResponseDTO;
import com.xxxz.xk.pojo.entity.Course;
import com.xxxz.xk.pojo.query.CourseQuery;
import com.xxxz.xk.service.CourseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * creator：djx
 * date: 2020/7/4 9:39
 */
@RestController
@RequestMapping("curriculum")
public class CourseRest {
    @Resource
    CourseService courseService;

    @RequestMapping("/listCourse")
    PageDTO AjaxListCourse(CourseQuery query){
        return courseService.AjaxListCourse(query);
    }
    @RequestMapping("/addCourse")
    ResponseDTO addCourse(Course course){
        return courseService.addCourse(course);
    }

    @RequestMapping("/delCourse")
    ResponseDTO delCourse(Course course){
        return courseService.delCourse(course);
    }

    @RequestMapping("/updateCourse")
    ResponseDTO updateCourse(Course course){
        return courseService.updateCourse(course);
    }
}
