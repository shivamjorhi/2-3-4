<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>

</head>

<body>

<h3>${msg }</h3>
    <form method="post">
        Enter Trainee id : <input type="text" value="0" name="id"/>
        <input type="submit" value="find"/>
    </form>

    <c:if test="${trainee !=null}">
    <form action="edit-save" method="post" modelAttribute="trainee">
    <table border=1 cellpadding="3" cellspacing="0">
    <tr>
    <td>Trainee Id</td> <td><input name="traineeId" value="${trainee.traineeId}"/></td>
    </tr>
    <tr>
    <td>Name</td> <td><input name="traineeName" value="${trainee.traineeName}"/></td>
    </tr>
    <tr>
    <td>Domain</td> <td><input name="traineeDomain" value="${trainee.traineeDomain}"/></td>
    </tr>
    <tr>
    <td>Location</td> <td><input name="traineeLocation" value="${trainee.traineeLocation}"/></td>
    </tr>
    <tr>
    <td colspan="3"> 
    <input type="submit" value="save"/> 
    </td>
    </tr>
        
    </table>
    </form>
    </c:if>
</body>

</html>