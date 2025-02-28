package com.example.beforesecurity;

import jakarta.servlet.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;
@Slf4j
@Component
@Order(1)
public class UserFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        try {
            log.info("UserFilter  doFilter  실행 전!!" + Thread.currentThread().getName());

            //스레드 로컬에 저장하고싶은 객체가 존재한다면???  //복잡한 로직들이 실행되서 값을 가져오는 경우가 있겠죠?
            User user  = extractUserFromRequest(servletRequest);
            UserContext.setUser(user);


            filterChain.doFilter(servletRequest, servletResponse);

            log.info("UserFilter  doFilter  실행 후!!" + Thread.currentThread().getName());
        }finally {
            UserContext.clear();
        }
    }
    private User extractUserFromRequest(ServletRequest request){
        //복잡한 로직을 통해서 사용자의 정보를 추출한다면??
        String name = request.getParameter("name");
         return new User(name);
    }
}
