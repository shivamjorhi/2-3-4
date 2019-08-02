<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<h1>${msg }</h1>
<form method="post" modelAttribute="add">
Trainee id<input type="text" name="traineeId" />
<br>
Trainee Name<input type="text" name="traineeName" />
<br>
Trainee Location<input type="radio" name="traineeLocation" value="Chennai" />Chennai
<input type="radio" name="traineeLocation" value="Bangalore" />Bangalore
<input type="radio" name="traineeLocation" value="Pune" />Pune
<input type="radio" name="traineeLocation" value="Mumbai" />Mumbai
<br>
Trainee Domain<select name="traineeDomain">
<option value="Please Select">Please Select</option>
<option value="java">Java</option>
<option value="dotnet">Dotnet</option>
<option value="dotnet">Android</option>
</select>
<br>
<input type="submit" value="Add trainee"/>
</form>
</body>
</html>