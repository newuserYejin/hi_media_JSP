<%--
  Created by IntelliJ IDEA.
  User: jjin
  Date: 2024-11-05
  Time: 오후 5:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <form action="/self" method="post">
    <label for="first">첫번째 : </label>
    <input type="number" id="first" name="first">
    <br>
    <label for="second">두번째 : </label>
    <input type="number" id="second" name="second">
    <br>
    <label for="third">세번째 : </label>
    <input type="number" id="third" name="third">
    <br>
    <label for="forth">네번째 : </label>
    <input type="number" id="forth" name="forth">
    <br>
    <label for="five">다섯번째 : </label>
    <input type="number" id="five" name="five">
    <br>
    <label for="six">여섯번째 : </label>
    <input type="number" id="six" name="six">
    <br>

    <input type="submit">만들기
  </form>

</body>
</html>
