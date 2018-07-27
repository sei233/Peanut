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
</head>
<body bgcolor="#EBC79E">
<h3>FrameB</h3>
<table id="table" border="1">
    <c:forEach items="${menusList}" var="menu" varStatus="s">
        <tr>
            <td>${menu.gameName}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
