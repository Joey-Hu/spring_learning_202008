package com.joeyhu.spring5.aopanno;

/**
 * @author: huhao
 * @time: 2020/8/12 11:00
 * @desc:
 */

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 增强类
 */
@Component
@Aspect  // 生成代理对象
@Order(2)
public class UserProxy {

    /**
     * 相同切入点提取
     */
    @Pointcut(value = "execution(* com.joeyhu.spring5.aopanno.User.add(..))")
    public void pointcutDemo() {

    }

    /**
     * 前置通知
     *//*
    @Before(value = "execution(* com.joeyhu.spring5.aopanno.User.add(..))")
    public void before() {
        System.out.println("before ... ...");
    }

    @After(value = "execution(* com.joeyhu.spring5.aopanno.User.add())")
    public void after() {
        System.out.println("after ... ...");
    }

    @AfterReturning(value = "execution(* com.joeyhu.spring5.aopanno.User.add())")
    public void afterReturning() {
        System.out.println("afterReturning ... ...");
    }

    @AfterThrowing(value = "execution(* com.joeyhu.spring5.aopanno.User.add())")
    public void afterThrowing() {
        System.out.println("afterThrowing ... ...");
    }

    @Around(value = "execution(* com.joeyhu.spring5.aopanno.User.add())")
    public void aroud(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("before around ... ...");

        // 被增强方法执行
        proceedingJoinPoint.proceed();

        System.out.println("after around ... ...");
    }*/


    @Before("pointcutDemo()")
    public void before() {
        System.out.println("before ... ...");
    }

    @After("pointcutDemo()")
    public void after() {
        System.out.println("after ... ...");
    }

    @AfterReturning("pointcutDemo()")
    public void afterReturning() {
        System.out.println("afterReturning ... ...");
    }

    @AfterThrowing("pointcutDemo()")
    public void afterThrowing() {
        System.out.println("afterThrowing ... ...");
    }

    @Around("pointcutDemo()")
    public void aroud(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("before around ... ...");

        // 被增强方法执行
        proceedingJoinPoint.proceed();

        System.out.println("after around ... ...");
    }



}
