package com.xxxz.xk.rest.type;

import com.xxxz.xk.pojo.dto.PageDTO;
import com.xxxz.xk.pojo.dto.ResponseDTO;
import com.xxxz.xk.pojo.entity.Type;
import com.xxxz.xk.pojo.query.TypeQuery;
import com.xxxz.xk.service.TypeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * creator：djx
 * date: 2020/7/4 9:39
 */
@RestController
@RequestMapping("curriculum")
public class TypeRest {
    @Resource
    TypeService typeService;

    @RequestMapping("/listType")
    PageDTO AjaxListType(TypeQuery query){
        return typeService.AjaxListType(query);
    }
    @RequestMapping("/addType")
    ResponseDTO addType(Type type){
        return typeService.addType(type);
    }

    @RequestMapping("/delType")
    ResponseDTO delType(Type type){
        return typeService.delType(type);
    }

    @RequestMapping("/updateType")
    ResponseDTO updateType(Type type){
        return typeService.updateType(type);
    }
}
