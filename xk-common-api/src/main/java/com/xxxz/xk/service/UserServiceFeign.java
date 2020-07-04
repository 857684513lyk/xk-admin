package com.xxxz.xk.service;


import com.xxxz.xk.config.feign.FeignClientConfig;
import com.xxxz.xk.pojo.dto.PageDTO;
import com.xxxz.xk.pojo.dto.ResponseDTO;
import com.xxxz.xk.pojo.query.UserQuery;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作者：森林djx
 * 给这个请求带上用户名和密码
 */
@FeignClient(value = "user-rest", path = "user", configuration = FeignClientConfig.class)
public interface UserServiceFeign {
    /**
     * @param id 用户的id
     * @return 返回用户的信息
     */

    @RequestMapping("/findUserById/{id}")
    ResponseDTO findUserById(@PathVariable Long id);// 第一种路径传参

    /**
     * 对用户进行分页查询
     * 参数：
     * @param query
     * @return
     */
    @RequestMapping("/listUser")
    PageDTO listUser(UserQuery query);// 第二种：最喜欢 post里边body放的参数

}
