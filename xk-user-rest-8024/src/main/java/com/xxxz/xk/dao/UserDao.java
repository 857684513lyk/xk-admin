package com.xxxz.xk.dao;

import com.xxxz.xk.pojo.entity.User;
import com.xxxz.xk.pojo.vo.UserVO;

public interface UserDao {
    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);


    /**
     *
     * 功能描述: <br>
     * 〈查询user表中是否又phone的用户〉
     * @Param: phone
     * @Return: int
     * @Author: cxd
     * @Date: 2020/7/4 15:33
     */
    UserVO selectHaveByPhone(String phone);
}