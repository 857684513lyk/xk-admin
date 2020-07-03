package com.xxxz.xk.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * creator：杜夫人
 * date: 2020/6/23
 */
@RestController
public class IndexController {

    @Value("${spring.application.name}")
    String appName;

    @RequestMapping("/")
    String index() {
        return appName;
    }

}
