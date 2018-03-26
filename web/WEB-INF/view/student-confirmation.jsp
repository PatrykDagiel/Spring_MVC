<%--
  Created by IntelliJ IDEA.
  User: dagiel
  Date: 2018-03-26
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<html>
<head>
    <title>Confirmation for this student</title>
</head>
<body>
    This student confirmed is ${student.firstName} ${student.lastName}
    <br>
    Student's country: ${student.country}
    <br>
    Student's favourite language is: ${student.favoriteLanguage}
    <br>
    Operating Systems:
    <ul>
        <c:forEach var="temp" items="${student.operatingSystems}">
        <li> ${temp} </li>
        </c:forEach>
    </ul>
</body>
</html>
