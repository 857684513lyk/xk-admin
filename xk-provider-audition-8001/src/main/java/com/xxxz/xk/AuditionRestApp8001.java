package com.xxxz.xk;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

/**
 * creator：djx
 * date: 2020/7/3
 */
@SpringBootApplication
@MapperScan(basePackages = {"com/xxxz/xk/dao"})
public class AuditionRestApp8001 {
    Logger log = LoggerFactory.getLogger(AuditionRestApp8001.class);

    @PostConstruct
    void setTimezone() {
        log.warn("服务器Timezone默认时区是：" + TimeZone.getDefault().getID());
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
    }

    public static void main(String[] args) {
        SpringApplication.run(AuditionRestApp8001.class, args);
    }
}
