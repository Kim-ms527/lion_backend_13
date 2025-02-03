package com.example.springmvc.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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

    @GetMapping("/todo")
    @ResponseBody
    public String todo(){
        return "todo!!";
    }

    //http://localhost:8080/greeting?name=carami
    @GetMapping("/greeting")
    public ModelAndView greet(@RequestParam(name="name",required = false,defaultValue = "world")String name){
        ModelAndView mv = new ModelAndView("greeting");
        mv.addObject("name",name);
        return mv;
    }


    @GetMapping("/greeting2")
    public String greet2(@RequestParam(name="name",required = true)String name,Model model){
        model.addAttribute("name",name);
        return "greeting";
    }

    @GetMapping("/users/{userId}") //http://localhost:8080/users/carami   -- {userId} 는 값이들어올거다라는 의미.
    public String getUser(@PathVariable("userId") String userId, Model model){
        System.out.println(userId);
        model.addAttribute("userId",userId);
        return "userView";
    }


}
