package com.xxxz.xk.service;

import com.xxxz.xk.pojo.dto.PageDTO;
import com.xxxz.xk.pojo.dto.ResponseDTO;
import com.xxxz.xk.pojo.entity.Chapter;
import com.xxxz.xk.pojo.query.ChapterQuery;

/**
 * creator：djx
 * date: 2020/7/4 13:36
 */
public interface ChapterService {
    PageDTO AjaxListChapter(ChapterQuery query);

    ResponseDTO addChapter(Chapter chapter);

    ResponseDTO delChapter(Chapter chapter);

    ResponseDTO  updateChapter(Chapter chapter);
}
