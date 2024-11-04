package com.ohgiraffers.cookie;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(value = "/cookie")
public class CookieServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");

        System.out.println("firstname = " + firstname);
        System.out.println("lastname = " + lastname);

        // cookie 사용 정 redirect 구문
//        resp.sendRedirect("redirect");
        
        // 쿠키 사용 방법
        // 1. 쿠키를 만든다
        // 2. 만든 쿠키의 만료 시간을 설정한다.
        // 3. 응답 헤더에 쿠키를 담는다.
        // 4. 응답을 보낸다.

        //1. 쿠키 생성
        Cookie firstnameCookie = new Cookie("firstname",firstname);
        Cookie lastnameCookie = new Cookie("lastname",lastname);
        
        // 2. 쿠키 만료 시간 설정
        firstnameCookie.setMaxAge(60 * 60 * 24);        // 1일
        lastnameCookie.setMaxAge(60 * 60 * 24);        // 1일
        
        // 3. 응답 헤더에 쿠키 담기
        resp.addCookie(firstnameCookie);
        resp.addCookie(lastnameCookie);

        // 4. 리다이렉트 시키기
        resp.sendRedirect("redirect");
    }
}