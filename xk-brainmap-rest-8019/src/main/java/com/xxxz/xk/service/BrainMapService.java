package com.xxxz.xk.service;

import com.xxxz.xk.pojo.dto.PageDTO;
import com.xxxz.xk.pojo.query.BrainMapQuery;

/**
 * @Author: LYK
 * @DateTime: 2020/7/7 14:12
 * @Description: TODO
 */
public interface BrainMapService {
    PageDTO ajaxListBrainMap(BrainMapQuery brainMapQuery);
}
