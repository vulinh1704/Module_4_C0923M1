<%--
  Created by IntelliJ IDEA.
  User: truon
  Date: 4/15/2024
  Time: 7:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/students/edit" method="post">
    <input type="number" name="id" placeholder="ID" value="${student.id}" readonly>
    <input type="text" name="name" placeholder="Name" value="${student.name}">
    <input type="number" name="age" placeholder="AGE" value="${student.age}">
    <input type="number" name="score" placeholder="SCORE" value="${student.score}">
    <button>Enter</button>
</form>
</body>
</html>
