<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> ${msg }</h1>

<!-- modelAttribute MUST MATCH with attribute defined in Controller's GET method! -->
<form method="post" modelAttribute="login">
Username <input name="username" type="text" />

	<br />
password <input name="password" type="text"/>

	<br />

	<input type="submit" value="Save" />
</form>

</body>
</html>