package com.example.springmvc.view;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.View;

import java.io.PrintWriter;
import java.util.Map;

public class MyCustomView implements View {
    @Override
    public String getContentType() {
        return "text/html";
    }

    @Override
    public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType(getContentType());
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>사용자 정의 뷰!!</h1>");
        out.println("<p>나는 사용자 정의 뷰입니다.^^</p>");
        out.print("</body></html>");
        out.close();
    }
}
