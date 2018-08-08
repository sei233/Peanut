<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title></title>

    <link rel="stylesheet" href="/css/bootstrap.min.css">


    <style>
    body{
    background-image: url(../image/timg.jpg);
    background-size:cover;
    }

    .box_relative{
        position: absolute;
        right: 50px;
        bottom: 20px;
    }
    .label_relative{
        position: relative;
        left: 20px;
        top: 30px;
    }
    </style>
</head>
<body bgcolor="#FFFFFF">
<label class="control-label label_relative"><h3>花生地铁管理系统欢迎您,${sessionScope.USER_SESSION}</h3></label>
<a class="btn btn-danger box_relative"
   href="${pageContext.request.contextPath}/user/login.action">登出</a>
</body>
</html>