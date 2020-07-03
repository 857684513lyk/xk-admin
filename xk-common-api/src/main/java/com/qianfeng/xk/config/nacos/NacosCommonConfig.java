package com.qianfeng.xk.config.nacos;

import com.alibaba.cloud.nacos.ConditionalOnNacosDiscoveryEnabled;
import com.alibaba.cloud.nacos.NacosDiscoveryProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.serviceregistry.AutoServiceRegistrationAutoConfiguration;
import org.springframework.cloud.client.serviceregistry.AutoServiceRegistrationConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * creator：lhtjj
 * date: 2020/4/27
 */
@SpringBootConfiguration
@Slf4j
public class NacosCommonConfig {
    @Resource
    private NacosDiscoveryProperties nacosDiscoveryProperties;// 这种方式是比较先进方式，看源码出来


    
    @Resource
    Environment environment;

    @PostConstruct
    public void initNacos() {
        String appName = environment.getProperty("spring.application.name");// 拿到微服务的名字
        String serverAddr = "49.234.211.151:8848";//开发环境用测试服务器的公网
        String[] activeProfiles = environment.getActiveProfiles();
        if (activeProfiles.length > 0) {
            if ("pro".equals(activeProfiles[0])) {
                serverAddr = "172.17.0.4:8848";// 正式环境的私网
            } else if ("dev".equals(activeProfiles[0])) {
                serverAddr = "49.234.211.151:8848";// 开发环境用测试服务器的公网

                nacosDiscoveryProperties.setWatchDelay(2000L);// 从nacos获取服务列表的频率（2秒一次）
                nacosDiscoveryProperties.setHeartBeatInterval(1);// 给nacos发送心跳的时间间隔
                nacosDiscoveryProperties.setHeartBeatTimeout(3);// nacos多少秒没有收到这个心跳，就直接把这个微服务删除
            }
        }
        log.info("#######" + appName + ":配置nacos的环境" + activeProfiles[0] + "地址：" + serverAddr);
        nacosDiscoveryProperties.setServerAddr(serverAddr);
    }
}
