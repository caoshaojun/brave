package com.brave.solid.common.aop.aspect;

import com.alibaba.fastjson.JSONObject;
import com.brave.solid.common.aop.AspectOrderConst;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.method.annotation.ExtendedServletRequestDataBinder;

import javax.servlet.http.HttpServletResponseWrapper;
import java.util.HashMap;
import java.util.Map;

/**
 * 控制层入参日志
 * <p>
 * 控制器入参都会打印日志，方便查问题
 */
@Aspect
@Order(AspectOrderConst.SECOND_ORDER_ASPECT)
@Component
public class ControllerParamLogAspect {

    private static final Logger log = LoggerFactory.getLogger(ControllerParamLogAspect.class);


    @Around(value = "execution(public * com.brave.solid.controller..*(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        try {
            methodBefore(proceedingJoinPoint);
            methodAfterReturn(proceedingJoinPoint, proceedingJoinPoint.proceed());
        } catch (Exception e) {
            log.error("控制层出入参切面异常：{}", e.getMessage());
            e.printStackTrace();
        }
    }

    public void methodBefore(JoinPoint joinPoint) {
        try {
            String methodName = joinPoint.getSignature().getName();
            String className = joinPoint.getTarget().getClass().getSimpleName();
            String packageName = joinPoint.getTarget().getClass().getPackage().getName();
            // 参数
            Object[] args = joinPoint.getArgs();
            // 参数名
            String[] argNames = ((MethodSignature) joinPoint.getSignature()).getParameterNames();
            Map<String, Object> paramMap = new HashMap<>();
            for (int i = 0; i < args.length; i++) {
                if (!(args[i] instanceof ExtendedServletRequestDataBinder) && !(args[i] instanceof HttpServletResponseWrapper)) {
                    paramMap.put(argNames[i], args[i]);
                }
            }
            if (paramMap.size() > 0) {
                log.info("方法：{},参数：{}", joinPoint.getSignature(), JSONObject.toJSON(paramMap));
            }
        } catch (Exception e) {
            log.error("AOP methodBefore异常：{}", joinPoint.getSignature());
            throw e;
        }
    }

    public void methodAfterReturn(JoinPoint joinPoint, Object obj) {
        try {
            if (obj != null) {
                log.info("方法:{}，返回内容为：{}", joinPoint.getSignature(), obj);
            }
        } catch (Exception e) {
            log.error("AOP methodAfterReturn异常:{}", joinPoint.getSignature());
            throw e;
        }
    }

}
