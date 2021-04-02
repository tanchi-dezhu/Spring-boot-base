package com.base.demo;

import com.base.demo.reponse.ResponseResultInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebAppconfigurer extends WebMvcConfigurationSupport {
    @Bean
    public ResponseResultInterceptor getResponseResultInterceptor() {
        return new ResponseResultInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 可添加多个，这里选择拦截所有请求地址，进入后判断是否有加注解即可
        registry.addInterceptor(getResponseResultInterceptor()).addPathPatterns("*")
                .excludePathPatterns("/api/selectAll","/");
        super.addInterceptors(registry);
    }
}
