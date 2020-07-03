package com.xxxz.xk.service;


import com.xxxz.xk.pojo.dto.ResponseDTO;

/**
 * creator：djx
 * date: 2020/7/3
 */
public interface UserService {
    ResponseDTO findUserById(Long id);
}
