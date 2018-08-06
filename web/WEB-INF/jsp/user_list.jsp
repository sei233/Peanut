<%--
  Created by IntelliJ IDEA.
  User: 石乾
  Date: 2018/7/18
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>

    <style type="text/css">
        td {
            text-align: center;
        }
    </style>

    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <%--<script src="/js/jquery.min.js"></script>--%>

    <link rel="stylesheet" href="/css/bootstrap.min.css">

    <script type="text/javascript">

        function del() {
            return window.confirm("您确定删除吗?");
        }
    </script>

</head>
<body>
<br>
<div class="container">
    <div>
        <a class="btn btn-success" href="${pageContext.request.contextPath }/user/add.action">添加用户</a>
    </div>
    <br>
    <div>
        <table id="table" border="1" class="table table-striped table-bordered table-hover">
            <tr>
                <th>序号</th>
                <th>账号</th>
                <th>角色</th>
                <th>状态</th>
                <th>操作</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${usersList}" var="userVo">
                <tr class="active">
                    <td>${userVo.user.userId}</td>
                    <td>${userVo.user.userName}</td>
                    <td>${userVo.roleVo}</td>
                    <td>${userVo.userState}</td>
                    <td><a class="btn btn-primary" href="${pageContext.request.contextPath }/user/update.action?id=${userVo.user.userId}">修改</a></td>
                    <td><a class="btn btn-danger" onclick="return del()"
                           href="${pageContext.request.contextPath }/user/delete.action?id=${userVo.user.userId}">删除</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
