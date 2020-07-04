package com.xxxz.xk.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * order_item
 * @author 
 */
@Data
public class OrderItem implements Serializable {
    /**
     * 订单详情id
     */
    private Long orderItemId;

    /**
     * 课程id
     */
    private Long courseId;

    /**
     * 课程名称
     */
    private String title;

    /**
     * 课程价格
     */
    private BigDecimal price;

    /**
     * 课程图片
     */
    private String img;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 订单id
     */
    private Long orderId;

    private static final long serialVersionUID = 1L;
}