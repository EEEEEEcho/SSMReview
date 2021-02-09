<%--
  Created by IntelliJ IDEA.
  User: Echo
  Date: 2021/2/4
  Time: 22:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>首页</h1>
    <h2>${username}</h2>
    <h2><a href="${pageContext.request.contextPath}/user/goOut">注销</a></h2>
</body>
</html>
