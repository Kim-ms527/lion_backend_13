package com.example.securityexam3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.parameters.P;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HomeController {
    @Autowired
    private HomeService homeService;


    @GetMapping
    public String hello(){
        return "hello";
    }
    @GetMapping("/info")
    public String info(){
        String message = null;
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(authentication == null || !authentication.isAuthenticated()){
            message="로그인된 사용자가 없습니다.";
        }
        Object principal = authentication.getPrincipal();
        if(principal instanceof UserDetails) {
            UserDetails userDetails = (UserDetails) principal;
            message = "현재 로그인 한 사용자 : "+ userDetails.getUsername();
        }else {
            message = "현재 로그인 한 사용자 : "+principal.toString();
        }
        return message;
    }
    @GetMapping("/aaa")
    public String aaa(){
        //HelloService 의 userLog() 를 호출하면,  현재 로그인한 사용자 이름을 log.info 로 출력해주세요.
        homeService.userLog();
        return "aaa" ;
    }
    @GetMapping("/bbb")
    public String bbb(){
        return "bbb";
    }
    @GetMapping("/ccc")
    public String ccc(@AuthenticationPrincipal UserDetails userDetails){
        return "ccc"+ userDetails.getUsername();
    }
}
