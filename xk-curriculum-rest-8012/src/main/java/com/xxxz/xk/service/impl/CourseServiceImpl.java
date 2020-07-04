package com.xxxz.xk.service.impl;

import com.xxxz.xk.dao.CourseDao;
import com.xxxz.xk.pojo.dto.PageDTO;
import com.xxxz.xk.pojo.dto.ResponseDTO;
import com.xxxz.xk.pojo.entity.Course;
import com.xxxz.xk.pojo.query.CourseQuery;
import com.xxxz.xk.pojo.vo.CourseVO;
import com.xxxz.xk.service.CourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * creator：djx
 * date: 2020/7/4 9:46
 */
@Service
public class CourseServiceImpl implements CourseService {
    @Resource
    CourseDao courseDao;
    @Override
    public PageDTO AjaxListCourse(CourseQuery query) {
        List<CourseVO> list = courseDao.listCourse(query);
        Integer count = courseDao.listCourseCount(query);
        return PageDTO.setPageData(count,list);
    }

    @Override
    public ResponseDTO addCourse(Course course) {
        return ResponseDTO.get(courseDao.insertSelective(course));
    }

    @Override
    public ResponseDTO delCourse(Course course) {
        return ResponseDTO.get(courseDao.deleteByPrimaryKey(course.getCourseId())==1);
    }

    @Override
    public ResponseDTO updateCourse(Course course) {
        return ResponseDTO.get(courseDao.updateByPrimaryKeySelective(course));
    }
}
