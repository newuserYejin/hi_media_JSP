package com.ohgiraffers.request;

import java.io.*;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(value = "/headers")
public class RequestHeaderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Enumeration 는 이더레이터라고 생각하고 다음 존재하는 요소가 있는지 확인할 수 있다(화살표로 연결된 구조와 비슷, 리스트나 이런것처럼 위치가 있는 건 아니다.ㄴ)
        Enumeration<String> headerName = req.getHeaderNames();
        // 요소가 있니?
        while (headerName.hasMoreElements()){
            System.out.println(headerName.nextElement());
        }

    }



}