package com.yjg.tanklegend.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @qfl qiao
 * @date 18-2-4 上午11:10
 */
@Aspect
@Component
public class HttpAspect {
    //logger4j
    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * com.yjg.tanklegend.controller.GirlController.*(..))")//所有的方法
    public void GirlControllerlog(){
    }

    @Before("GirlControllerlog()")
    public void doBefore(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        //url
        logger.info("url={}",request.getRequestURL());

        //method
        logger.info("method={}",request.getMethod());
        //ip
        logger.info("ip={}",request.getRemoteAddr());
        //类方法
        logger.info("class_mothod={}",joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());

        //参数
        logger.info("参数={}",joinPoint.getArgs());
    }


    @After("GirlControllerlog()")
    public void doAfter(){
        logger.info("222");
    }

    /**
     * 可以在请求完成后,获得请求的对象以及其属性
     * @param object
     */
    @AfterReturning(returning = "object",pointcut = "GirlControllerlog()")
    public void doAfterReturning(Object object){
        logger.info("response={}",object.toString());
    }
}
