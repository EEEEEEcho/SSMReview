<%--
  Created by IntelliJ IDEA.
  User: Echo
  Date: 2021/2/2
  Time: 18:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.5.1.js"></script>
    <script>
        function blur1(){
            $.ajax({
                url:"${pageContext.request.contextPath}/t4",
                method:"post",
                data:{"name":$("#name").val()},
                success:function (data){
                    $("#userInfo").html(data)
                },
                error:function (){
                    console.log("Error")
                }
            })
        }
        function blur2(){
            $.ajax({
                url:"${pageContext.request.contextPath}/t4",
                method:"post",
                data: {"pwd":$("#password").val()},
                success:function (data){
                    $("#passInfo").html(data)
                },
                error:function (){
                    console.log("Error")
                }
            })
        }
    </script>
</head>
<body>
    <p>
        用户名:<input type="text" id="name" onblur="blur1()">
        <span id="userInfo"></span>
    </p>
    <p>
        密码:<input type="text" id="password" onblur="blur2()">
        <span id="passInfo"></span>
    </p>
</body>
</html>
