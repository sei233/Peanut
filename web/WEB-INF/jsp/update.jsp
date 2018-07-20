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
<body bgcolor="#FFFFCC">

<form style="text-align: center" action="${pageContext.request.contextPath }/update.action?game.gameId=${game.gameId}" method="post"
      enctype="multipart/form-data">
    <div>
        <div><label>游戏名称</label></div>
        <div>
            <input style="background-color: #EbEbEb" type="text" name="game.gameName" placeholder="${game.gameName}">
        </div>
    </div>

    <div>
        <div><label>游戏标题</label></div>
        <div>
            <input style="background-color: #EbEbEb" type="text" name="game.gameTitle" placeholder="${game.gameTitle}">
        </div>
    </div>

    <div>
        <div><label>游戏大小</label></div>
        <div>
            <input style="background-color: #EbEbEb" type="text" name="game.gameSize" placeholder="${game.gameSize}">
        </div>
    </div>

    <%--<div>--%>
        <%--<div><label>游戏图标</label></div>--%>
        <%--<div>--%>
            <%--<input type="file"  name="iconFile"/>--%>
        <%--</div>--%>
    <%--</div>--%>

    <div>
        <div><label>游戏详情图片</label></div>
        <div>
            <c:if test="${game.gamePic !=null}">
                <img src="/pic/${game.gamePic}" width=100 height=100/>
                <br/>
            </c:if>
            <input type="file"  name="pictureFile">
        </div>
    </div>

    <div>
        <div><label>ios下载地址</label></div>
        <div>
            <input style="background-color: #EbEbEb" type="text" name="game.gameIosaddress" placeholder="${game.gameIosaddress}">
        </div>
    </div>

    <div>
        <div><label>android下载地址</label></div>
        <div>
            <input style="background-color: #EbEbEb" type="text" name="game.gameAndroidaddress" placeholder="${game.gameAndroidaddress}">
        </div>
    </div>

    <div>
        <div style="display: inline-block">
            <div><label>推荐类型</label></div>
            <div>
                <select name="game.gameAdviseType">
                    <option value="">${game.gameAdviseType}</option>
                    <option value="">----------</option>
                    <option value="0">普通</option>
                    <option value="1">最新</option>
                    <option value="2">精选</option>
                    <option value="3">首页推荐</option>
                </select>
            </div>
        </div>
        <div style="display: inline-block">
            <div><label>状态</label></div>
            <div>
                <select name="game.gameStatus">
                    <option value="">${game.gameStatus}</option>
                    <option value="">----------</option>
                    <option value="0">下线</option>
                    <option value="1">启用</option>
                </select>
            </div>
        </div>
    </div>

    <div>
        <div style="display: inline-block">
            <div><label>游戏分类</label></div>
            <div>
                <select name="game.gameType">
                    <option value="">${game.gameType}</option>
                    <option value="">----------</option>
                    <option value="0">休闲益智</option>
                    <option value="1">网络游戏</option>
                    <option value="2">动作冒险</option>
                    <option value="3">棋牌中心</option>
                    <option value="4">飞行射击</option>
                    <option value="5">经营策略</option>
                    <option value="6">角色扮演</option>
                    <option value="7">体育竞技</option>
                </select>
            </div>
        </div>
        <div style="display: inline-block">
            <div><label>平台类型</label></div>
            <div>
                <select name="game.gameOperation">
                    <option value="">${game.gameOperation}</option>
                    <option value="">----------</option>
                    <option value="0">all</option>
                    <option value="1">ios</option>
                    <option value="2">android</option>
                </select>
            </div>
        </div>
    </div>

    <div>
        <div><label>游戏描述</label></div>
        <div>
            <input style="background-color: #EbEbEb" type="text" name="game.gameDescription" placeholder="${game.gameDescription}">
        </div>
    </div>

    <input type="submit" value="保存">
</form>

</body>
</html>
