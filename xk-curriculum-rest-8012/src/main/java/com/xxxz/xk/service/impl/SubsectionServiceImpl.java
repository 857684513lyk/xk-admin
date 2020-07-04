package com.xxxz.xk.service.impl;

import com.xxxz.xk.dao.SubsectionDao;
import com.xxxz.xk.pojo.dto.PageDTO;
import com.xxxz.xk.pojo.dto.ResponseDTO;
import com.xxxz.xk.pojo.entity.Subsection;
import com.xxxz.xk.pojo.query.SubsectionQuery;
import com.xxxz.xk.pojo.vo.SubsectionVO;
import com.xxxz.xk.service.SubsectionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * creator：djx
 * date: 2020/7/4 13:05
 */
@Service
public class SubsectionServiceImpl implements SubsectionService {
    @Resource
    SubsectionDao subsectionDao;
    @Override
    public PageDTO AjaxListSubsection(SubsectionQuery query) {
        List<SubsectionVO> list = subsectionDao.listSubsection(query);
        Integer count = subsectionDao.listSubsectionCount(query);
        return PageDTO.setPageData(count,list);
    }

    @Override
    public ResponseDTO addSubsection(Subsection subsection) {
        return ResponseDTO.get(subsectionDao.insertSelective(subsection));
    }

    @Override
    public ResponseDTO delSubsection(Subsection subsection) {
        return ResponseDTO.get(subsectionDao.deleteByPrimaryKey(subsection.getId()));
    }

    @Override
    public ResponseDTO updateSubsection(Subsection subsection) {
        return ResponseDTO.get(subsectionDao.updateByPrimaryKeySelective(subsection));
    }
}
