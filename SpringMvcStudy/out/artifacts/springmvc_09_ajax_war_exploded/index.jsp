<%--
  Created by IntelliJ IDEA.
  User: Echo
  Date: 2021/2/1
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}js/jquery-3.5.1.js"></script>
    <script>

      function onbl(){
        $.post({
          url: "${pageContext.request.contextPath}/t2",
          //匹配Controller中接受的参数name
          data:{"name":$("#username").val()},
          success:function (data){
            console.log(data)
          }
        })
      }
    </script>
  </head>
  <body>
<%--  失去焦点的时候，发起一个请求到后台--%>
    用户名<input type="text" id="username" onblur="onbl()">
  </body>
</html>
