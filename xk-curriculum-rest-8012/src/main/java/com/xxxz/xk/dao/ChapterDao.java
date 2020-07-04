package com.xxxz.xk.dao;

import com.xxxz.xk.pojo.entity.Chapter;
import com.xxxz.xk.pojo.query.ChapterQuery;
import com.xxxz.xk.pojo.vo.ChapterVO;

import java.util.List;

public interface ChapterDao {
    int deleteByPrimaryKey(Long chapterId);

    int insert(Chapter record);

    int insertSelective(Chapter record);

    Chapter selectByPrimaryKey(Long chapterId);

    int updateByPrimaryKeySelective(Chapter record);

    int updateByPrimaryKey(Chapter record);

    List<ChapterVO>  listChapterDao(ChapterQuery query);

    Integer  listChapterDaoCount(ChapterQuery query);
}