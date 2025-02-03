package com.example.springmvc.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class VisitController {
    @GetMapping("/cookieSetForm")
    public String cookieSetForm(){
        //해당 요청이 되면,  쿠키이름과 쿠키값을 받는 화면을 만들어주세요.
        return "cookieset";
    }

    @GetMapping("/cookieSet")
    public String cookieSet(@RequestParam(name = "cookieName") String cookieName,
                            @RequestParam(name = "cookieValue") String cookieValue,
                            HttpServletResponse response){
        //이 요청에서는 쿠키 이름과, 쿠키 값을 받아서 쿠키를 저장하는 부분을 만들어 주세요.
        Cookie cookie = new Cookie(cookieName, cookieValue);
        cookie.setPath("/");
        cookie.setMaxAge(-1);  //-1 브라우저가 유지되는 동안 //7일 유지(7*24*60*60)

        response.addCookie(cookie);  //응답에 쿠키 추가
        //쿠키가 저장되면 /cookieView로 리다이렉트되도록 만들어 주세요.

        return "redirect:/cookieView";
    }
    @GetMapping("/cookieView")
    public String cookieView(HttpServletRequest request, Model model){
        //이 요청에서는 모든 쿠키를 보여주는 화면을 만들어 주세요.
        Cookie[] cookies = request.getCookies();
        List<String> cookieList = new ArrayList<>();

        if(cookies != null){
        for (Cookie cookie : cookies){
            System.out.print(cookie.getName() +":::");
            System.out.println(cookie.getValue());
            cookieList.add(cookie.getName()+"="+cookie.getValue());
        }

            model.addAttribute("cookies",cookieList);

        }
        return "cookieview";
    }

    //쿠키삭제??
    @GetMapping("/cookeDelete")
    public String cookieDelete(@RequestParam(name="cookieName") String cookieName, HttpServletResponse response){
        Cookie cookie = new Cookie(cookieName, "");
        cookie.setPath("/");
        cookie.setMaxAge(0);
        response.addCookie(cookie);

        return "redirect:/cookieView";
    }


    @GetMapping("/visit")
    public String showVisit(
            @CookieValue(name = "lastVisit", defaultValue = "N/A")String lastVisit,
            HttpServletResponse response, Model model, HttpServletRequest request
    ){
//        Cookie[] cookies = request.getCookies();
//        if(cookies != null) {
//            for (Cookie cookie : cookies) {
//                String name = cookie.getName();
//                String value = null;
//                if(name.equals("lastVisit")){
//                    value = cookie.getValue();
//                }
//
//                System.out.println(name + ":::" + value);
//            }
//        }


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
