package com.ohgiraffers.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("리다이렉트 됐음");
        
        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");

        System.out.println("firstname = " + firstname);
        System.out.println("lastname = " + lastname);

        /*
        * 출력 했을 때 null값 나오는 거 확인
        * 짜라서 redirect 시에는 request가 2번 이루어지기 때문에
        * request 와 2번째 request는 전혀 가른 객체가 된다. => 값 공유 불가능
        * */

        // 쿠키 사용하는 방법
        // 1. request 에서 쿠키 목록을 배열 형태로 꺼낸다.
        // 2. 쿠키의 getName(), getValue()를 이용해서 꺼낸다.

        Cookie[] cookies = req.getCookies();

        for(int i = 0; i <cookies.length ; i++){
            System.out.println("cookie : " + cookies[i].getName() + ", value : " + cookies[i].getValue());

            if ("firstname".equals(cookies[i].getName())){
                firstname = cookies[i].getValue();
            } else if ("lastname".equals(cookies[i].getName())) {
                lastname = cookies[i].getValue();
            }
        }

        StringBuilder responseText = new StringBuilder();
        responseText.append("<!doctype html>\n")
                .append("<html>\n")
                .append("<head>\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("<h3>")
                .append(firstname)
                .append(lastname)
                .append("님 하위~</h3>")
                .append("</body>\n")
                .append("</html>\n");

        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.print(responseText.toString());

        out.flush();
        out.close();

        /*
        * 쿠키의 경우 text 파일의 형태로 클라이언트 컴퓨터에 저장된다.
        * 그렇기 때문에 개인 pc가 아닌 공용 pc의 경우 탈취(개인정보) 위험에 노출 된다.
        *
        * 민감한 정보는 session을 이용하게 되며 session은 클라이언트 컴퓨터가 아닌
        * 서버 컴퓨터에 관리되기 때문에 보안에 더 우수하다.
        * */

    }
}
