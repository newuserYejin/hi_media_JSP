package com.ohgiraffers.delete;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/delete")
public class DeleteSessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        String id  = (String) session.getAttribute("id");
        System.out.println("삭제 전 id = " + id);
        
        // Session 데이터 지우기
        
        /*
        * 1. 설정 시간 만료
        * 2. removeAttribute(key)로 session 의 값 지우기
        * 3. invalidate()를 호출하여 session 의 모든 데이터 제거
        * */

        session.removeAttribute("id");
        String userId = (String) session.getAttribute("id");
        System.out.println("userId = " + userId);
        
        // invalidate 를 호출하여 세션 자체를 무효화

        session.invalidate();
        String pw = (String) session.getAttribute("pwd");
        System.out.println("pw = " + pw);

    }
}
