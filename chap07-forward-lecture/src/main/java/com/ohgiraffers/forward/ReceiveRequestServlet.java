package com.ohgiraffers.forward;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/forward")
public class ReceiveRequestServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("POST 요청 수락");

        String id = req.getParameter("userId");
        String pw = req.getParameter("userPwd");

        System.out.println("id = " + id);
        System.out.println("pw = " + pw);
        
        // DB 관련 비즈니스 로직 작성 공간

        
        // 사용자에게 어떤 화면을 보여줄지 결정
        // 응답 관련 처리 과정을 분리하여 전달 
        
        // key, value 형식으로 서블릿에게 필요한 값 전달
        req.setAttribute("id",id);

        // 요청을 다시 보낼수 있게 만든다.
        RequestDispatcher rd = req.getRequestDispatcher("response");
        
        // 다른 서블릿을 불러오는 용도로 forward 사용  ==>  보통 조회의 경우에서 사용
        // (그러나 forward는 새로고침시 같은 행동이 반복 작동되기 때문에 insert, delete와 같은 작업에 forward만 쓰는 것은
        // 적합하지 않다.)

        rd.forward(req,resp);
    }
}