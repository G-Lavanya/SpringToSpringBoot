<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>       
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<%-- <form method="get" action="search"  modelAttribute="login"> --%>
<!-- 		<input type="text" name="keyword" /> &nbsp; -->
		
	<form:form action="afterLogin" method="get" modelAttribute="login">
			<table border="0" cellpadding="5">
			
				<tr>
					<td>Name: </td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td>Password: </td>
					<td><form:input path="password" /></td>
				</tr>		
				<tr>
<!-- 				<input type="submit" value="Search" /> -->
	
					<td colspan="2"><input type="submit" value="Login"></td>
				</tr>
										
			</table>
		</form:form>
		
</body>
</html>