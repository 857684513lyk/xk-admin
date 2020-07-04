package com.xxxz.xk.service;

import com.xxxz.xk.pojo.dto.PageDTO;
import com.xxxz.xk.pojo.query.CourseOrderQuery;

/**
 * @Author: LYK
 * @DateTime: 2020/7/4 10:19
 * @Description: TODO
 */
public interface CourseOrderService {

    PageDTO findOrderByUser(CourseOrderQuery courseOrderQuery);
}
