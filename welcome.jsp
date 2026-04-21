<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page session="true" %>
<html>
<head>
    <title>Session Example</title>
</head>
<body>

<%
    // 🔥 Set session expiry (1 minute = 60 sec)
    session.setMaxInactiveInterval(60);

    String name = request.getParameter("username");

    // 🆕 First time → store in session
    if (name != null && !name.isEmpty()) {
        session.setAttribute("user", name);
    }

    // 🔁 Get session value
    String user = (String) session.getAttribute("user");

    if (user == null) {
%>
        <h2 style="color:red;">Session expired! Please login again.</h2>
        <a href="index.jsp">Go to Login</a>
<%
    } else {
%>
        <h1 style="color:blue;">Hello <%= user %>!</h1>
        <p>(Session expires in 1 minute)</p>
<%
    }
%>

</body>
</html>