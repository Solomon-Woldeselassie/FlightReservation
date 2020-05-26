<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="saveUser" method="post">
	<pre>
		<label for="firstname"><b>First Name</b></label> <input type="text"
			placeholder="First Name" name="firstName" required>
			
			<label for="lastname"><b>Last Name</b></label> <input type="text"
			placeholder="Last Name" name="lastName" required> 
			
			<label for="email"><b>Email</b></label> <input type="text"
			placeholder="Enter Email" name="email" required> 
			
			<label for="psw"><b>Password</b></label> <input type="password"
			placeholder="Enter Password" name="passWord" required>
			
			<label for="psw"><b>Confirm Password</b></label> <input type="password"
			placeholder="Confirm Password" name="confirmPassWord" required>

		<button type="submit" class="btn btn-primary" value ="sumbit">Submit</button>
		</pre>
	</form>

</body>
</html>