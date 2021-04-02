package com.base.demo.reponse;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

@Slf4j
@Component
public class ResponseResultInterceptor implements HandlerInterceptor {
//    标记名称
    public static final String RESPONSE_RESULT_ANN = "RESPONE-RESULT-ANN";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        请求的方法
        if (handler instanceof HandlerMethod){
            final HandlerMethod handlerMethod = (HandlerMethod) handler;
            final Class<?> clazz = handlerMethod.getBeanType();
            final Method method = handlerMethod.getMethod();
//            判断是否在类上加了注解
            if (clazz.isAnnotationPresent(ResonseResult.class)){
//                设置此请求返回体，需要包装，往下传递，在ResponseBodyAdvice接口进行判断
                request.setAttribute(RESPONSE_RESULT_ANN,clazz.getAnnotation(ResonseResult.class));
//                判断是否在方法上加了注解
            }else if (method.isAnnotationPresent(ResonseResult.class)){
                request.setAttribute(RESPONSE_RESULT_ANN,method.getAnnotation(ResonseResult.class));
            }
        }
        return true;
    }
}
