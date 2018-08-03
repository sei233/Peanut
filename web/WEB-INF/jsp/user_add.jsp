<%--
  Created by IntelliJ IDEA.
  User: 石乾
  Date: 2018/7/18
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>$Title$</title>

    <%--<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>--%>
    <script src="/js/jquery.min.js"></script>
    <link rel="stylesheet" href="/css/bootstrap.min.css">

    <script type="text/javascript">
        $(function () {
            $('#submit').click(function () {
                return window.confirm("您确定添加吗?");
            })
        });
    </script>
</head>
<body bgcolor="#FFFFCC">
<br>
<form action="${pageContext.request.contextPath }/user/add.action" method="post"
      enctype="multipart/form-data">
    <div class="container">
        <div class="form-group">
            <div><label class="control-label">用户名称</label></div>
            <div>
                <input class="form-control" type="text" name="userName" placeholder="用户名称">
            </div>
        </div>

        <div class="form-group">
            <div><label>用户密码</label></div>
            <div>
                <input class="form-control" type="text" name="userPassword" placeholder="用户密码">
            </div>
        </div>

        <input id="submit" class="btn btn-info" type="submit" value="保存">
    </div>
</form>

</body>
</html>
