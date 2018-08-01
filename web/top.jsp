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
        position: relative;
        left: 30px;
        top: 20px;
    }
    </style>
</head>
<body bgcolor="#FFFFFF">
<a class="btn btn-info box_relative"
   href="${pageContext.request.contextPath}/user/login.action">登出</a>
</body>
</html>