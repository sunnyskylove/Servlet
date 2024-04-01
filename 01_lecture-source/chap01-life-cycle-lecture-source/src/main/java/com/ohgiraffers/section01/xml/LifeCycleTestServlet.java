package com.ohgiraffers.section01.xml;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;

public class LifeCycleTestServlet  extends HttpServlet {

    private int initCount = 1;
    private int serviceCount = 1;
    private int destroyCount = 1;

    // 기본생성자 (ctrl+o 해서 부모가 가진 메소드 3가지 불러온다!!
    public LifeCycleTestServlet() {}


    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        /* 필기.
        *   서블릿 컨테이너에 호출되며 최초 요청 시에는
        *   init() 이후에 동작하고,
        *   두 번째 요청부터는 init() 호출 없이
        *   service() 호출
        * */
        System.out.println("xml 매핑 service 메소드 호출 : " + serviceCount++);
//        super.service(req, res);
    }

    @Override
    public void destroy() {
        /* 필기.
        *   컨테이너가 종료될 때 호출되는 메소드이며, 주로 자원을
        *   반납하는 용도로 사용된다.
        * */
        System.out.println("xml 매핑 destroy 메소드 호출 : " + destroyCount++);
//        super.destroy();
    }


    @Override
    public void init() throws ServletException {
        /*  필기.
        *    최초로 서블릿 요청 시에 동작하는 메소드
        * */
        System.out.println("xml 매핑 init( 메소드 호출 :" + initCount++ );
//        super.init();
    }
}


// 해당 3개 실행되고, 웹 새로고침할때마다 변경(출력창에 1++), ㅁ 정지를 하면, destroy 메소드 호출 되어 서버 연결 끊김 확인완료!!
