package com.xxxz.xk.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @Classname BaseController
 * @Description TODO
 * @Date 2020/7/4 14:41
 * @CreateComputer by PC
 * @Created by cxd
 */
@Component
public class BaseController {


    public HttpServletRequest getRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }

    protected Session getSession() {// 获取shiro自己的session
        return SecurityUtils.getSubject().getSession();
    }

    protected Long getUserId() {// 获取当前用户id
        return (Long) getSession().getAttribute("userId");
    }

    protected String getPhone() {// 获取当前用户手机
        return (String) getSession().getAttribute("phone");
    }

}
