package com.xxxz.xk.pojo.query;

import lombok.Data;

/**
 * creator：djx
 * date: 2020/7/3
 */
@Data
public class UserQuery extends PageQuery {

    private String userName;
    private String passWord;
    private String code;
//    private String IsCodeLogin;

}
