package com.xxxz.xk.service;


import com.xxxz.xk.config.feign.FeignClientConfig;
import com.xxxz.xk.pojo.dto.PageDTO;
import com.xxxz.xk.pojo.dto.ResponseDTO;
import com.xxxz.xk.pojo.entity.Chapter;
import com.xxxz.xk.pojo.entity.Course;
import com.xxxz.xk.pojo.entity.Subsection;
import com.xxxz.xk.pojo.entity.Type;
import com.xxxz.xk.pojo.query.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * creator：djx
 * date: 2020/7/4
 */
@FeignClient(value = "curriculum-rest", path = "curriculum", configuration = FeignClientConfig.class)
public interface CurriculumServiceFeign {

    /**
     * 对课程表进行分页查询
     * 参数：
     * @param query
     * @return PageDTO分页信息
     */
    @RequestMapping("/listCourse")
    PageDTO AjaxListCourse(CourseQuery query);


    /**
     * 对课程表进行添加操作
     * @param course
     * @return ResponseDTO状态码
     */
    @RequestMapping("/addCourse")
    ResponseDTO addCourse(Course course);

    /**
     * 根据课程表主键执行删除数据操作
     * @param course
     * @return ResponseDTO状态码
     */
    @RequestMapping("/delCourse")
    ResponseDTO delCourse(Course course);

    /**
     * 对课程表进行任意字段（除主键）进行修改
     * @param course
     * @return ResponseDTO状态码
     */
    @RequestMapping("/updateCourse")
    ResponseDTO updateCourse(Course course);


    //以下是chapter表操作

    /**
     * 对章节表进行分页查询
     * 参数：
     * @param query
     * @return PageDTO分页信息
     */
    @RequestMapping("/listChapter")
    PageDTO AjaxListChapter(ChapterQuery query);


    /**
     * 对章节表进行添加操作
     * @param chapter
     * @return ResponseDTO状态码
     */
    @RequestMapping("/addChapter")
    ResponseDTO addChapter(Chapter chapter);

    /**
     * 根据章节表主键执行删除数据操作
     * @param chapter
     * @return ResponseDTO状态码
     */
    @RequestMapping("/delChapter")
    ResponseDTO delChapter(Chapter chapter);

    /**
     * 对章节表进行任意字段（除主键）进行修改
     * @param chapter
     * @return ResponseDTO状态码
     */
    @RequestMapping("/updateChapter")
    ResponseDTO updateChapter(Chapter chapter);

//以下是小节表(subsection)的操作

    /**
     * 对小节表进行分页查询
     * 参数：
     * @param query
     * @return PageDTO分页信息
     */
    @RequestMapping("/listSubsection")
    PageDTO AjaxListSubsection(SubsectionQuery query);



    /**
     * 对小节表进行添加操作
     * @param subsection
     * @return ResponseDTO状态码
     */
    @RequestMapping("/addSubsection")
    ResponseDTO addSubsection(Subsection subsection);



    /**
     * 根据小节表主键执行删除数据操作
     * @param subsection
     * @return ResponseDTO状态码
     */
    @RequestMapping("/delSubsection")
    ResponseDTO delSubsection(Subsection subsection);



    /**
     * 对小节表进行任意字段（除主键）进行修改
     * @param subsection
     * @return ResponseDTO状态码
     */
    @RequestMapping("/updateSubsection")
    ResponseDTO updateSubsection(Subsection subsection);

//以下是课程类型表(type)的操作
    /**
     * 对用户进行分页查询
     * 参数：
     * @param query
     * @return PageDTO分页信息
     */
    @RequestMapping("/listType")
    PageDTO AjaxListType(TypeQuery query);


    /**
     * 对表进行添加操作
     * @param type
     * @return ResponseDTO状态码
     */
    @RequestMapping("/addType")
    ResponseDTO addType(Type type);

    /**
     * 根据表主键执行删除数据操作
     * @param type
     * @return ResponseDTO状态码
     */
    @RequestMapping("/delType")
    ResponseDTO delType(Type type);

    /**
     * 对表进行任意字段（除主键）进行修改
     * @param type
     * @return ResponseDTO状态码
     */
    @RequestMapping("/updateType")
    ResponseDTO updateType(Type type);


}
