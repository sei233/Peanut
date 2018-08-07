<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <script src="/js/bootstrap.min.js"></script>
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
<form action="${pageContext.request.contextPath }/role/add.action" method="post"
      enctype="multipart/form-data">
    <div class="container">
        <div class="form-group">
            <div><label class="control-label">角色名称</label></div>
            <div>
                <input class="form-control" type="text" name="roleName" placeholder="角色名称">
            </div>
        </div>

        <div class="form-group">
            <c:forEach items="${menusList}" var="menu" varStatus="s">
                <div>
                    <c:if test="${menu.parentId == 0 }">
                        <a class="btn btn-default nav nav-header collapsed" data-toggle="collapse"
                           data-target="#${s.index}">
                            － ${menu.menuName}
                            <span class="caret"></span>
                        </a>
                    </c:if>
                    <ul id="${s.index}" class="nav nav-list collapse">
                        <c:forEach items="${menusList}" var="childmenu">
                            <c:if test="${childmenu.parentId == menu.menuId }">
                                <li>
                                    <label>
                                        <input name="child" type="checkbox" class="checkbox-inline"
                                               value="${childmenu.menuId}">
                                        <span class="btn">${childmenu.menuName}</span>
                                    </label>
                                </li>
                            </c:if>
                        </c:forEach>
                    </ul>
                </div>
            </c:forEach>
        </div>

        <input id="submit" class="btn btn-info" type="submit" value="保存">
    </div>
</form>

</body>
</html>
