package com.xxxz.xk.controller;

import com.xxxz.xk.config.shiro.RedisSessionDAO;
import com.xxxz.xk.pojo.dto.ResponseDTO;
import com.xxxz.xk.pojo.query.UserQuery;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/**
 * @Classname LoginController
 * @Description TODO
 * @Date 2020/7/4 14:20
 * @CreateComputer by PC
 * @Created by cxd
 */
@RestController
public class LoginController extends  BaseController {
    @Resource
    RedisTemplate<String, Object> redisTemplate;

    @RequestMapping("/login")
    public ResponseDTO login(UserQuery userQuery){
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(userQuery.getUserName(),userQuery.getPassWord());
        Subject subject = SecurityUtils.getSubject();
        Session session = getSession();
        session.setAttribute("loginUser",userQuery);

        try {
            subject.login(usernamePasswordToken);
        }catch (AuthenticationException authenticationException){
            Integer e = (Integer)redisTemplate.opsForValue().get(userQuery.getUserName());
            redisTemplate.opsForValue().set(userQuery.getUserName() + "loginErroCount",e++,60, TimeUnit.MINUTES);
            return ResponseDTO.fail(authenticationException.getMessage());
        }
        return ResponseDTO.ok("登录成功");
    }


}
