<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registration</h1>
<form action="<%=request.getContextPath()%>/StudentServlet" method="post">
<table><tr><td>FirstName:</td><td><input type="text" name="firstName"></td></tr>
<tr><td>LastName:</td><td><input type="text" name="lastName"></td></tr>
<tr><td>Grade:</td><td><input type="text" name="grade"></td></tr>
</table>
<input type="submit" value="Register">
</form>
</body>
</html>