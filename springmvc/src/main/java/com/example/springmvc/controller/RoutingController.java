package com.example.springmvc.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoutingController {
    @GetMapping("/start")
    public String startProcess(Model model){
        System.out.println("Start start!!!");
        model.addAttribute("forwardTest", "carami");
        return "forward:/forward";
    }

    @GetMapping("/forward")
    public String forward(Model model, HttpServletRequest request){
        System.out.println("forward start!!!");
        System.out.println("forward Test ::::"+model.getAttribute("forwardTest"));
        System.out.println(request.getAttribute("forwardTest"));
        return "forwadPage";
    }

    @GetMapping("/redirect")
    public String redirect(Model model){
        System.out.println("redirect");
        model.addAttribute("redirectTest", "carami");
        return "redirect:/finalDestination";
    }

    @GetMapping("/finalDestination")
    public String finalDestination(Model model, HttpServletRequest request){
        System.out.println("redirect start!!!");
        System.out.println("redirect Test ::::"+model.getAttribute("redirectTest"));
        System.out.println(request.getAttribute("redirectTest"));
        return "redirectPage";
    }
}
