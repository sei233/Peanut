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
        .pageTest {
            width: 1000px;
            height: 5px;
            margin-top: 5px;
        }

        .activP {
            background-color: #367fa9 !important;
            color: #fff !important;
        }

        td {
            text-align: center;
        }
    </style>

    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <%--<script src="/js/jquery.min.js"></script>--%>
    <script type="text/javascript" src="/js/page.js"></script>
    <link rel="stylesheet" href="/css/page.css">
    <link rel="stylesheet" href="/css/bootstrap.min.css">

    <script type="text/javascript">
        $(function () {
            $('.pageTest').page({
                leng: 10,//分页总数
                activeClass: 'activP', //active 类样式定义
                clickBack: function (page) {
                    window.location.reload();
                }
            });
        });

        function del() {
            return window.confirm("您确定删除吗?");
        }
    </script>

</head>
<body>
<br>
<div class="container">

    <table id="table" border="1" class="table table-striped table-bordered table-hover">
        <tr>
            <th>书籍ID</th>
            <th>书籍名称</th>
            <th>作者</th>
            <th>更新状态</th>
            <th>操作</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${booksList}" var="book" varStatus="s">
            <tr class="active">
                <td>${book.bookId}</td>
                <td>${book.bookName}</td>
                <td>${book.bookAuthor}</td>
                <td>${book.bookStatus}</td>
                <td><a href="${pageContext.request.contextPath }/book/update.action?id=${book.bookId}">修改</a></td>
                <td><a onclick="return del()"
                       href="${pageContext.request.contextPath }/book/delete.action?id=${book.bookId}">删除</a></td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="10">
                <!--必须要的div-->
                <div class="pageTest"></div>
            </td>
        </tr>
    </table>
</div>
</body>
</html>
