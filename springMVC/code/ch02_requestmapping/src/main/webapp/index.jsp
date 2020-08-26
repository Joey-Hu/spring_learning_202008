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
    <p>First SpringMVC Project</p>
    <p> <a href="test/some.do">发起some.do的get请求</a> </p>
    <form action="test/other.do" method="post">
        <input type="submit" value="post请求other.do">
    </form>
    <p> <a href="test/first.do">发起first.do的请求</a> </p>
</body>
</html>
