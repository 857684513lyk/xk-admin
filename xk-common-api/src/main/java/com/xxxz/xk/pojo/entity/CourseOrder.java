package com.xxxz.xk.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * course_order
 * @author 
 */
@Data
public class CourseOrder implements Serializable {
    /**
     * 订单编号
     */
    private Long orderId;

    /**
     * 付款状态：待付款，待发货，待收货，待评价，已取消，退款中，已退款
     */
    private String payStatus;

    /**
     * 收货人
     */
    private String receiverName;

    /**
     * 收货人电话
     */
    private String receiverPhone;

    /**
     * 下单时间
     */
    private Date createTime;

    /**
     * 付款时间
     */
    private Date payTime;

    /**
     * 付款方式：支付宝，微信，余额付款
     */
    private String payType;

    /**
     * 优惠券减免
     */
    private BigDecimal couponRelief;

    /**
     * 红包减免
     */
    private String redBagRelief;

    /**
     * 订单备注
     */
    private String note;

    /**
     * 实际付款金额
     */
    private BigDecimal actuallyPaid;

    /**
     * 订单总金额
     */
    private BigDecimal allCost;

    /**
     * 总减免
     */
    private BigDecimal allRelief;

    /**
     * 用户id,是哪个用户的
     */
    private Long userId;

    /**
     * 推荐人的id（根据推荐人，推荐人将得到佣金）
     */
    private Long recommender;

    private static final long serialVersionUID = 1L;
}