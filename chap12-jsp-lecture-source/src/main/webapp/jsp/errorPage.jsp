<%--
  Created by IntelliJ IDEA.
  User: jjin
  Date: 2024-11-04
  Time: 오후 12:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
      // errorPage로 등록을 했지만 error page 로 사용하기 위해서는 반드시 isErrorPge = "true"로 설정해야한다.
      String exceptionType = exception.getClass().getName();

      String exceptionMsg = exception.getMessage();

    %>

    <h1><%=exceptionType%></h1>
    <h1><%=exceptionMsg%></h1>

</body>
</html>
