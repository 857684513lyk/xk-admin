package com.xxxz.zk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class XkConsumerWeb80Application {

    public static void main(String[] args) {
        SpringApplication.run(XkConsumerWeb80Application.class, args);
    }

}
