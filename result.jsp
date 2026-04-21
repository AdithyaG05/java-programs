<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page language="java" %>
<html>
<head>
<title>Result</title>
</head>
<body>

<h2>Student Result</h2>

<p><b>Roll No:</b> <%= request.getAttribute("roll") %></p>
<p><b>Name:</b> <%= request.getAttribute("name") %></p>

<p>Sub1: <%= request.getAttribute("m1") %></p>
<p>Sub2: <%= request.getAttribute("m2") %></p>
<p>Sub3: <%= request.getAttribute("m3") %></p>
<p>Sub4: <%= request.getAttribute("m4") %></p>
<p>Sub5: <%= request.getAttribute("m5") %></p>

<p><b>Average:</b> <%= request.getAttribute("avg") %></p>

<p><b>Result:</b> <%= request.getAttribute("result") %></p>

<br>
<a href="index.jsp">Go Back</a>

</body>
</html>