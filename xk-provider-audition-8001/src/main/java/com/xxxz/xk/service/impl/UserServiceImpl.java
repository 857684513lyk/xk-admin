package com.xxxz.xk.service.impl;

import com.xxxz.xk.dao.UserDao;
import com.xxxz.xk.pojo.dto.ResponseDTO;
import com.xxxz.xk.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * creator：杜夫人
 * date: 2020/7/3
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;
    @Override
    public ResponseDTO findUserById(Long id) {
        return ResponseDTO.get(userDao.selectByPrimaryKey(id));
    }
}
