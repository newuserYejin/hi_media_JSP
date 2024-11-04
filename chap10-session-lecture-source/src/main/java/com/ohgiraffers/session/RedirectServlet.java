package com.ohgiraffers.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        String id = (String) session.getAttribute("id");
        String pw = (String) session.getAttribute("pwd");

        System.out.println("리다이랙트의 id = " + id);
        System.out.println("리다이랙트의 pw = " + pw);
        System.out.println("리아이랙트 후 session id : " + session.getId());

        resp.setContentType("text/html; charset = UTF-8");

        PrintWriter out = resp.getWriter();

        out.println("<!doctype html>");
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>");
        out.println(id + "님 환영합니다.");
        out.println("</h3>");
        out.println("</body>");
        out.println("</html>");

        out.flush();
        out.close();

    }
}
