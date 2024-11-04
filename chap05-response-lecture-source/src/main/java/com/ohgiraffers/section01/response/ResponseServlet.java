package com.ohgiraffers.section01.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/response")
public class ResponseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 서블릿이 수행하는 역할]
        
        /*
        * 1. 사용자의 요청(request)받기
        * - HttpMethod 종류에 따라 parameter로 넘어온 데이터 꺼내기
        *
        * 2. 입력 받은 값을 토대로 비즈니스 로직 구현
        * 
        * 3. 사용자에게 응답(response)하기
        * */

        String hi = "응답 결과입니다~!!";

        StringBuilder builder = new StringBuilder();
        builder.append("<!doctype html>\n")
                .append("<html>\n")
                .append("<head></head>\n")
                .append("<body>\n")
                .append("<h1>" + hi + "</h1>\n")
                .append("</body>\n")
                .append("</html>");

        resp.setContentType("text/html; charset = UTF-8");

        PrintWriter out = resp.getWriter();
        out.write(builder.toString());

        out.flush();
        out.close();
    }
}
