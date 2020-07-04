package com.xxxz.xk.rest.chapter;

import com.xxxz.xk.pojo.dto.PageDTO;
import com.xxxz.xk.pojo.dto.ResponseDTO;
import com.xxxz.xk.pojo.entity.Chapter;
import com.xxxz.xk.pojo.query.ChapterQuery;
import com.xxxz.xk.service.ChapterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * creator：djx
 * date: 2020/7/4 9:39
 */
@RestController
@RequestMapping("curriculum")
public class ChapterRest {
    @Resource
    ChapterService chapterService;

    @RequestMapping("/listChapter")
    PageDTO AjaxListChapter(ChapterQuery query){
        return chapterService.AjaxListChapter(query);
    }
    @RequestMapping("/addChapter")
    ResponseDTO addChapter(Chapter chapter){
        return chapterService.addChapter(chapter);
    }

    @RequestMapping("/delChapter")
    ResponseDTO delChapter(Chapter chapter){
        return chapterService.delChapter(chapter);
    }

    @RequestMapping("/updateChapter")
    ResponseDTO updateChapter(Chapter chapter){
        return chapterService.updateChapter(chapter);
    }
}
