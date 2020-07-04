package com.xxxz.xk.service.impl;

import com.xxxz.xk.dao.TypeDao;
import com.xxxz.xk.pojo.dto.PageDTO;
import com.xxxz.xk.pojo.dto.ResponseDTO;
import com.xxxz.xk.pojo.entity.Type;
import com.xxxz.xk.pojo.query.TypeQuery;
import com.xxxz.xk.pojo.vo.TypeVO;
import com.xxxz.xk.service.TypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * creator：djx
 * date: 2020/7/4 14:53
 */
@Service
public class TypeServiceImpl implements TypeService {
    @Resource
    TypeDao typeDao;
    @Override
    public PageDTO AjaxListType(TypeQuery query) {
        List<TypeVO> list = typeDao.listType(query);
        Integer count = typeDao.listTypeCount(query);
        return PageDTO.setPageData(count,list);
    }

    @Override
    public ResponseDTO addType(Type type) {
        return ResponseDTO.get(typeDao.insertSelective(type));
    }

    @Override
    public ResponseDTO delType(Type type) {
        return ResponseDTO.get(typeDao.deleteByPrimaryKey(type.getTypeId()));

    }

    @Override
    public ResponseDTO updateType(Type type) {
        return ResponseDTO.get(typeDao.updateByPrimaryKeySelective(type));

    }
}
