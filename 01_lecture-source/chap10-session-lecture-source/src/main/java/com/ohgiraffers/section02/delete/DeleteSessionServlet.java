package com.ohgiraffers.section02.delete;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/delete")
public class DeleteSessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        Enumeration<String> sessionNames = session.getAttributeNames();    // 여러개가 모여있는것~!!

        while (sessionNames.hasMoreElements()) {
            System.out.println(sessionNames.nextElement());

        }

        /* 필기.
        *   세션의 데이터를 지우는 방법
        *   1. 설정한 시간이 만료되면 세션이 만료된다.
        *   2. removeAttribute() 로 session 의 Attribute 를 지운다.
        *   3. invalidate() 를 호출하면 세션의 모든 데이터가 지워진다.
        * */

        // 2번_firstname 지우기~~
        session.removeAttribute("firstName");
        while (sessionNames.hasMoreElements()) {
            System.out.println(sessionNames.nextElement());
        }
        System.out.println("======================================");

        /* 필기.
        *   세션 내의 데이터를 지우는 것 뿐 아니라 세션을 강제로 만료시킨다.
        *   invalidate() 를 호출하게 되면 세션 자체를 무효화 하기 때문에
        *   이후에 세션을 사용하는 것은 에러가 발생한다.
        * */

        session.invalidate();                         // 얘때문에 무효화 시킴..따라서 이후부터는 session 사용불가
        sessionNames = session.getAttributeNames();   // 따라서 invalidate보다는, removeAttribute를 사용함.
        while (sessionNames.hasMoreElements()) {
            System.out.println(sessionNames.nextElement());

        }


    }
}
