<%--
  Created by IntelliJ IDEA.
  User: samurai
  Date: 27.08.2021
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ask Employee details</title>
</head>
<body>

<form:form action="showDetails" modelAttribute="employee">

    <h2>Dear Employee, Please enter your details</h2>
    <hr>
    <br><br>

    Name <form:input path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <br><br>
    Department <form:select path="department">
<%--    <form:options items="${employee.departments}"/>--%>
    <form:option value="Information Technology" label="IT"/>
    <form:option value="Human Resources" label="HR"/>
    <form:option value="Sales" label="Sales"/>
</form:select>

    <input type="submit" value="OK"/>

</form:form>
</body>
</html>
