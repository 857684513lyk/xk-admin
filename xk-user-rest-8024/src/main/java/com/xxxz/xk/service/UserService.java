package com.xxxz.xk.service;

import com.xxxz.xk.pojo.dto.ResponseDTO;
import com.xxxz.xk.pojo.entity.User;

/**
 * @Classname UserService
 * @Description TODO
 * @Date 2020/7/4 15:22
 * @CreateComputer by PC
 * @Created by cxd
 */
public interface UserService {
    boolean checkPhoneExist(String phone);

    User loginByPhone(String phone);

    ResponseDTO add(User dbUser);

    ResponseDTO findUserRolesByPhone(String roles);

    Integer updateUser(User user);
}
