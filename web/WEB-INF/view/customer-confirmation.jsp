<%--
  Created by IntelliJ IDEA.
  User: PatrykDagiel
  Date: 01.04.2018
  Time: 19:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer Confirmation Page</title>
</head>
<body>
The customer is confirmed : ${customer.firstName} ${customer.lastName}
<br>
Customer free passes: ${customer.freePasses}
<br>
Customer postal code: ${customer.postalCode}
Customer course code: ${customer.courseCode}
</body>
</html>
