package com.xxxz.xk.controller.pages.back.user;

import com.xxxz.xk.pojo.dto.ResponseDTO;
import com.xxxz.xk.service.UserServiceFeign;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * creator：djx
 * date: 2020/7/3
 */
@RestController
@RequestMapping("/back/user")
public class UserController {

    @Resource
    UserServiceFeign userServiceFeign;

    @RequestMapping("findUserById/{id}")
    ResponseDTO findUserById(@PathVariable Long id) {
        return userServiceFeign.findUserById(id);
    }

}
