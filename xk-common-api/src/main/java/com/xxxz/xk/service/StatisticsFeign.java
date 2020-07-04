package com.xxxz.xk.service;

import com.xxxz.xk.config.feign.FeignClientConfig;
import com.xxxz.xk.pojo.dto.PageDTO;
import com.xxxz.xk.pojo.dto.ResponseDTO;
import com.xxxz.xk.pojo.entity.Statistics;
import com.xxxz.xk.pojo.query.StatisticsQuery;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@FeignClient(value = "statistics-rest", path = "statistics", configuration = FeignClientConfig.class)
public interface StatisticsFeign {
    /**
     * @param id 数据统计id
     * @return 返回面试题信息
     */
    @RequestMapping("/findStatisticsById/{id}")
    ResponseDTO findStatisticsById(@PathVariable Long id);// 第一种路径传参

    /**
     * 对面试题进行分页查询
     * 参数：
     * @param query
     * @return PageDTO分页信息
     */
    @RequestMapping("/listStatistics")
    PageDTO listStatistics(StatisticsQuery query);// 第二种：最喜欢 post里边body放的参数

    @RequestMapping("/addStatistics")
    ResponseDTO addAudition(Statistics statistics);

    @RequestMapping("/deleteStatistics")
    ResponseDTO deleteStatistics(Statistics statistics);

    @RequestMapping("/updateStatistics")
    ResponseDTO updateStatistics(Statistics statistics);
}
