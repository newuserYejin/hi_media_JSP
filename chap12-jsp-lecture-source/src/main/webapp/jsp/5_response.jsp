<%--
  Created by IntelliJ IDEA.
  User: jjin
  Date: 2024-11-04
  Time: 오후 3:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
      // JSP 파일도 서블릿중 하나다
      // 따라서 req와 resp가 모두 존재한다.
      // JSP 파일은 response를 더 쉽게하기위한 view 역할을 담당하는 Servlet이다.

//      String menuName = (String) request.getAttribute("menuName");
//      int amount = (int) request.getAttribute("amount");
        String menuName = request.getParameter("menuName");
        int amount = Integer.parseInt(request.getParameter("amount"));
      int totalPrice = (int) request.getAttribute("totalPrice");
    %>

    <table border="1">
      <tr>
        <th>메뉴 이름</th>
        <th>주문 수량</th>
        <th>총 가격</th>
      </tr>
      <tr>
        <td><%= menuName%></td>
        <td><%= amount%></td>
        <td><%= totalPrice%></td>
      </tr>
    </table>

    <!--
        view에 관련된 서블릿은 jsp가 적합하고
        클래스 서블릿은 비즈니스 로직에 적합하다.
    -->

</body>
</html>
