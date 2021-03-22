package com.base.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

@Configuration
public class WebMvcConfigurationSupport extends org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport {
    public static final Logger logger = LoggerFactory.getLogger(WebMvcConfigurationSupport.class);

    @Bean
    public WebHandlerInterceptor getSecurityInterceptor() {
        return new WebHandlerInterceptor();
    }

    /**
     * 添加拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getSecurityInterceptor())
                .addPathPatterns("/api/**")
        .excludePathPatterns("/api/selectAll");
        super.addInterceptors(registry);
    }
}
