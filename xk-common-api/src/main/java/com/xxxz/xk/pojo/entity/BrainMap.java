package com.xxxz.xk.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * brain_map
 * @author 
 */
@Data
public class BrainMap implements Serializable {
    /**
     * 脑图id
     */
    private Long id;

    /**
     * 脑图名称
     */
    private String name;

    /**
     * 脑图的地址
     */
    private String src;

    /**
     * 序号
     */
    private Integer sort;

    /**
     * 是否可见，默认可见
     */
    private Boolean visible;

    /**
     * 观看次数
     */
    private Integer watchCount;

    /**
     * 作者(user)id
     */
    private Long author;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最近更新时间
     */
    private Date updateTime;

    /**
     * 用户地址
     */
    private String userImg;

    /**
     * 用户昵称
     */
    private String nickName;

    private static final long serialVersionUID = 1L;
}