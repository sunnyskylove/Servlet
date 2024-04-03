package com.ohgiraffers.section01.filter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/first/filter")
public class FirstFilterTestSerlvet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("doGet Servlet 요청 확인...");

//        resp.setContentType("text/html; charset=UTF-8");   // 지워도 encoding이 깨지진 않음 확인

        PrintWriter out = resp.getWriter();
        out.println("<!doctype html>");
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>필터 확인용 서블릿 요청 확인 완료!!</h3>");      // 클릭하면 이 문구 보임!
        out.println("</body>");
        out.println("</html>");

        out.flush();
        out.close();
    }
}