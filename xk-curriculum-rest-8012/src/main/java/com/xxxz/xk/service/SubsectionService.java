package com.xxxz.xk.service;

import com.xxxz.xk.pojo.dto.PageDTO;
import com.xxxz.xk.pojo.dto.ResponseDTO;
import com.xxxz.xk.pojo.entity.Subsection;
import com.xxxz.xk.pojo.query.SubsectionQuery;

/**
 * creator：djx
 * date: 2020/7/4 13:04
 */
public interface SubsectionService {
    PageDTO  AjaxListSubsection(SubsectionQuery query);

    ResponseDTO addSubsection(Subsection subsection);

    ResponseDTO delSubsection(Subsection subsection);

    ResponseDTO  updateSubsection(Subsection subsection);
}
