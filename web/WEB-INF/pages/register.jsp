<%--
  Created by IntelliJ IDEA.
  User: Lumia
  Date: 2018/12/12
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="doRegister" method="post">
    用户名：<input type="text" name="username"></br>
    密码：<input type="password" name="password"></br>
    确认密码：<input type="password" name="passwords"></br>
    电话：<input type="text" name="telephone"></br>
    <input type="submit" value="确认注册">
</form>
</body>
</html>
