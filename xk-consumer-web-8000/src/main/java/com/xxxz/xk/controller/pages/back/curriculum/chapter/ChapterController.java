package com.xxxz.xk.controller.pages.back.curriculum.chapter;//package com.xxxz.xk.controller.pages.back.chapter;

import com.xxxz.xk.pojo.dto.PageDTO;
import com.xxxz.xk.pojo.dto.ResponseDTO;
import com.xxxz.xk.pojo.entity.Chapter;
import com.xxxz.xk.pojo.entity.Course;
import com.xxxz.xk.pojo.query.ChapterQuery;
import com.xxxz.xk.pojo.query.CourseQuery;
import com.xxxz.xk.service.CurriculumServiceFeign;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * creator：djx
 * date: 2020/7/3
 */
@RestController
@RequestMapping("/back/chapter")
public class ChapterController {

    @Resource
    CurriculumServiceFeign curriculumServiceFeign;

    /**
     * 对用户进行分页查询
     * 参数：
     * @param query
     * @return PageDTO分页信息
     */
    @RequestMapping("/listChapter")
    PageDTO AjaxListCourse(ChapterQuery query){
        return curriculumServiceFeign.AjaxListChapter(query);
    }


    /**
     * 对表进行添加操作
     * @param chapter
     * @return ResponseDTO状态码
     */
    @RequestMapping("/addChapter")
    ResponseDTO addChapter(Chapter chapter){
        return curriculumServiceFeign.addChapter(chapter);
    }

    /**
     * 根据表主键执行删除数据操作
     * @param chapter
     * @return ResponseDTO状态码
     */
    @RequestMapping("/delChapter")
    ResponseDTO delChapter(Chapter chapter){
        return curriculumServiceFeign.delChapter(chapter);
    }

    /**
     * 对表进行任意字段（除主键）进行修改
     * @param chapter
     * @return ResponseDTO状态码
     */
    @RequestMapping("/updateChapter")
    ResponseDTO updateChapter(Chapter chapter){
        return curriculumServiceFeign.updateChapter(chapter);
    }
}
