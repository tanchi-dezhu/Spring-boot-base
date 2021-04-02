package com.base.demo.reponse;

import com.base.demo.enueration.ResultCode;
import com.base.demo.vo.Pagination;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@ControllerAdvice
public class ResponResultHandler implements ResponseBodyAdvice<Object> {

    public static final String RESPONSE_RESULT_ANN = "RESPONE-RESULT-ANN";

    //    请求是否包含了注解标记，没有就直接返回，不用重写方法体
    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        ServletRequestAttributes sra = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes());
        HttpServletRequest request = sra.getRequest();
//        判断请求是否有包装标记
        ResonseResult resonseResultAnn = (ResonseResult) request.getAttribute(RESPONSE_RESULT_ANN);
        return resonseResultAnn == null ? false : true;
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        log.info("进入返回体，重写返回格式");
        Result result = new Result();
        Pagination pagination = (Pagination) o;
        if (pagination.getList().isEmpty()) {
            result.setResultCode(ResultCode.FAILER);
            result.setMessages("请求异常");
        }else{
            result.setResultCode(ResultCode.SUCCESS);
            result.setMessages("请求成功");
            result.setData(o);
        }
        return result;
    }
}
