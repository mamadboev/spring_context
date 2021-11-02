<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: umidjon
  Date: 2/11/2021
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Lists</title>
</head>
<body>
<h4>All List</h4>
<ul>
    <c:if test="${not empty lists}">
        <c:forEach var="listItem" items="${lists}">
            <li>${listItem.courseNumber} - ${listItem.courseInfo} - ${listItem.courseName}</li>
            <br>
        </c:forEach>
    </c:if>
</ul>
</body>
</html>
