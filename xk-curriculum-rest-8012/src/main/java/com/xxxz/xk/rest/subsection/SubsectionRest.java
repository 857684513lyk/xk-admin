package com.xxxz.xk.rest.subsection;

import com.xxxz.xk.pojo.dto.PageDTO;
import com.xxxz.xk.pojo.dto.ResponseDTO;
import com.xxxz.xk.pojo.entity.Subsection;
import com.xxxz.xk.pojo.query.SubsectionQuery;
import com.xxxz.xk.service.SubsectionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * creator：djx
 * date: 2020/7/4 9:39
 */
@RestController
@RequestMapping("curriculum")
public class SubsectionRest {
    @Resource
    SubsectionService subsectionService;

    @RequestMapping("/listSubsection")
    PageDTO AjaxListSubsection(SubsectionQuery query){
        return subsectionService.AjaxListSubsection(query);
    }
    @RequestMapping("/addSubsection")
    ResponseDTO addSubsection(Subsection subsection){
        return subsectionService.addSubsection(subsection);
    }

    @RequestMapping("/delSubsection")
    ResponseDTO delSubsection(Subsection subsection){
        return subsectionService.delSubsection(subsection);
    }

    @RequestMapping("/updateSubsection")
    ResponseDTO updateSubsection(Subsection subsection){
        return subsectionService.updateSubsection(subsection);
    }
}
