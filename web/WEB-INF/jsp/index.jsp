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

    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="/js/page.js"></script>

    <script type="text/javascript">
        $(function() {
            $('.pageTest').page({
                leng: 100,//分页总数
                activeClass: 'activP', //active 类样式定义
                clickBack: function (page) {
                    console.log(page)
                }
            });
        });
        function del() {
            return window.confirm("您确定删除吗?");
        }
    </script>
  </head>
  <body bgcolor="#FFFFCC">
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
      <th>操作</th>
      <th>操作</th>
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
      <td><a href="${pageContext.request.contextPath }/update.action?id=${game.gameId}">修改</a></td>
      <td><a onclick="return del()" href="${pageContext.request.contextPath }/delete.action?id=${game.gameId}">删除</a></td>
    </tr>
</c:forEach>
  </table>
  <div class="pageTest"></div>
  </body>
</html>
