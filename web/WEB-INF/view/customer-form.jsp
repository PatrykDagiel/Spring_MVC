<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: dagiel
  Date: 2018-03-29
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        .error {color:red}
    </style>
    <title>Customer registration form</title>
</head>
<body>
<i>Fill out this form. Asterisk (*) means required. </i>
    <form:form action="processForm" modelAttribute="customer">
            First name: <form:input path="firstName"/>
            Last name (*):  <form:input path="lastName"/>
            <form:errors path="lastName" cssClass="error"/>
        <br>
        <input type="submit" value="Submit">
    </form:form>
</body>
</html>
