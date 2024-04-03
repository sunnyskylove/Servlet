<%--
  Created by IntelliJ IDEA.
  User: himedia
  Date: 2024-04-03
  Time: 오후 12:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 style="text-align: center; color: red" >메뉴 주문</h1>
<form action="/menu/order" method="post">
    <select name="menuName" id="menu">
        <option value="햄버거">햄버거</option>
        <option value="짜장면">짜장면</option>
        <option value="짬뽕">짬뽕</option>
        <option value="순대국">순대국</option>
    </select>
    <input type="number" min="0" max="100" step="1" name="amount">
    <button type="submit">선택 완료!</button>
</form>

</body>
</html>