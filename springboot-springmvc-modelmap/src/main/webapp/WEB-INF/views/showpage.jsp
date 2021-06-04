<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="calculateCost" modelAttribute="ticket" method="POST" >
<table>
 <tr>
        <td>Movie Name </td>
        <td><form:input path="movieName" name="movieName"/></td>
    </tr>
    <tr>
        <td>circleType </td>
        <td><form:select path="circleType" name="circleType" id="circleType">
        	<form:options items="${circleList}"/>
        	</form:select></td>
    </tr>
    <tr>
        <td>Number of Tickets</td>
        <td><form:input path="noOfTickets" name="noOfTickets"/></td>
    </tr>
    <tr>
        <td><input type="submit" value="CalculateCost"></td>
        
    </tr>
</table>
</form:form>
</body>
</html>