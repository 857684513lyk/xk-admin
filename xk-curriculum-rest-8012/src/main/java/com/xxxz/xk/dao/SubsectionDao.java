package com.xxxz.xk.dao;

import com.xxxz.xk.pojo.entity.Subsection;
import com.xxxz.xk.pojo.query.SubsectionQuery;
import com.xxxz.xk.pojo.vo.SubsectionVO;

import java.util.List;

public interface SubsectionDao {
    int deleteByPrimaryKey(Long id);

    int insert(Subsection record);

    int insertSelective(Subsection record);

    Subsection selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Subsection record);

    int updateByPrimaryKey(Subsection record);

    List<SubsectionVO>  listSubsection(SubsectionQuery query);

    Integer  listSubsectionCount(SubsectionQuery query);
}