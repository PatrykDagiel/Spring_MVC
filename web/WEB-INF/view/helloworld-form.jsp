<%--
  Created by IntelliJ IDEA.
  User: dagiel
  Date: 2018-03-22
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World - Input Form</title>
</head>
<body>

    <form action="processForm" methods="GET">
        <input type="text" name="studentName"
               placeholder="What's your name?"/>
        <input type="submit"/>
    </form>

    <form action="processFormVersionTwo" methods="GET">
        <input type="text" name="studentName"
               placeholder="What's your name to be uppercased?"/>
        <input type="submit"/>
    </form>

</body>
</html>
