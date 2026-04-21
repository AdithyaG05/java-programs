

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page session="true" %>
<html>
<head>
    <title>Check Session</title>
</head>
<body>

<%
    String user = (String) session.getAttribute("user");

    if (user == null) {
%>
        <h2 style="color:red;">Session Expired!</h2>
        <a href="index.jsp">Login Again</a>
<%
    } else {
%>
        <h2 style="color:blue;">Hello <%= user %>!</h2>
        <p>Your session is still active.</p>
        <a href="checkSession.jsp">Refresh to check again</a>
<%
    }
%>

</body>
</html>
