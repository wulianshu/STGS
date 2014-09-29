<%--
  Created by IntelliJ IDEA.
  User: Seins D Fic
  Date: 2014/9/29
  Time: 21:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
这是注入测试页面
<form action="base.htm" method="post">
    <input type="text" id="loginName" name="loginName" value="${loginName}"/>
    <input type="text" id="loginPassword" name="loginPassword" value="${loginPassword}"/>
    <input type="submit"  value="跳转到注入测试页面"/>
</form>
</body>
</html>
