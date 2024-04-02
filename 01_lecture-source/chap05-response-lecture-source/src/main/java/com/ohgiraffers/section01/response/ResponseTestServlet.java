package com.ohgiraffers.section01.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/response")
public class ResponseTestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /* 필기.
        *   서블릿이 수행하는 역할은 크게 3가지 이다.
        *   1. 요청 받기 - HttpMethod GET/POST 요청에 따라서 parameter로 전달받은 데이터를 꺼낸다.
        *   2. 비지니스 로직 처리 - ex) DB 접속과 CRUD 관련된 로직
        *   3. 응답 하기 - 문자열로 동적인 웹(HTML 태그) 페이지를 만들고 스트림을 이용하여 보낸다.
        * */

        String hi = "안녕 여러분";

        StringBuilder responseBuilder = new StringBuilder();
        responseBuilder.append("<!doctype html\n")
                .append("<html>\n")
                .append("<head></head>\n")
                .append("<body\n")
                .append("<h1>" + hi +"</h1>" )
                .append("</body\n")
                .append("</html>");

        // 내보내기 전 설정하기!(웹에서 한글 안깨지게...set(설정)하기!!
        // "text/html; charset=UTF-8" 형식으로!!
        // >> content-type이 새로 생김 확인가능. 따라서 header를 바꿔 설정할 수 있다.
        resp.setContentType("text/html; charset=UTF-8");

        PrintWriter out = resp.getWriter();     // 쓸 내용을 내보낼 준비를 한다.
        out.write(responseBuilder.toString());             //responseBuiler를 내보낼 것임!

        out.flush();                        // 덜 나간게 없는지 마지막으로 쫙 플러쉬로 밀어준다~
        out.close();                        // 닫기 끝!
    }
}
