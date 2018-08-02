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

    <%--<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>--%>
    <script src="/js/jquery.min.js"></script>
    <link rel="stylesheet" href="/css/bootstrap.min.css">

    <script type="text/javascript">

        function getsecond(){
            var superdept = $("#superdept").find("option:selected").attr("value");      //获取一级部门选中的<option>的属性value
            $.ajax({                                     //AJAX获取二级的部门信息。 注意：这里的ajax采用的是jquery里面的方法，使用前需要导入jquery库。
                url:'${pageContext.request.contextPath }/book/getSeconds.action',
                type:'POST',
                dataType:'JSON',
                data:{
                    topCtgyId:superdept
                },
                success:function (res){
                    var dept = document.getElementById("dept");   //获取二级
                    var deptlength = dept.options.length;
                    if(deptlength >0){              //去除二级的<optioin>的属性值
                        for( var j=0;j<deptlength;j++){
                            dept.options.remove(0)
                        }
                    }
                    var tt = eval(res);     //这边是以json格式返回的，所以要转为数组
                    for(var i = 0;i<tt.length;i++){         //创建二级的<option>
                        addoption(tt[i].subCtgyId,tt[i].subCtgyName)
                    }
                },
                error:function(data){
                    alert("error");
                }
            })
        }


        function addoption(value,text){
            var opt = document.createElement("option");
            opt.value = value;
            opt.text = text;
            dept.options.add(opt)
        }

        $(function () {
            $('#submit').click(function () {
                return window.confirm("您确定更新吗?");
            })
        });
    </script>
</head>
<body bgcolor="#FFFFCC">
<br>
<form action="${pageContext.request.contextPath }/book/update.action?book.bookId=${book.book.bookId}" method="post"
      enctype="multipart/form-data">
    <div class="container">
        <div class="form-group">
            <div><label class="control-label">书籍名称</label></div>
            <div>
                <input class="form-control" type="text" name="book.bookName"
                       placeholder="${book.book.bookName}">
            </div>
        </div>

        <div class="form-group">
            <div><label class="control-label">作者</label></div>
            <div>
                <input class="form-control" type="text" name="book.bookAuthor"
                       placeholder="${book.book.bookAuthor}">
            </div>
        </div>

        <div class="form-group">
            <label>一级分类:</label>
            <select id="superdept" class="btn btn-default" onchange="getsecond()" name="topCtgy.topCtgyId">
                <option value="">${book.topCtgy.topCtgyName}</option>
                <option value="">请选择</option>
                <option value="3">现代都市</option>
                <option value="8">古代言情</option>
                <option value="9">都市言情</option>
                <option value="13">浪漫青春</option>
            </select>
        </div>
        <div class="form-group">
            <label>二级分类:</label>
            <select id="dept" class="btn btn-default" name="subCtgy.subCtgyId">
            </select>
        </div>

        <div class="form-group">
            <div style="display: inline-block">
                <div><label class="control-label">更新状态</label></div>
                <div>
                    <select class="btn btn-default" name="book.bookStatus">
                        <option value="">${book.book.bookStatus}</option>
                        <option value="">----------</option>
                        <option value="0">完结</option>
                        <option value="1">连载</option>
                        <option value="2">太监</option>
                    </select>
                </div>
            </div>
        </div>

        <input id="submit" class="btn btn btn-info" type="submit" value="保存">
    </div>
</form>

</body>
</html>
