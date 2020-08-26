<%--
  Created by IntelliJ IDEA.
  User: huhao
  Date: 2020/8/21
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>请求处理方法返回String类型 - 表示视图</p>
    <form action="returnString.do" method="post">
        姓名：<input type="text" name="name"> <br>
        年龄：<input type="text" name="age"> <br>
        <input type="submit" value="提交参数">

    </form>
</body>
</html>
