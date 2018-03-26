<%--
  Created by IntelliJ IDEA.
  User: dagiel
  Date: 2018-03-26
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">
        First name: <form:input path="firstName"/>
        Last name: <form:input path="lastName"/>
        <input type="submit" value="Submit"/>
        <br>
        Country: <form:select path="country">
            <form:options items="${student.countryOptions}"/>
        </form:select>
        <br><br>
        Favorite Language:
        <form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguages}"/>
        <br>
        Operating Systems:
        Linux <form:checkbox path="operatingSystems" value="Linux"/>
        Mac <form:checkbox path="operatingSystems" value="Mac"/>
        Windows <form:checkbox path="operatingSystems" value="Windows"/>
        <br>
    </form:form>

    

</body>
</html>
