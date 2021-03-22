package com.base.demo.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class WebHandlerInterceptor implements HandlerInterceptor {

    /**
     * 进入方法前执行
     * @param request
     * @param response
     * @param handler
     * @return true 放行、false拦截
     * @throws Exception
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        System.out.print("before:");
        return true;
    }

    /**
     * 进入Handler方法之后，返回modelAndView之前执行(可以往MV里面填充公用的ModelAndView)
     *
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     * @param handler  handler
     * @param mv       ModelAndView
     */
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView mv)
            throws Exception {
        System.out.print("mv 执行:");
    }

    /**
     * 执行Handler完成后执行(统一异常处理，统一日志处理)
     *
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     * @param handler  handler
     * @param e        异常信息
     */
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception e)
            throws Exception {
        System.out.print("after:");
    }
}
