package com.xxxz.xk.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * creator：Administrator
 * date: 2020/5/26
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageDTO implements Serializable {// 传递给layui使用的DTO对象
    //返回状态码
    private Integer code = 0;
    //返回消息
    private String msg = "";
    //查询总条数
    private Integer count = 0;
    //查询出的数据
    private Object data;
    //更多数据
    private Object moreData;
    //查询成功的静态方法，code默认0，msg默认成功
    public static PageDTO setPageData(Integer count, Object data) {
        return new PageDTO(0, "成功", count, data,null);
    }
    //查询成功的静态方法，code默认0，msg默认成功
    public static PageDTO setPageData(Integer count, Object data, Object moreData) {
        return new PageDTO(0, "成功", count, data,moreData);
    }
}
