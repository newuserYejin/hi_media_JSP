package com.ohgiraffers.jsp.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;

import java.io.IOException;

@WebFilter("/self")
public class firstFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("필터 거쳐감");
        System.out.println(servletRequest.getParameter("first"));
        
        int num = Integer.parseInt(servletRequest.getParameter("first"));
        if (num>10){
            System.out.println("숫자 큼");
        }


    }
}
