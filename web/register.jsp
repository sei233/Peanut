<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="GB2312">
    <title>注册界面</title>
</head>
<body>

<section>
    <div>
        <h1><span>用户注册</span></h1>
    </div>
    <div>
        <form action="${pageContext.request.contextPath}/user/register.action" method="post">
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
                <input type="reset" value="清除">
            </div>
        </form>
    </div>
</section>

</body>
</html>