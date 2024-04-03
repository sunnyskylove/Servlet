package com.ohgiraffers.section01.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;

@WebFilter("/first/*")                            // 연결할 URL 설정해줘야함!: first로 시작하는 거에 대해 모두 다 실행하겠다~!
public class FirstFilter implements Filter {     // jakarta implement에서 제공하는 Filter를 상속받기~!

    public FirstFilter() {
        System.out.println("FirstFilter 인스턴스 생성됨!!!");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        /* 필기.
        *
        * */

    }

    @Override
    public void destroy() {

        /* 필기.
        *   필터 인스턴스가 소멸될 때 호출되는 메소드(= 톰켓을 종료할 때)
        * */
        System.out.println("Filter destroy() 메소드 호출됨...");

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        /*필기.
        *   Servlet 으로 request 가 전달 되기 전에 요청을 가로채는 메소드
        * */
        System.out.println("Filter doFilter() 호출됨...");

        /* 필기. (내부의)필터에서 처리할 코드를 작성한다. */

        /* 필기. 처리를 한 뒤 다음 필터 혹은 서블릿의 doGet/doPost 를 호출한다. */
        filterChain.doFilter(servletRequest, servletResponse);

        /* 필기. 서블릿에서 처리 후에 다시 수행할 내용이 있다면 작성하는 공간 */
        System.out.println("Servlet 요청 수행 완료!!!");
    }

}


//////////////// 푸쉬~!!!!!