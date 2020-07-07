package com.xxxz.xk.dao;


import com.xxxz.xk.pojo.entity.BrainMap;
import com.xxxz.xk.pojo.query.BrainMapQuery;
import com.xxxz.xk.pojo.vo.BrainMapVO;

import java.util.List;

public interface BrainMapDao {
    int deleteByPrimaryKey(Long id);

    int insert(BrainMap record);

    int insertSelective(BrainMap record);

    BrainMap selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BrainMap record);

    int updateByPrimaryKey(BrainMap record);

    List<BrainMapVO> ajaxListBrainMap(BrainMapQuery brainMapQuery);

    int ajaxListBrainMapCount(BrainMapQuery brainMapQuery);
}