package com.xxxz.xk.rest.pages.back;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;


/**
 * creator：杜夫人
 * date: 2020/6/23
 */
@RestController
@RequestMapping("/pages/back/user")
@EnableDiscoveryClient
public class UserController {
    //@Resource
    //DiscoveryClient discoveryClient; 需要主启动加注解和依赖
    @RequestMapping("/findUserById/{id}")
    Object findUserById(@PathVariable Long id) {
        return "嘿嘿嘿"+id;
    }


}
