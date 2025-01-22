package com.example.springmvc.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
    //http://localhost:8080/home?name=kang
    //?name=kang  --  쿼리문자열
    //?name=kang&age=20&phone=010111111&address=강남구역삼동

    //https://www.google.com/search?q=%EC%82%AC%EA%B3%BC&oq=%EC%82%AC%EA%B3%BC&gs_lcrp=EgZjaHJvbWUqBggAEEUYOzIGCAAQRRg7MgYIARBFGD0yBggCEEUYPTIGCAMQRRg90gEJMzk0MGowajE1qAIAsAIA&sourceid=chrome&ie=UTF-8

    @GetMapping("/home")
    public String home(@RequestParam("name") String name, Model model){
//        String name = request.getParameter("name");
        System.out.println(name);

        model.addAttribute("name",name);
        return "home";   //view name
    }
}
