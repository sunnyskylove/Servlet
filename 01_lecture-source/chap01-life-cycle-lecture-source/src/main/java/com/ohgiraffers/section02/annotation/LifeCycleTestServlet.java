package com.ohgiraffers.section02.annotation;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;

@WebServlet(value = "/annoatation-lifecyle")    // * xml에 입력한 주소를 여기에다가 작성한다!(xml보다 좀 더 간단한 방식이다!)
public class LifeCycleTestServlet extends HttpServlet {     // 내가 servlet이야라고 알려주고~(상속)

    private int initCount =1;
    private int serviceCount = 1;
    private int destroyCount = 1;

    public LifeCycleTestServlet() {}

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("어노테이션 service() 메소드 호출 : " + serviceCount++);
        //        super.service(req, res);
    }

    @Override
    public void destroy() {
        System.out.println("어노테이션 destroy() 메소드 호출 :" + destroyCount++);
//        super.destroy();
    }

    @Override
    public void init() throws ServletException {
        System.out.println("어노테이션 init() 메소드 호출 :" + initCount++);
//        super.init();
    }
}
