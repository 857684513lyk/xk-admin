package com.xxxz.xk.config.webmvc;

import com.xxxz.xk.config.interceptor.PrincipalValidate;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * creator：杜夫人
 * date: 2020/6/24
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Resource
    PrincipalValidate principalValidate;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(principalValidate);
    }
}
