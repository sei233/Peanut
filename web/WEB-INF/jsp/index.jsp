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
  </head>
  <body>
  <table border="1">
    <tr>
      <th>游戏名</th>
      <th>标题</th>
      <th>下载量</th>
      <th>大小</th>
      <th>状态</th>
      <th>分类</th>
      <th>平台类型</th>
      <th>推荐类型</th>
    </tr>
<c:forEach items="${gamesList}" var="game" varStatus="s">
    <tr>
      <td>${game.gameName}</td>
      <td>${game.gameTitle}</td>
      <td>${game.gameDownload}</td>
      <td>${game.gameSize}</td>
      <td>${game.gameStatus}</td>
      <td>${game.gameType}</td>
      <td>${game.gameOperation}</td>
      <td>${game.gameAdviseType}</td>
    </tr>
</c:forEach>
  </table>
  </body>
</html>
