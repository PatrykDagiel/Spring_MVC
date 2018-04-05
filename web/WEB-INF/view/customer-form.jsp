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
        .error2 {color:darkred}
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

        Free passes: <form:input path="freePasses"/>
        <form:errors path="freePasses" cssClass="error" />
        <br>
        Postal code: <form:input path="postalCode"/>
        <form:errors path="postalCode" cssClass="error2" />
        <br>
        Course code: <form:input path="courseCode"/>
        <form:errors path="courseCode" cssClass="error2" />
        <br>
        <br>

        <input type="submit" value="Submit">
    </form:form>
</body>
</html>
