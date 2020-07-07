package com.xxxz.xk.rest;

import com.xxxz.xk.pojo.dto.PageDTO;
import com.xxxz.xk.pojo.query.BrainMapQuery;
import com.xxxz.xk.service.BrainMapService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: LYK
 * @DateTime: 2020/7/7 14:10
 * @Description: TODO
 */
@RequestMapping
@RestController
public class BrainMapRest {

    @Resource
    BrainMapService brainMapService;

    /**
    * @Author: LYK
    * @Description: 分页查询
    * @DateTime: 2020/7/7 14:27
    * @Params: [brainMapQuery]
    * @Return com.xxxz.xk.pojo.dto.PageDTO
    */  
    @RequestMapping
    PageDTO ajaxListBrainMap(BrainMapQuery brainMapQuery){
        return brainMapService.ajaxListBrainMap(brainMapQuery);
    }

}
