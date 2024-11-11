package com.ohgiraffers.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/session")
public class SessionHandlingServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = req.getParameter("userId");
        String pw = req.getParameter("userPwd");

        System.out.println("id = " + id);
        System.out.println("pw = " + pw);

        resp.sendRedirect("redirect");

        // session 가져오기
        HttpSession session = req.getSession();
        
        // 유효시간 설정 (기본 30분)
        System.out.println("default 유효시간 : " + session.getMaxInactiveInterval() );
        session.setMaxInactiveInterval(60*10);      // 10 분
        System.out.println("변경후 유효시간 : " + session.getMaxInactiveInterval());

        // session은 브라우저당 1개로 고유한 아이디를 가지고 있는 인스턴스를 이용한다.
        System.out.println("session id : " + session.getId());

        session.setAttribute("id", id);
        session.setAttribute("pwd", pw);
    }
}
