<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="GB2312">
    <title>登录界面</title>

    <script type="text/javascript">
        window.onload = function () {
            if (window.parent != window) {
                window.parent.location.href = "${pageContext.request.contextPath}/login.jsp";
            }
        }
    </script>
</head>
<body>

<section>
    <div>
        <h1><span>用户登录</span></h1>
    </div>
    <div>
        <form action="${pageContext.request.contextPath}/user/login.action" method="post">
            <div>
                <div><label>用户名:</label></div>
                <div><input type="text" name="userName"></div>
            </div>

            <div>
                <div><label>密码:</label></div>
                <div><input type="password" name="userPassword"></div>
            </div>
            <div>
                <input type="submit" value="提交">
                <a href="WEB-INF/jsp/home.jsp">注册</a>
            </div>
        </form>
    </div>
</section>

</body>
</html>