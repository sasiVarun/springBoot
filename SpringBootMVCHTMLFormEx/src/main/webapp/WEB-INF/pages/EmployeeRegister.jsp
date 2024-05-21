<%@page isELIgnored="false" %>
<html>
	<head>
		<title>Employee Registration</title>
	</head>
	<body>
		<h3> Employee Register Form </h3>
		
		<form method="post" action="save">
		<pre>
			ID    : <input type="text" name ="empId">
			Name  : <input type="text" name ="empName">
			Salary: <input type="text" name ="empSal">			
			<button type="submit">Register</button>
		</pre>
		</form>
	</body>
</html>