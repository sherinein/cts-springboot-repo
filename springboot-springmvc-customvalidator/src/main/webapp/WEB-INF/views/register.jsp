<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error{color:red}
</style>
</head>
<body>
<form:form action="submitregister" method="POST" modelAttribute="student">
<table>
    <tr>
        <td>User Name :</td>
        <td><form:input path="userName" />
        	<form:errors path="userName" cssClass="error"/>
        </td>
        
    </tr>
    <tr>
        <td>Password :</td>
        <td><form:password path="password" />
        <form:errors path="password" cssClass="error"/>
        </td>
    </tr>
    <tr>
        <td><input type="submit" value="Register"></td>
        <td><input type="reset" value="Cancel"></td>
    </tr>
</table>
</form:form>


</body>
</html>