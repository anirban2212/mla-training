<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>


	<h1>Registration</h1>
	<form action="register" method="post">
		First Name:* <input type="text" name="txtfname"
			placeholder="Enter your Firstname" size=50 maxlength="15" autofocus
			required="required" /> <br> 
		Last Name:* <input type="text"
			name="txtlname" placeholder="Enter your Lastname" size=50
			maxlength="15" required="required" /> <br> 
		Grade: * <input type="text" name="txtgrade" placeholder="Enter your grade"
			required="required" /> <br> 
		Address :
		
			<input type="text" name="txtaddress" placeholder="Address" />
			
		Email :* <input type="text" name="txtemail" size=50 maxlength="35"
			required="required" /> <br> 
		Username :*<input type="text"
			name="txtusername" size=50 maxlength="15" required="required" /> <br>
		Password :*<input type="password" name="txtpwd" size=50 maxlength="15"
			required="required" /> <br> 
		<input type="submit" value="Register Here" />

	</form>
	<br>
	<br>

	<h4>
		<a href="login">Already have an Account? Sign-in here</a>
	</h4>

</body>
</html>