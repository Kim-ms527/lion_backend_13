package com.example.springmvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    public  String handleEception(Exception e, Model model){
        logger.error("server Error",e);
        System.out.println("error :::::::::::::::::::::: "+e);
        model.addAttribute("errorMessage" , e.getMessage());
        return "error";
    }
}
