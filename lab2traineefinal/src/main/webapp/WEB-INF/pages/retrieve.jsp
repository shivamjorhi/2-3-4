<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Trainee</title>
</head>
<body>
<h3>Retrieve operation</h3>

    <form method="post">
    <table>
    <tr>
      <td>  Enter Trainee id : </td>
      <td><input type="text" value="0" name="traineeId"/></td>
        <td><input type="submit" value="find"/></td>
        </tr>
        </table>
    </form>
    <br>
  <c:if test="${trainee !=null}">
    <table border=1 cellpadding="3" cellspacing="0">
    <tr>
    <td>Trainee Id</td>
    <td>Trainee Name</td>
    <td>Trainee Domain</td>
    <td>Trainee Location</td>
    </tr>
      
        <tr>
        	<td>${trainee.traineeId }</td>
    		<td>${trainee.traineeName }</td>
    		<td>${trainee.traineeLocation }</td>
    		<td>${trainee.traineeDomain }</td>
        </tr>
       
    </table>
     </c:if>
    </body>
    </html>
</body>
</html>