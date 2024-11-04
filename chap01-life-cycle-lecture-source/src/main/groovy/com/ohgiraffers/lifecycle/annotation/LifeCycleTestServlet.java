package com.ohgiraffers.lifecycle.annotation;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;

// Servlet 이라는걸 설정해주기 위해 HttpServlet 을 상속받으며 @WebServlet이 필요하다.
// 어떤 요청(url)에 반응할지 지정하기 위해 value 값을 해당 url로 지정한다.
@WebServlet(value = "/annotation-lifecycle")
public class LifeCycleTestServlet extends HttpServlet {

    private int initCount = 1;
    private int serviceCount = 1;
    private int destroyCount = 1;
    
    public LifeCycleTestServlet(){
        System.out.println("annotation 기본 생성자 호출");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("annotaion 방식의 init() 호출 : " + initCount++);
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("annotaion 방식의 service() 호출 : " + serviceCount++);
    }

    @Override
    public void destroy() {
        System.out.println("annotaion 방식의 destroy() 호출 : " + destroyCount++);
    }
}
