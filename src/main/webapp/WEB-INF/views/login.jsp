<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<title>
yahoo!!
</title>
<body>
<form action="login.do" method="post">
<input type="text" name="name">
<input type="password" name="pass">
<input type="submit" name="button">
</form>
<font color="red">${errorMessage} </font>
</body>
</html>