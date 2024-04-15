<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: truon
  Date: 4/15/2024
  Time: 7:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<a href="/students/add">Add Student</a>

<form action="/students/search" method="get">
    <input type="text" name="nameSearch" placeholder="Enter name">
    <button>Search</button>
</form>
<table border="1">
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Age</td>
        <td>Score</td>
        <td colspan="2">Action</td>
    </tr>
    <c:forEach items="${list}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
            <td>${item.age}</td>
            <td>${item.score}</td>
            <td><button><a href="/students/edit/${item.id}">Sửa</a></button></td>
            <td><button>Xóa</button></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
