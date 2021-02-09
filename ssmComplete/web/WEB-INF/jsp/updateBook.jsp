<%--
  Created by IntelliJ IDEA.
  User: Echo
  Date: 2021/1/31
  Time: 22:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>

        </div>
    </div>
    <form action="${pageContext.request.contextPath}/book/doUpdateBook" method="post">
<%--        无法修改的问题并非事务造成的，因为事务进行重新配置之后仍然无法提交成功，根本原因在于，ID没有传到后台所以
            在更新时没有操作，需要添加一个隐藏域获得book的ID--%>
        <input type="hidden" name="bookID" value="${Qbook.bookID}">
        <div class="form-group">
            <label for="bookName">书籍名称</label>
            <%--                这里的name属性一定要和pojo中定义的字段的名字一样--%>
            <input type="text" name="bookName" id="bookName" value="${Qbook.bookName}" class="form-control" required>
        </div>
        <div class="form-group">
            <label for="bookCounts">书籍数量</label>
            <input type="text" name="bookCounts" id="bookCounts" value="${Qbook.bookCounts}" class="form-control" required>
        </div>
        <div class="form-group">
            <label for="detail">书籍描述</label>
            <input type="text" name="detail" id="detail" value="${Qbook.detail}" class="form-control" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="修改">
        </div>
    </form>
</div>
</body>
</html>
