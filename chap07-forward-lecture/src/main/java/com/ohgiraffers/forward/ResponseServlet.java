package com.ohgiraffers.forward;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/response")
public class ResponseServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String userId = (String) req.getAttribute("id");
        String pw = req.getParameter("userPwd");

        System.out.println("ResponseServlet에서 받은 userId = " + userId);
        System.out.println("ResponseServlet에서 받은 pw = " + pw);

        StringBuilder response = new StringBuilder();

        response.append("<!doctype html>\n")
                .append("<html>\n")
                .append("<head></head>\n")
                .append("<body>\n")
                .append("<h3 align=\" center\">")
                .append(userId)
                .append("</h3>\n")
                .append("</body>\n")
                .append("</html>");

        resp.setContentType("text/html; charset = UTF-8");

        PrintWriter out = resp.getWriter();

        out.print(response);
        out.flush();
        out.close();
    }

}
