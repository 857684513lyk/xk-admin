package com.xxxz.xk.controller.pages.back.curriculum.course;

import com.xxxz.xk.pojo.dto.PageDTO;
import com.xxxz.xk.pojo.dto.ResponseDTO;
import com.xxxz.xk.pojo.entity.Chapter;
import com.xxxz.xk.pojo.entity.Course;
import com.xxxz.xk.pojo.entity.Subsection;
import com.xxxz.xk.pojo.entity.Type;
import com.xxxz.xk.pojo.query.ChapterQuery;
import com.xxxz.xk.pojo.query.CourseQuery;
import com.xxxz.xk.pojo.query.SubsectionQuery;
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
@RequestMapping("/back/course")
public class CourseController {

    @Resource
    CurriculumServiceFeign curriculumServiceFeign;

    /**
     * 对课程表进行分页查询
     * 参数：
     * @param query
     * @return PageDTO分页信息
     */
    @RequestMapping("/listCourse")
    PageDTO AjaxListCourse(CourseQuery query){
        return curriculumServiceFeign.AjaxListCourse(query);
    }


    /**
     * 对课程表进行添加操作
     * @param course
     * @return ResponseDTO状态码
     */
    @RequestMapping("/addCourse")
    ResponseDTO addCourse(Course course){
        return curriculumServiceFeign.addCourse(course);
    }

    /**
     * 根据课程表主键执行删除数据操作
     * @param course
     * @return ResponseDTO状态码
     */
    @RequestMapping("/delCourse")
    ResponseDTO delCourse(Course course){
        return curriculumServiceFeign.delCourse(course);
    }

    /**
     * 对课程表进行任意字段（除主键）进行修改
     * @param course
     * @return ResponseDTO状态码
     */
    @RequestMapping("/updateCourse")
    ResponseDTO updateCourse(Course course){
        return curriculumServiceFeign.updateCourse(course);
    }

//    //以下是Chapter表的操作
//
//
//
//    /**
//     * 对章节表进行分页查询
//     * 参数：
//     * @param query
//     * @return PageDTO分页信息
//     */
//    @RequestMapping("/listChapter")
//    PageDTO AjaxListCourse(ChapterQuery query){
//        return courseServiceFeign.AjaxListChapter(query);
//    }
//
//
//    /**
//     * 对章节表进行添加操作
//     * @param chapter
//     * @return ResponseDTO状态码
//     */
//    @RequestMapping("/addChapter")
//    ResponseDTO addChapter(Chapter chapter){
//        return courseServiceFeign.addChapter(chapter);
//    }
//
//    /**
//     * 根据章节表主键执行删除数据操作
//     * @param chapter
//     * @return ResponseDTO状态码
//     */
//    @RequestMapping("/delChapter")
//    ResponseDTO delChapter(Chapter chapter){
//        return courseServiceFeign.delChapter(chapter);
//    }
//
//    /**
//     * 对章节表进行任意字段（除主键）进行修改
//     * @param chapter
//     * @return ResponseDTO状态码
//     */
//    @RequestMapping("/updateChapter")
//    ResponseDTO updateChapter(Chapter chapter){
//        return courseServiceFeign.updateChapter(chapter);
//    }
//
//
//
//
//
//    //以下是小节表(Subsection)表操作
//    /**
//     * 对小节表进行分页查询
//     * 参数：
//     * @param query
//     * @return PageDTO分页信息
//     */
//    @RequestMapping("/listSubsection")
//    PageDTO AjaxListSubsection(SubsectionQuery query){
//        return courseServiceFeign.AjaxListSubsection(query);
//    }
//    /**
//     * 对小节表进行添加操作
//     * @param subsection
//     * @return ResponseDTO状态码
//     */
//    @RequestMapping("/addSubsection")
//    ResponseDTO addSubsection(Subsection subsection){
//        return courseServiceFeign.addSubsection(subsection);
//    }
//
//    /**
//     * 根据小节表主键执行删除数据操作
//     * @param subsection
//     * @return ResponseDTO状态码
//     */
//    @RequestMapping("/delSubsection")
//    ResponseDTO delSubsection(Subsection subsection){
//        return courseServiceFeign.delSubsection(subsection);
//    }
//    /**
//     * 对小节表进行任意字段（除主键）进行修改
//     * @param subsection
//     * @return ResponseDTO状态码
//     */
//    @RequestMapping("/updateSubsection")
//    ResponseDTO updateSubsection(Subsection subsection){
//        return courseServiceFeign.updateSubsection(subsection);
//    }
//
////    以下是对课程类型表进行操作
//    /**
//     * 对用户进行分页查询
//     * 参数：
//     * @param query
//     * @return PageDTO分页信息
//     */
//    @RequestMapping("/listType")
//    PageDTO AjaxListCourse(TypeQuery query){
//        return courseServiceFeign.AjaxListType(query);
//    }
//
//
//    /**
//     * 对表进行添加操作
//     * @param type
//     * @return ResponseDTO状态码
//     */
//    @RequestMapping("/addType")
//    ResponseDTO addType(Type type){
//        return courseServiceFeign.addType(type);
//    }
//
//    /**
//     * 根据表主键执行删除数据操作
//     * @param type
//     * @return ResponseDTO状态码
//     */
//    @RequestMapping("/delType")
//    ResponseDTO delType(Type type){
//        return courseServiceFeign.delType(type);
//    }
//
//    /**
//     * 对表进行任意字段（除主键）进行修改
//     * @param type
//     * @return ResponseDTO状态码
//     */
//    @RequestMapping("/updateType")
//    ResponseDTO updateType(Type type){
//        return courseServiceFeign.updateType(type);
//    }

}
