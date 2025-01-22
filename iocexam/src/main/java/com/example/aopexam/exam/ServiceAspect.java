package com.example.aopexam.exam;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
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

//    @After("pcHello()")
//    public void after(){
//        System.out.println("After ::::::::::::::::::::::::::");
//    }
//
//    @AfterReturning(pointcut = "pc()",returning = "result")
//    public void afterReturning(JoinPoint joinPoint, Object result){
//        System.out.println("AfterReturning ::::::::: "+ joinPoint.getSignature().getName()+", return value  :: "+result );
//    }
//
//    @AfterThrowing(value = "pc()", throwing = "ex")
//    public void afterThrowing(Throwable ex){
//        System.out.println("AfterThrowing ::::::::::::::: ");
//        System.out.println("exception value :: "+ ex);
//    }
//
//    @Around("pc()")
//    public String around(ProceedingJoinPoint pjp) throws Throwable{
//        System.out.println("Around ::::::::::::::::::   실제 메서드가 실행되기전에 해야할 일이 있다면 여기");
//
//        String value = (String) pjp.proceed();  // 실제 Target 의 메서드를 호출!! --이 줄을 기준으로  윗부분과 아랫부분이 시점이 달라짐.
//
//        System.out.println("Around ::::::::::::::::  실제 메서드가 실행된 후에 할일이 있다면 여기에 구현 ");
//
//        value += "carami aop run!!";
//
//        return value;
//    }
//
//    @Before("execution(* setName(..))")
//    public void beforeSetName(JoinPoint joinPoint){
//        System.out.println("beforeSetName ::::::::::::");
//        System.out.println("target method name :::: "+joinPoint.getSignature().getName());
//
//        Object[] args = joinPoint.getArgs();
//
//        for(Object object : args){
//            System.out.println("setName  메소드의 인자 ::::::::::"+object);
//        }
//    }
}
