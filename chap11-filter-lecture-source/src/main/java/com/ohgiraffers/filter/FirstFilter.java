package com.ohgiraffers.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

// 필터 만들기
@WebFilter("/first/*")
public class FirstFilter implements Filter {

    public FirstFilter(){
        System.out.println("필터 기본 생성자 호출");
    }
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter 인스턴스 최초 생성시 호출");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // request가 전달되기 전에 진행할 작업

        System.out.println("dofilter 호출 됐음");
        
        // 필터에서 실행할 코드 영역
        
        // 실행 후 다음 필터 혹은 서블릿으로 doGEt/doPost 호출
         filterChain.doFilter(servletRequest,servletResponse);
        
         // 서블릿에서 처리 후 다시 수행할 내용 있으면 작성
        System.out.println("서블릿 작업 끝남");
    }

    @Override
    public void destroy() {
        System.out.println("destroy filter 인스턴스 호출");
    }


}
