package com.xxxz.xk.pojo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * exception_error
 * @author 
 */
@Data
public class ExceptionError implements Serializable {
    /**
     * 异常错误id
     */
    private Long exceptionErrorId;

    /**
     * 异常错误描述
     */
    private String title;

    /**
     * 异常详情（富文本）
     */
    private String detail;

    /**
     * 回答的答案
     */
    private String answer;

    /**
     * 可信度
     */
    private Integer credibility;

    /**
     * 答题者头像
     */
    private String userImg;

    /**
     * 答题者昵称
     */
    private String nickName;

    /**
     * 答题者id
     */
    private Long author;

    private static final long serialVersionUID = 1L;
}