<%--
  Created by IntelliJ IDEA.
  User: Lumia
  Date: 2018/12/12
  Time: 13:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="doLogin" method="get">
    用户名：<input type="text" name="username">
    密码：<input type="password" name="password">
    <input type="submit">
    <a href="register">点击注册</a>
<%--    <c:set value="${pageContext.request.contextPath}" var="path" scope="page"/>--%>

    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>

    <script type="text/javascript">
        $(function() {
            alert(1);
        });
    </script>
</form>
</body>
</html>
