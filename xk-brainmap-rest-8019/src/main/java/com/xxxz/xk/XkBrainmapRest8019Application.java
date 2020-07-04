package com.xxxz.xk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com/xxxz/xk/dao"})
public class XkBrainmapRest8019Application {

    public static void main(String[] args) {
        SpringApplication.run(XkBrainmapRest8019Application.class, args);
    }

}
