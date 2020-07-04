package com.xxxz.xk.rest.user;

import com.xxxz.xk.pojo.dto.ResponseDTO;
import com.xxxz.xk.pojo.entity.User;
import com.xxxz.xk.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Classname UserRest
 * @Description TODO
 * @Date 2020/7/4 15:20
 * @CreateComputer by PC
 * @Created by cxd
 */
@RestController
@RequestMapping("user")
public class UserRest {
    @Resource
    UserService userService;

    @RequestMapping("checkPhoneExist")
    public boolean checkPhoneExist(String phone){

        return userService.checkPhoneExist(phone);
    }


    @RequestMapping("/loginByPhone")
    public User loginByPhone(String phone){

        return userService.loginByPhone(phone);
    }


    @RequestMapping("add")
    ResponseDTO add(User dbUser){

        return userService.add(dbUser);
    }

    @RequestMapping("findUserRolesByPhone")
    ResponseDTO findUserRolesByPhone(String roles){
        return userService.findUserRolesByPhone(roles);
    }

    @RequestMapping("updateUser")
    Integer updateUser(User user){
        return userService.updateUser(user);
    }
}
