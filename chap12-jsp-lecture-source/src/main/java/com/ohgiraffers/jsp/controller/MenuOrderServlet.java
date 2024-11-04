package com.ohgiraffers.jsp.controller;

import com.ohgiraffers.jsp.service.MenuPriceCalculator;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/menu/order")
public class MenuOrderServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 값을 꺼내올땐 name 속성이 중요
        String menuName = req.getParameter("menuName");
        int amount = Integer.parseInt(req.getParameter("amount"));

        // 비즈니스 로직
        int totalPrice = new MenuPriceCalculator().calcTotalPrice(menuName, amount);


        // 다른 서블릿으로 넘어갈 값 설정
//        req.setAttribute("menuName",menuName);
//        req.setAttribute("amount",amount);
        req.setAttribute("totalPrice",totalPrice);

        // 앞에 / 가 붙으면 절대경로
        RequestDispatcher rd = req.getRequestDispatcher("/jsp/5_response.jsp");
        rd.forward(req,resp);
    }
}
