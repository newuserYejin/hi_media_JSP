package com.ohgiraffers.parameter.section01.querystring;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Date;

// 인자가 1개 일때는 value 생략 가능
@WebServlet("/querystring")
public class QueryStringServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("doGET 호출됨");

        // HttpServletRequest 객체를 통해 getParameter()를 이용하여 값을 꺼내올 수 있다.
        // 인자로 input 태그에 지정한 name 속성 값을 getPParameter() 메소드에 전달해주면 된다,

        String name = req.getParameter("name");
        System.out.println("name = " + name);
        
        int age = Integer.parseInt(req.getParameter("age"));
        System.out.println("age = " + age);

        Date birthday = Date.valueOf(req.getParameter("birthday"));
        System.out.println("birthday = " + birthday);
        
        String gender = req.getParameter("gender");
        System.out.println("gender = " + gender);
        
        String national = req.getParameter("national");
        System.out.println("national = " + national);
        
        // checkbox 특성 상 값이 여러개일 수 있기 때문에 배열로 값 받기 -> 값이 여러개일때는 getParameterValues 이용
        String[] hobbies = req.getParameterValues("hobbies");
        System.out.print("취미 : ");
        for (String item : hobbies){
            System.out.print(item + " ");
        }

    }
}
