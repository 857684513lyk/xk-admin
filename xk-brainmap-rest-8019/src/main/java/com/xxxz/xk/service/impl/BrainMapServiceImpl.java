package com.xxxz.xk.service.impl;

import com.xxxz.xk.dao.BrainMapDao;
import com.xxxz.xk.pojo.dto.PageDTO;
import com.xxxz.xk.pojo.query.BrainMapQuery;
import com.xxxz.xk.pojo.vo.BrainMapVO;
import com.xxxz.xk.service.BrainMapService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: LYK
 * @DateTime: 2020/7/7 14:12
 * @Description: TODO
 */
@Service
public class BrainMapServiceImpl implements BrainMapService {
    @Resource
    BrainMapDao brainMapDao;

    /**
    * @Author: LYK
    * @Description: 分页查询
    * @DateTime: 2020/7/7 14:26
    * @Params: [brainMapQuery]
    * @Return com.xxxz.xk.pojo.dto.PageDTO
    */
    @Override
    public PageDTO ajaxListBrainMap(BrainMapQuery brainMapQuery) {
        List<BrainMapVO> list = brainMapDao.ajaxListBrainMap(brainMapQuery);
        int count = brainMapDao.ajaxListBrainMapCount(brainMapQuery);
        return PageDTO.setPageData(count, list);
    }
}
