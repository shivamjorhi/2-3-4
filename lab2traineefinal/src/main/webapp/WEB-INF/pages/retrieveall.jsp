<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View </title>
</head>
<body>
<h2>View All Books</h2>
    ${msg }
    <table border=1 cellpadding="3" cellspacing="0">
    	<tr>
    		<td>Trainee ID</td>
    		<td>Trainee Name</td>
    		<td>Loacation</td>
    		<td>Domain</td>
    	</tr>
    	<c:forEach items="${trainee }" var="t">
    	<tr>
    		<td>${t.traineeId }</td>
    		<td>${t.traineeName }</td>
    		<td>${t.traineeLocation }</td>
    		<td>${t.traineeDomain }</td>
    	</tr>
    </c:forEach>
    </table>
</body>
</html>