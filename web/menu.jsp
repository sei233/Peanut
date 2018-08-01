<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 石乾
  Date: 2018/7/18
  Time: 19:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <script src="/js/jquery.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>

    <link rel="stylesheet" href="/css/bootstrap.min.css">
</head>
<body bgcolor="#EBC79E">

<div class="container">
    <h3>菜单</h3>
    <c:forEach items="${sessionScope.menusList}" var="menu">
        <div class="dropdown">
            <a class="btn btn-primary btn-block dropdown-toggle" data-toggle="dropdown"
               target=main>－ ${menu.mainMenu.menuName}
                <span class="caret"></span>
            </a>
            <ul class="btn btn-info btn-block dropdown-menu">
                <li>
                    <a href="${pageContext.request.contextPath}${menu.mainMenu.menuUrl}"
                       target=main>－ ${menu.mainMenu.menuName}</a>
                </li>
                <c:forEach items="${menu.childMenu}" var="childmenu">
                    <li>
                        <a href="${pageContext.request.contextPath}${childmenu.childMenuUrl}"
                           target=main>－ ${childmenu.childMenuName}</a>
                    </li>
                </c:forEach>
            </ul>
        </div>
    </c:forEach>
</div>
</body>
</html>