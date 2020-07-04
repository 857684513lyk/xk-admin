package com.xxxz.xk.rest;

import com.xxxz.xk.pojo.dto.PageDTO;
import com.xxxz.xk.pojo.query.CourseOrderQuery;
import com.xxxz.xk.service.CourseOrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: LYK
 * @DateTime: 2020/7/4 10:12
 * @Description: TODO
 */
@RestController
@RequestMapping("/back/courseOrder")
public class CourseOrderRest {
    @Resource
    CourseOrderService courseOrderService;

    /**
     * @Author: LYK
     * @Description: 根据UserId查找Order
     * @DateTime: 2020/7/4 10:19
     * @Params: [id]
     * @Return com.xxxz.xk.pojo.dto.PageDTO
     */
    @RequestMapping("/findOrderByUser")
    PageDTO findOrderByUser(CourseOrderQuery courseOrderQuery) {
        PageDTO pageDTO = courseOrderService.findOrderByUser(courseOrderQuery);
        return pageDTO;
    }
}
