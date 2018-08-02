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
<form action="${pageContext.request.contextPath }/menu/add2.action" method="post"
      enctype="multipart/form-data">
    <div class="container">
        <div class="form-group">
            <div><label class="control-label">菜单名称</label></div>
            <div>
                <input class="form-control" type="text" name="childMenuName" placeholder="菜单名称">
            </div>
        </div>

        <div class="form-group">
            <div><label>菜单PID</label></div>
            <div>
                <input class="form-control" type="text" name="parentId" placeholder="菜单PID">
            </div>
        </div>

        <div class="form-group">
            <div><label>菜单URL</label></div>
            <div>
                <input class="form-control" type="text" name="childMenuUrl" placeholder="菜单URL">
            </div>
        </div>

        <input id="submit" class="btn btn-info" type="submit" value="保存">
    </div>
</form>

</body>
</html>
