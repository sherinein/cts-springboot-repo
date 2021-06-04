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
<form:form action="submitregister" method="POST" modelAttribute="emp">
<table>
    <tr>
        <td>Emp Name :</td>
        <td><form:input path="empName" />
        	<form:errors path="empName" cssClass="error"/>
        </td>
        
    </tr>
    <tr>
        <td>Date of Joining:</td>
        <td><form:input path="doj" />
        <form:errors path="doj" cssClass="error"/>
        </td>
    </tr>
    <tr>
        <td>Phone Number :</td>
        <td><form:input path="phoneNo" />
        <form:errors path="phoneNo" cssClass="error"/>
        </td>
    </tr>
    <tr>
        <td>Password :</td>
        <td><form:input path="email" />
        <form:errors path="email" cssClass="error"/>
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