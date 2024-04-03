
<!-- 지시자 태그 (page, include, taglib) 지시자 태그가 있다. -->

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>JSP Simple states</h1>
<!-- HTML 주석 -->
<%-- JSP 주석--%>

<!-- 선언(declare) 태그 -->
<%!
    private String name;
    private int age;
%>

<!-- 스크립트릿 태그 // 메소드 호출, 결과값 얻기 -->
<%
    name = "조평훈";
    age = 20;

    System.out.println("name = " + name);
    System.out.println("age = " + age);

    for(int i = 0; i < name.length(); i++) {
        System.out.println(name.charAt(i));
    }
%>

<!-- 표현(expression)태그 // 출력 -->
name : <%= name %>
<br>
age : <%= age%>
</body>
</html>