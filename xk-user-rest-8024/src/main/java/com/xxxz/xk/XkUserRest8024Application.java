package com.xxxz.xk;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

/**
 * @Classname XkConsumerWeb8000Application
 * @Description TODO
 * @Date 2020/7/4 11:33
 * @CreateComputer by PC
 * @Created by cxd
 */

@SpringBootApplication
@MapperScan(basePackages = {"com.xxxz.xk.dao"})
public class XkUserRest8024Application {
    Logger log = LoggerFactory.getLogger(XkUserRest8024Application.class);

    @PostConstruct
    void setTimezone() {
        log.warn("服务器Timezone默认时区是：" + TimeZone.getDefault().getID());
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
    }

    public static void main(String[] args) {
        SpringApplication.run(XkUserRest8024Application.class, args);
    }

}
