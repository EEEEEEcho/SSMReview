<%--
  Created by IntelliJ IDEA.
  User: Echo
  Date: 2021/1/31
  Time: 21:32
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
                        <small>新增书籍</small>
                    </h1>
                </div>

            </div>
        </div>
        <form action="${pageContext.request.contextPath}/book/toAddBook" method="post">
            <div class="form-group">
                <label for="bookName">书籍名称</label>
<%--                这里的name属性一定要和pojo中定义的字段的名字一样--%>
                <input type="text" name="bookName" id="bookName" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="bookCounts">书籍数量</label>
                <input type="text" name="bookCounts" id="bookCounts" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="detail">书籍描述</label>
                <input type="text" name="detail" id="detail" class="form-control" required>
            </div>
            <div class="form-group">
                <input type="submit" class="form-control" value="添加">
            </div>
        </form>
    </div>
</body>
</html>
