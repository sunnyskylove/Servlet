package com.ohgiraffers.section01.headers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/headers")         // 난 Servlet이야~~선언
public class RequestHeadersPrintServlet extends HttpServlet {

    /* 필기.
    *   헤더란?
    *   우리가 데이터를 전송할 때 이게 무슨 데이터야~라고 알려주는 역할이다.
    *   1. General Header - 요청 과 응답 모두 적용되는 헤더, 상태 메세지를 나타낸다.
    *   2. Request Header - 조회 될 리소스(정보)나 클라이언트 자체에 대한 상세 정보를 포함
    *   3. Response Header - 응답에 대한 부가적인 정보를 갖고 있는 헤더
    *   4. Entity Header - 컨텐츠 길이, MIME 타입과 같은 바디에 대한 상세 정보를 포함한다.
    * */

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // a태그 만들어 놓은것 누르면 나올거 만들기!/ 다시 보면, 링크 후에 오류창이 아닌 빈창이 나옴(f12>network>해당건)

        Enumeration<String> headerNames = req.getHeaderNames();
        while(headerNames.hasMoreElements()) {
            System.out.println(headerNames.nextElement());
        }

        // accept header : 클라이언트에서 웹서버로 request 할 시, 요청할 수 있는 메세지에 담기는 헤더
        // 쉽게 설명하면, 나는 (아래에 적혀있는)출력된 값들만 accept. 즉, 수용할 수 있어 라는 것과 같음
        // -> 예: accept안에 json이 들어있다면, 나는 json 파일을 받을거야~~라는 것
        System.out.println("accept : " + req.getHeader("accept"));

        System.out.println("cookie : " + req.getHeader("cookie"));

    }

}
