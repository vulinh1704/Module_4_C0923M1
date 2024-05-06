<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: truon
  Date: 5/3/2024
  Time: 7:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${errors}" var="error">
    <p>${error.key}: ${error.value}</p>
</c:forEach>
<form action="/students/add" method="post">
    <input type="text" name="name" placeholder="Name">
<%--    <c:if test="${not empty errors.fieldError('name')}">--%>
<%--        <span>Lỗi ${errors.fieldError('name').defaultMessage}</span>--%>
<%--    </c:if>--%>
    <input type="number" name="age" placeholder="Age">
    <input type="number" name="score" placeholder="Score">
    <input type="text" name="email" placeholder="Email">
<%--    <input type="text" name="classRoom.id" placeholder="Class Room Id">--%>
    <select name="classRoom.id">
        <c:forEach items="${classRooms}" var="item">
            <option value="${item.id}">${item.name}</option>
        </c:forEach>
    </select>
    <button>Submit</button>
</form>
</body>
</html>
