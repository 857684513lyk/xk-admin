package com.xxxz.xk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import java.util.TimeZone;
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.xxxz.xk.service"})
public class XkConsumerWeb8000Application {
    Logger log = LoggerFactory.getLogger(XkConsumerWeb8000Application.class);

    @PostConstruct
    void setTimezone() {
        log.warn("服务器Timezone默认时区是：" + TimeZone.getDefault().getID());
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
    }

    public static void main(String[] args) {
        SpringApplication.run(XkConsumerWeb8000Application.class, args);
    }

}
