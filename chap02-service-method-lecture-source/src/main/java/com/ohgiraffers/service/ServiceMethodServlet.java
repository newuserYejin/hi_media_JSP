package com.ohgiraffers.service;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/request-service")
public class ServiceMethodServlet extends HttpServlet {

    // service 메소드는 get, post 등 모든 요청에 반응한다. -> 모든 요청에 반응하기 때문에 우선 순위 1순위이다.
    // 만약 다른 조치 없이 service 와 doGet 을 작성한다면 get 요청이 들어올 때 service가 실행되기 때문에 doGet은 실행되지 않는다.
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        // 형변환
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        String httpMethod = request.getMethod();
        System.out.println("httpMethod = " + httpMethod);       // 출력 결과 get 내가 요청한 방식이 get 방식의 요청이였단 뜻

        if (("GET").equals(httpMethod)){
            System.out.println("1");
            doGet(request,response);
        } else if (("POST").equals(httpMethod)) {
            System.out.println("2");
            doPost(request,response);
        }
    }

    // 모든 요청에 반응하는 것이 아닌 특정 요청에 특화되어 반응하는 메소드
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("GET 요청을 처리할 메소드 호출됨");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("POST 요청을 처리할 메소드 호출됨");
    }
}
