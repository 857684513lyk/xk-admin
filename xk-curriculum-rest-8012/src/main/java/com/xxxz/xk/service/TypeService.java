package com.xxxz.xk.service;

import com.xxxz.xk.pojo.dto.PageDTO;
import com.xxxz.xk.pojo.dto.ResponseDTO;
import com.xxxz.xk.pojo.entity.Type;
import com.xxxz.xk.pojo.query.TypeQuery;

/**
 * creator：djx
 * date: 2020/7/4 14:53
 */
public interface TypeService {
    PageDTO  AjaxListType(TypeQuery query);

    ResponseDTO addType(Type type);

    ResponseDTO delType(Type type);

    ResponseDTO  updateType(Type type);
}
