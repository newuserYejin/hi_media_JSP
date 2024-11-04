<%@ page import="java.time.LocalDate" %>
<%@ page import="java.time.LocalDateTime" errorPage="errorPage.jsp" %><%--
  Created by IntelliJ IDEA.
  User: jjin
  Date: 2024-11-04
  Time: 오후 12:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Page 지시자 태그</h1>
    
    <%
      LocalDateTime date = LocalDateTime.now();
      System.out.println("date = " + date);

      // 고의적인 error
      String str = null;
      char ch = str.charAt(0);

    %>

</body>
</html>
