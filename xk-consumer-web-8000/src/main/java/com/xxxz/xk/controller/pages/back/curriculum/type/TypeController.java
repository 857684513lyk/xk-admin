package com.xxxz.xk.controller.pages.back.curriculum.type;//package com.xxxz.xk.controller.pages.back.type;

import com.xxxz.xk.pojo.dto.PageDTO;
import com.xxxz.xk.pojo.dto.ResponseDTO;
import com.xxxz.xk.pojo.entity.Type;
import com.xxxz.xk.pojo.query.TypeQuery;
import com.xxxz.xk.service.CurriculumServiceFeign;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * creator：djx
 * date: 2020/7/3
 */
@RestController
@RequestMapping("/back/type")
public class TypeController {

    @Resource
    CurriculumServiceFeign curriculumServiceFeign;

    /**
     * 对用户进行分页查询
     * 参数：
     * @param query
     * @return PageDTO分页信息
     */
    @RequestMapping("/listType")
    PageDTO AjaxListCourse(TypeQuery query){
        return curriculumServiceFeign.AjaxListType(query);
    }


    /**
     * 对表进行添加操作
     * @param type
     * @return ResponseDTO状态码
     */
    @RequestMapping("/addType")
    ResponseDTO addType(Type type){
        return curriculumServiceFeign.addType(type);
    }

    /**
     * 根据表主键执行删除数据操作
     * @param type
     * @return ResponseDTO状态码
     */
    @RequestMapping("/delType")
    ResponseDTO delType(Type type){
        return curriculumServiceFeign.delType(type);
    }

    /**
     * 对表进行任意字段（除主键）进行修改
     * @param type
     * @return ResponseDTO状态码
     */
    @RequestMapping("/updateType")
    ResponseDTO updateType(Type type){
        return curriculumServiceFeign.updateType(type);
    }
}
