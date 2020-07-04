package com.xxxz.xk.pojo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * audition
 * @author 
 */
@Data
public class Audition implements Serializable {
    /**
     * 面试id
     */
    private Long auditionId;

    /**
     * 面试题目
     */
    private String title;

    /**
     * 面试题答案（富文本）
     */
    private String answer;

    /**
     * 回答者id
     */
    private Long author;

    /**
     * 回答者的昵称
     */
    private String nickName;

    /**
     * 回答者的头像地址
     */
    private String userImg;

    /**
     * 可信度（答案可信度）0-100
     */
    private Integer credibility;

    private static final long serialVersionUID = 1L;
}