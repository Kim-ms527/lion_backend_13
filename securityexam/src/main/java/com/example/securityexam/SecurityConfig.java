package com.example.securityexam;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@Slf4j
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        //1. 기본 설정
//        http
//                .authorizeHttpRequests(auth -> auth
//                        .anyRequest().authenticated() //모든 요청에 대해서 인증을 요구하겠다.
//                )
//                .formLogin(Customizer.withDefaults());


//      2. 추가로. 원하는 페이지는 인증없이 접근 가능.   폼 로그인 인증 방식을 사용자가 원하는 설정으로..
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/hello","/loginForm","/fail","/test/*").permitAll() //인증없이 접근 가능
                        .anyRequest().authenticated() //모든 요청에 대해서 인증을 요구하겠다.
                )
                .formLogin(formLoin -> formLoin
                        .loginProcessingUrl("/login_proc") //기본 login
//                        .loginPage("/loginForm")  //원하는 로그인 페이지 설정
                        .defaultSuccessUrl("/success") //인증에 성공하면 가고싶은 페이지 설정
//                        .failureUrl("/fail")//실패했다면??
                        .usernameParameter("email")
                        .passwordParameter("passwd")

                        .successHandler((request, response, authentication) -> {
                               log.info("로그인 성공 !!!  "+ authentication.getName());
                               response.sendRedirect("/info");
                         }).failureHandler(((request, response, exception) -> {
                                    log.info("로그인 실패::"+exception.getMessage());
                                    response.sendRedirect("/login");
                         }))
                );

        //로그아웃
        http
                .logout(logout -> logout
                        .logoutUrl("/logout")
                        .logoutSuccessUrl("/hello")
                        //위의 설정으로 로그아웃이 가능하지만..  추가로 하고싶은일이 있다면...
                        .addLogoutHandler((request, response, authentication) -> {
                            //추가로 해야할일이 뭐 있을까요?
                            log.info("로그아웃 세션, 쿠키 삭제.. ");
                            HttpSession session = request.getSession();
                            if(session != null){
                                session.invalidate(); //세션삭제
                            }
                        })
                        .deleteCookies("JSESSIONID") //로그아웃시에 원하는 쿠키를 삭제할 수 있음.
                );

        return http.build();
    }
}
