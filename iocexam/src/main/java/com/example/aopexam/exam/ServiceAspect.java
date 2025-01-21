package com.example.aopexam.exam;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {
    @Pointcut("execution(* com.example.aopexam.exam.*Service.*(..))")
    public void pc(){}

    @Pointcut("execution(* hello())")
    public void pcHello(){};

    @Before("pc()")
    public void before(JoinPoint joinPoint){
        System.out.println("Before  ::::::::::::::::::::::::  "+ joinPoint.getSignature().getName());
    }

    @After("pcHello()")
    public void after(){
        System.out.println("After ::::::::::::::::::::::::::");
    }
}
