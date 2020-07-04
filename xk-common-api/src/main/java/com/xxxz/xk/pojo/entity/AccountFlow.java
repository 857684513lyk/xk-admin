package com.xxxz.xk.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * account_flow
 * @author 
 */
@Data
public class AccountFlow implements Serializable {
    /**
     * 账户流水id
     */
    private Long account_flow_id;

    /**
     * 用户id
     */
    private Long user_id;

    /**
     * 收款多少
     */
    private BigDecimal receive;

    /**
     * 付款多少
     */
    private BigDecimal pay;

    /**
     * 当前余额多少钱
     */
    private BigDecimal balance;

    /**
     * 收了多少学币
     */
    private BigDecimal xb_receive;

    /**
     * 付了多少学币
     */
    private BigDecimal xb_pay;

    /**
     * 学币余额
     */
    private BigDecimal xb_balance;

    /**
     * 凭证，图片形式
     */
    private String voucher;

    /**
     * 交易备注
     */
    private String note;

    /**
     * 创建时间
     */
    private Date create_time;

    private static final long serialVersionUID = 1L;
}