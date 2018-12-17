<%--
  Created by IntelliJ IDEA.
  User: Lumia
  Date: 2018/12/11
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a>这是b</a>

<%=session.getAttribute("session")%>
<%=application.getAttribute("servletContext")%>
<%
    pageContext.setAttribute("pageContext","pageContextValue");
%>
<%=pageContext.getAttribute("pageContext")%>

<%--<%
    pageContext.setAttribute("key","value");
    request.setAttribute("key","value");
    session.setAttribute("key","value");
    application.setAttribute("key","value");

    request.getRequestDispatcher("indexc.jsp").forward(request,response);

%>--%>
</body>
</html>
