<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="submitlogin" method="POST" modelAttribute="login">
<table>
    <tr>
        <td><spring:message code="label.userName"/></td>
        <td><form:input path="userName" /></td>
    </tr>
    <tr>
        <td><spring:message code="label.password"/></td>
        <td><form:password path="password" /></td>
    </tr>
    <tr>
        <td><input type="submit" value="Login"></td>
        <td><input type="reset" value="Cancel"></td>
    </tr>
</table>
</form:form>


</body>
</html>