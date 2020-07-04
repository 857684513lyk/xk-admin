package com.xxxz.xk.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * comment
 * @author 
 */
@Data
public class Comment implements Serializable {
    /**
     * 评价id
     */
    private Long id;

    /**
     * 内容
     */
    private String content;

    /**
     * 发表时间
     */
    private Date createTime;

    /**
     * 评价用户
     */
    private Long userId;

    /**
     * 分数：1到5星
     */
    private Integer score;

    /**
     * 评价的状态：默认是可以展示
     */
    private Boolean status;

    /**
     * 讲师回复
     */
    private String reply;

    /**
     * 那个课程的评论
     */
    private Long courseId;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 评论者的头像地址
     */
    private String userPic;

    /**
     * 评论者的昵称
     */
    private String nickName;

    private static final long serialVersionUID = 1L;
}