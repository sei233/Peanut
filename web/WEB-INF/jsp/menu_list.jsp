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
        <a class="btn btn-success" href="${pageContext.request.contextPath }/menu/add.action">添加菜单</a>
    </div>
    <br>
    <div>
        <table id="table" border="1" class="table table-striped table-bordered table-hover">
            <tr>
                <th>序号</th>
                <th>菜单名</th>
                <th>PID</th>
                <th>操作</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${menusList}" var="main">
                <tr class="active">
                    <td>${main.menuId}</td>
                    <td>${main.menuName}</td>
                    <td>${main.parentId}</td>
                    <td><a class="btn btn-primary" href="${pageContext.request.contextPath }/menu/update.action?menuId=${main.menuId}">修改</a></td>
                    <td><a class="btn btn-danger" onclick="return del()"
                           href="${pageContext.request.contextPath }/menu/delete.action?menuId=${main.menuId}">删除</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
