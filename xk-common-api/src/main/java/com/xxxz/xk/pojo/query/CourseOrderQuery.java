package com.xxxz.xk.pojo.query;

import lombok.Data;

/**
 * @Author: LYK
 * @DateTime: 2020/7/4 10:27
 * @Description: TODO
 */
@Data
public class CourseOrderQuery extends PageQuery{
    private Long orderId;
    private Long userId;

}
