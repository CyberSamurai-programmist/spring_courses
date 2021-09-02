<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: samurai
  Date: 30.08.2021
  Time: 8:56
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Dear Employee, your details</h2>
<br><br>
Your name: ${employee.name}
<br><br>
Your surname: ${employee.surname}
<br><br>
Your salary: ${employee.salary}
<br><br>
Your Phone number: ${employee.phoneNumber}
<br><br>
Your Email: ${employee.email}
<br><br>
Your department: ${employee.department}
<br><br>
Your car brand: ${employee.carBrand}
<br><br>
Language (s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>${lang}</li>
    </c:forEach>
</ul>
</body>
</html>
