<%--
  Created by IntelliJ IDEA.
  User: Echo
  Date: 2021/2/4
  Time: 22:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <form action="${pageContext.request.contextPath}/upload2" enctype="multipart/form-data" method="post">
      <input type="file" name="file">
      <input type="submit" value="upload">
    </form>
  </body>
</html>
