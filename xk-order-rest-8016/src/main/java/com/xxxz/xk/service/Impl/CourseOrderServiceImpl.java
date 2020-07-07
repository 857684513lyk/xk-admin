package com.xxxz.xk.service.Impl;

import com.xxxz.xk.dao.CourseOrderDao;
import com.xxxz.xk.pojo.dto.PageDTO;
import com.xxxz.xk.pojo.entity.CourseOrder;
import com.xxxz.xk.pojo.query.CourseOrderQuery;
import com.xxxz.xk.service.CourseOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: LYK
 * @DateTime: 2020/7/4 10:20
 * @Description: TODO
 */
@Service
public class CourseOrderServiceImpl implements CourseOrderService {

    @Resource
    CourseOrderDao courseOrderDao;


    @Override
    public PageDTO findOrderByUser(CourseOrderQuery courseOrderQuery) {
        List<CourseOrder> orderByUser = courseOrderDao.findOrderByUser(courseOrderQuery);
        int count = courseOrderDao.findOrderCountByUser(courseOrderQuery);
        return PageDTO.setPageData(count,orderByUser);
    }
}
