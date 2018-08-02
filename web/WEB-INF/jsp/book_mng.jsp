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

        function del() {
            return window.confirm("您确定删除吗?");
        }
    </script>

</head>
<body>
<br>
<div class="container">
    <form action="${pageContext.request.contextPath}/book/search.action" method="post" class="form-inline">
        <div class="form-group">
            <label>书籍ID:</label>
            <input type="text" name="book.bookId" class="form-control" placeholder="想查询的书籍ID">
        </div>
        <div class="form-group">
            <label>书籍名:</label>
            <input type="text" name="book.bookName" class="form-control" placeholder="想查询的书籍名">
        </div>
        <div class="form-group">
            <label>一级分类:</label>
            <select id="superdept" class="btn btn-default" onchange="getsecond()" name="topCtgy.topCtgyId">
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
        <input type="submit" class="btn btn-info" value="查询">
    </form>


    <div>
        <table id="table" border="1" class="table table-striped table-bordered table-hover">
            <tr>
                <th>书籍ID</th>
                <th>书籍名称</th>
                <th>作者</th>
                <th>一级分类id</th>
                <th>一级分类名</th>
                <th>二级分类id</th>
                <th>二级分类名</th>
                <th>更新状态</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${booksList}" var="book" varStatus="s">
                <tr class="active">
                    <td>${book.book.bookId}</td>
                    <td>${book.book.bookName}</td>
                    <td>${book.book.bookAuthor}</td>
                    <td>${book.topCtgy.topCtgyId}</td>
                    <td>${book.topCtgy.topCtgyName}</td>
                    <td>${book.subCtgy.subCtgyId}</td>
                    <td>${book.subCtgy.subCtgyName}</td>
                    <td>${book.book.bookStatus}</td>
                    <td><a href="${pageContext.request.contextPath }/book/update.action?id=${book.book.bookId}">修改</a>
                    </td>
                        <%--<td><a onclick="return del()"
                               href="${pageContext.request.contextPath }/book/delete.action?id=${book.bookId}">删除</a></td>--%>
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
</div>
</body>
</html>
