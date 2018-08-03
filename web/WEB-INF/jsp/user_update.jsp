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
                return window.confirm("您确定修改吗?");
            })
        });
    </script>
</head>
<body bgcolor="#FFFFCC">
<br>
<form action="${pageContext.request.contextPath }/user/update.action?userId=${user.userId}"
      method="post" enctype="multipart/form-data">
    <div class="container">
        <div class="form-group">
            <div><label class="control-label">用户名称</label></div>
            <div>
                <input class="form-control" type="text" name="userName" placeholder="${user.userName}">
            </div>
        </div>

        <div class="form-group">
            <div><label>用户密码</label></div>
            <div>
                <input class="form-control" type="text" name="userPassword" placeholder="${user.userPassword}">
            </div>
        </div>

        <div class="form-group">
            <div><label>用户状态</label></div>
            <div>
                <input class="form-control" type="text" name="userState" placeholder="${user.userState}">
            </div>
        </div>

        <input id="submit" class="btn btn-info" type="submit" value="保存">
    </div>
</form>

</body>
</html>
