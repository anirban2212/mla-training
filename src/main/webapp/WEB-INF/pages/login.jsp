<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
${msg}
	<form action="home" method="post">
	
	 Email :* <input type="text" name="txtemail" size=50 maxlength="50" required="required"/> <br>
   	 Password :*<input type="password" name="txtpwd" size=50 maxlength="15" required="required"/> <br>
   	 <input type="submit" value="Signin"/>
	
	<input type="reset" value="Reset"/>  
   	
   	</form>
</body>
</html>