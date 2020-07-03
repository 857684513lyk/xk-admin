package com.xxxz.xk.dao;


import com.xxxz.xk.pojo.entity.Chapter;

public interface ChapterDao {
    int deleteByPrimaryKey(Long chapterId);

    int insert(Chapter record);

    int insertSelective(Chapter record);

    Chapter selectByPrimaryKey(Long chapterId);

    int updateByPrimaryKeySelective(Chapter record);

    int updateByPrimaryKey(Chapter record);
}