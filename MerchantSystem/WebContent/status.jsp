<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Merchant System</title>
</head>
<body>
<div id="account_control">
	<from action="logout" method="post">
		<label>Welcome, ${account.name}!</label>
		<input type="submit" value="Logout"/>
	</from>
</div>
<div id="content">
	<label>Your current status is: ${account.status }.</label>
</div>
</body>
</html>