<%--
  페이지 지시자 태그
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>JSP 기본 문법</h1>
    <!-- HTML 주석 -->
    <%-- JSP 주석 --%>



    <!-- 선언 태그 -->
    <%!
        // 변수 선언 가능
        private String name;
        private int age;
    %>

    <%
        // 선언한 변수들 사용
        name = "호이";
        age = 20;

        System.out.println("name = " + name);
        System.out.println("age = " + age);
    %>

    <!--표현 태그-->
    <h3>이름 : <%= name %></h3>
    <h3>나이 : <%= age %></h3>

</body>
</html>
