package com.xxxz.xk.service.impl;

import com.xxxz.xk.dao.ChapterDao;
import com.xxxz.xk.pojo.dto.PageDTO;
import com.xxxz.xk.pojo.dto.ResponseDTO;
import com.xxxz.xk.pojo.entity.Chapter;
import com.xxxz.xk.pojo.query.ChapterQuery;
import com.xxxz.xk.pojo.vo.ChapterVO;
import com.xxxz.xk.service.ChapterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * creator：djx
 * date: 2020/7/4 13:36
 */
@Service
public class ChapterServiceImpl implements ChapterService {
    @Resource
    ChapterDao chapterDao;
    @Override
    public PageDTO AjaxListChapter(ChapterQuery query) {
        List<ChapterVO> list = chapterDao.listChapterDao(query);
        Integer count = chapterDao.listChapterDaoCount(query);
        return PageDTO.setPageData(count,list);
    }

    @Override
    public ResponseDTO addChapter(Chapter chapter) {
        return ResponseDTO.get(chapterDao.insertSelective(chapter));
    }

    @Override
    public ResponseDTO delChapter(Chapter chapter) {
        return ResponseDTO.get(chapterDao.deleteByPrimaryKey(chapter.getChapterId()));
    }

    @Override
    public ResponseDTO updateChapter(Chapter chapter) {
        return ResponseDTO.get(chapterDao.updateByPrimaryKeySelective(chapter));
    }
}
