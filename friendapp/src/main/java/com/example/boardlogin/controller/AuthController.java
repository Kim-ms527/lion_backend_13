package com.example.boardlogin.controller;


import com.example.boardlogin.domain.User;
import com.example.boardlogin.repository.UserRepository;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    // 로그인 폼 페이지 렌더링
    @GetMapping("/login")
    public String loginForm() {
        return "board_login/loginform"; // loginform.html 렌더링
    }

    @PostMapping("/login")
    public String login(@RequestParam("name") String name, @RequestParam("email") String email, HttpServletResponse response) {
        Optional<User> user = userRepository.findByNameAndEmail(name, email);
        System.out.println(name+email);
        System.out.println(user.isPresent());
        if (user.isPresent()) {
            //  인증 성공 → 쿠키에 사용자 이름 저장
            Cookie cookie = new Cookie("userInfo", name);
            cookie.setPath("/");
            cookie.setMaxAge(60 * 60 * 24 * 7); // 7일간 유지
            response.addCookie(cookie);

            return "redirect:/boards";
        }

        return "redirect:/auth/login?error=true"; // 로그인 실패 시 다시 로그인 페이지로 이동
    }

    @GetMapping("/logout")
    public String logout(HttpServletResponse response) {
        // ✅ userInfo 쿠키 삭제
        Cookie cookie = new Cookie("userInfo", null);
        cookie.setPath("/");
        cookie.setMaxAge(0); // 쿠키 즉시 만료
        response.addCookie(cookie);

        return "redirect:/boards";
    }
}
