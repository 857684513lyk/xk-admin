package com.xxxz.xk.rest.user;

import com.xxxz.xk.pojo.dto.ResponseDTO;
import com.xxxz.xk.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * creator：djx
 * date: 2020/7/3
 */
@RestController
@RequestMapping("user")
public class UserRest {
    @Resource
    UserService userService;

    @RequestMapping("findUserById/{id}")
    ResponseDTO findUserById(@PathVariable Long id) {
        return userService.findUserById(id);
    }
}
