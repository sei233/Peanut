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
    <a class="btn btn-primary btn-block dropdown-toggle" href="${pageContext.request.contextPath}/user/home.action"
       target=main>－ 首页</a>

    <%--<c:forEach items="${sessionScope.menusList}" var="menu" varStatus="s">
        <div>
            <a class="btn btn-primary btn-block nav nav-header collapsed" data-toggle="collapse" data-target="#${s.index}"
               target=main>－ ${menu.mainMenu.menuName}
                <span class="caret"></span>
            </a>
            <ul id="${s.index}" class="btn btn-block nav nav-list collapse">
                <c:forEach items="${menu.childMenu}" var="childmenu">
                    <li>
                        <a href="${pageContext.request.contextPath}${childmenu.menuUrl}"
                           target=main>－ ${childmenu.menuName}</a>
                    </li>
                </c:forEach>
            </ul>
        </div>
    </c:forEach>--%>

    <c:forEach items="${sessionScope.menusList}" var="menu" varStatus="s">
        <div>
            <c:if test="${menu.parentId == 0 }">
                <a class="btn btn-primary btn-block nav nav-header collapsed" data-toggle="collapse"
                   data-target="#${s.index}"
                   target=main>－ ${menu.menuName}
                    <span class="caret"></span>
                </a>
            </c:if>
            <ul id="${s.index}" class="btn btn-block nav nav-list collapse">
                <c:forEach items="${sessionScope.menusList}" var="childmenu">
                    <c:if test="${childmenu.parentId == menu.menuId }">
                        <li>
                            <a href="${pageContext.request.contextPath}${childmenu.menuUrl}"
                               target=main>－ ${childmenu.menuName}</a>
                        </li>
                    </c:if>
                </c:forEach>
            </ul>
        </div>
    </c:forEach>
</div>
</body>
</html>