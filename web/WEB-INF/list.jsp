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
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Course List</title>
</head>
<body>
<h3>Welcome User!</h3>
<table width="60%" border="2px solid red">
    <c:forEach items="${lists}" var="oneCourse">
        <tr>
            <td>${oneCourse.courseName}</td>
            <td>${oneCourse.courseInfo}</td>
            <td>${oneCourse.courseNumber}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
