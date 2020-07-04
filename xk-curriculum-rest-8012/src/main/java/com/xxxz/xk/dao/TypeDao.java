package com.xxxz.xk.dao;

import com.xxxz.xk.pojo.entity.Type;
import com.xxxz.xk.pojo.query.TypeQuery;
import com.xxxz.xk.pojo.vo.TypeVO;

import java.util.List;

public interface TypeDao {
    int deleteByPrimaryKey(Integer typeId);

    int insert(Type record);

    int insertSelective(Type record);

    Type selectByPrimaryKey(Integer typeId);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);

    List<TypeVO>  listType(TypeQuery query);

    Integer  listTypeCount(TypeQuery query);
}