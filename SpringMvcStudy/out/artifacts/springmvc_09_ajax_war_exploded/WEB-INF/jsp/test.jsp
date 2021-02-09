<%--
  Created by IntelliJ IDEA.
  User: Echo
  Date: 2021/2/1
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.5.1.js"></script>
    <script>
        $("#btn").click(function (){
            $.ajax({
                url:"${pageContext.request.contextPath}/t3",
                method:"get",
                success:function (data) {
                    console.log(data)
                },
                error:function (){
                    console.log("error")
                }
            })
        })
    </script>
</head>
<body>
    <input type="button" value="加载数据" id="btn">
    <table>
        <tr>
            <th>姓名</th>
            <th>年龄</th>
            <th>性别</th>
        </tr>
        <tbody>
            <tr></tr>
        </tbody>
    </table>
</body>
</html>
