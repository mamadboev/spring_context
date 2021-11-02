<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: umidjon
  Date: 2/11/2021
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Course List</title>
</head>
<body>
<h3>Welcome User! <c:if test="${not empty message}">${message}</c:if></h3>
<form action="/addCourse" method="post">
    <label for="courseNumber">courseNumber</label>
    <input type="number" name="courseNumber" id="courseNumber">
    <br>
    <label for="courseName">courseName</label>
    <input type="text" name="courseName" id="courseName">
    <br>
    <label for="courseInfo">courseInfo</label>
    <input type="text" name="courseInfo" id="courseInfo">
    <br>
    <input type="submit" value="Send">
</form>

<a href="/allList">List</a>
</body>
</html>
