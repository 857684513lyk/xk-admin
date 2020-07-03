package com.xxxz.xk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class XkProviderAudition8001Application {

    public static void main(String[] args) {
        SpringApplication.run(XkProviderAudition8001Application.class, args);
    }

}
