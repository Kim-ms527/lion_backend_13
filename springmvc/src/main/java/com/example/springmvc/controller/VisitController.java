package com.example.springmvc.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VisitController {

    @GetMapping("/visit")
    public String showVisit(
            @CookieValue(name = "lastVisit", defaultValue = "N/A")String lastVisit,
            HttpServletResponse response, Model model
    ){
        //만약 로그인에 관련된 부분이다라고 한다면 로그인체크를하고,  사용자가 맞다면 쿠키를 생성..

        Cookie cookie = new Cookie("lastVisit", "carami");
//        cookie.setDomain("/");
        cookie.setMaxAge(60*60);  //하루 (쿠키의 유지시간은 초단위로 설정된다.

        //반드시 응답에 포함 시켜야해요.
        response.addCookie(cookie);

        model.addAttribute("lastVisit", lastVisit);
        return "visit";
    }
}
