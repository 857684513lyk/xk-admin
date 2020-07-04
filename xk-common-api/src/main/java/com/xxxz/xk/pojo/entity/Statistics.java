package com.xxxz.xk.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * statistics
 * @author 
 */
@Data
public class Statistics implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 统计日期
     */
    private Date dateCalculated;

    /**
     * 每日注册人数
     */
    private Integer registerNum;

    /**
     * 每日登录人数
     */
    private Integer loginNum;

    /**
     * 每日播放视频数
     */
    private Integer videoViewNum;

    /**
     * 每日新增课程数
     */
    private Integer courseNum;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最近更新时间
     */
    private Date updateTime;

    /**
     * 今日订单成交数
     */
    private Integer orderCount;

    /**
     * 今日成交订单金额
     */
    private BigDecimal orderCost;

    private static final long serialVersionUID = 1L;
}