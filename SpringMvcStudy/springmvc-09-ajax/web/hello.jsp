<%--
  Created by IntelliJ IDEA.
  User: Echo
  Date: 2021/2/1
  Time: 22:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.5.1.js"></script>
    <script>
        $(function (){
            $("#btn").click(function (){
                $.ajax({

                    url:"${pageContext.request.contextPath}/t3",
                    method:"get",
                    success:function (data) {
                        //console.log(data)
                        html = ""
                        for(let i = 0;i < data.length;i ++){
                            html += "<tr>" +
                                "<td>" + data[i].name + "</td>" +
                                "<td>" + data[i].age  + "</td>" +
                                "<td>" + data[i].sex  + "</td>" +
                                "</tr>"
                        }
                        $("#content").html(html);
                    },
                    error:function (){
                        console.log("error")
                    }
                })
            })
        })
    </script>
</head>
<body>
    <h1>Hello world</h1>
    <input type="button" value="加载数据" id="btn">
    <table>
        <tr>
            <th>姓名</th>
            <th>年龄</th>
            <th>性别</th>
        </tr>
        <tbody id="content">
        </tbody>
    </table>
</body>
</html>
