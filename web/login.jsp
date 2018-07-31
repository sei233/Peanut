<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="GB2312">
    <title>登录界面</title>

    <link rel="stylesheet" href="/css/bootstrap.min.css">

    <script type="text/javascript">
        window.onload = function () {
            if (window.parent != window) {
                window.parent.location.href = "${pageContext.request.contextPath}/login.jsp";
            }
        }
    </script>

    <style>
        .main{
            background-color: #fff;
            border-radius: 20px;
            width: 300px;
            height: 350px;
            margin: auto;
            position: absolute;
            top: 0;
            left: 0;
            right: 0;
            bottom: 0;
        }
    </style>
</head>
<body>

<div class="container main">
    <div>
        <h1><span>用户登录</span></h1>
    </div>
    <div>
        <form action="${pageContext.request.contextPath}/user/login.action" method="post">
            <div>
                <div><label>用户名:</label></div>
                <div><input class="form-control" type="text" name="userName"></div>
            </div>

            <div>
                <div><label>密码:</label></div>
                <div><input class="form-control" type="password" name="userPassword"></div>
            </div>
            <div>
                <input  class="btn btn-info" type="submit" value="提交">
                <input  class="btn btn-info" type="reset" value="清除">
                <a href="register.jsp">注册</a>
            </div>
        </form>
    </div>
</div>

</body>
</html>