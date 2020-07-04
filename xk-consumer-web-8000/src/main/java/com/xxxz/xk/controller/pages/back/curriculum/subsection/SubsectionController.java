package com.xxxz.xk.controller.pages.back.curriculum.subsection;//package com.xxxz.xk.controller.pages.back.subsection;

import com.xxxz.xk.pojo.dto.PageDTO;
import com.xxxz.xk.pojo.dto.ResponseDTO;
import com.xxxz.xk.pojo.entity.Course;
import com.xxxz.xk.pojo.entity.Subsection;
import com.xxxz.xk.pojo.query.CourseQuery;
import com.xxxz.xk.pojo.query.SubsectionQuery;
import com.xxxz.xk.service.CurriculumServiceFeign;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * creator：djx
 * date: 2020/7/3
 */
@RestController
@RequestMapping("/back/subsection")
public class SubsectionController {

    @Resource
    CurriculumServiceFeign curriculumServiceFeign;

    /**
     * 对用户进行分页查询
     * 参数：
     * @param query
     * @return PageDTO分页信息
     */
    @RequestMapping("/listSubsection")
    PageDTO AjaxListSubsection(SubsectionQuery query){
        return curriculumServiceFeign.AjaxListSubsection(query);
    }
    /**
     * 对表进行添加操作
     * @param subsection
     * @return ResponseDTO状态码
     */
    @RequestMapping("/addSubsection")
    ResponseDTO addSubsection(Subsection subsection){
        return curriculumServiceFeign.addSubsection(subsection);
    }



    /**
     * 根据表主键执行删除数据操作
     * @param subsection
     * @return ResponseDTO状态码
     */
    @RequestMapping("/delSubsection")
    ResponseDTO delSubsection(Subsection subsection){
        return curriculumServiceFeign.delSubsection(subsection);
    }



    /**
     * 对表进行任意字段（除主键）进行修改
     * @param subsection
     * @return ResponseDTO状态码
     */
    @RequestMapping("/updateSubsection")
    ResponseDTO updateSubsection(Subsection subsection){
        return curriculumServiceFeign.updateSubsection(subsection);
    }

}
