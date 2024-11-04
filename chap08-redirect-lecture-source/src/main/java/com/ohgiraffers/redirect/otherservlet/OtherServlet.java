package com.ohgiraffers.redirect.otherservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/otherservlet")
public class OtherServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get 요청 정상 수락");

        // DB관련 처리 로직
        Logic logic = new Logic();
        logic.registerData();       // 내부 메소드 1번 실행시켜보기

        // 다른 servlet으로 출력 관련 redirect
        resp.sendRedirect("redirect?name=cho&age=20");
    }
}
