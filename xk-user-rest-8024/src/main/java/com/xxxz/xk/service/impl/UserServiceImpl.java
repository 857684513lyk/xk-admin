package com.xxxz.xk.service.impl;

import com.xxxz.xk.dao.UserDao;
import com.xxxz.xk.pojo.dto.ResponseDTO;
import com.xxxz.xk.pojo.entity.User;
import com.xxxz.xk.pojo.vo.UserVO;
import com.xxxz.xk.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Classname UserServiceImpl
 * @Description TODO
 * @Date 2020/7/4 15:22
 * @CreateComputer by PC
 * @Created by cxd
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    @Override
    public boolean checkPhoneExist(String phone) {
        return  userDao.selectHaveByPhone(phone) != null;
    }

    @Override
    public User loginByPhone(String phone) {

        return userDao.selectHaveByPhone(phone);
    }

    @Override
    public ResponseDTO add(User dbUser) {
        return ResponseDTO.get(userDao.insertSelective(dbUser));
    }

    @Override
    public ResponseDTO findUserRolesByPhone(String roles) {

        return null;
    }

    @Override
    public Integer updateUser(User user) {

        return userDao.updateByPrimaryKeySelective(user);
    }
}
