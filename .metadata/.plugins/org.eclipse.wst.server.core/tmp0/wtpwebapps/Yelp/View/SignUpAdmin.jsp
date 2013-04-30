<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign Up Admin Page</title>
<script type="text/javascript">
       
        function validateForm()
        {
        	if(IsEmptyOrNull(document.forms["form1"]["uid"].value))
        	{
        		alert("User id  must be filled out");
          		return false;
        	}
        	if(IsEmptyOrNull(document.forms["form1"]["pwd"].value))
        	{
        		alert("Password  must be filled out");
          		return false;
        	}
        	if(IsEmptyOrNull(document.forms["form1"]["fname"].value))
        	{
        		alert("First Name must be filled out");
          		return false;
        	}
        	if(IsEmptyOrNull(document.forms["form1"]["lname"].value))
        	{
        		alert("Last Name must be filled out");
          		return false;
        	}
        }
        function IsEmptyOrNull(arg)
        {
        	return (arg==null || arg=="");	
        }
    </script>
</head>
<body>
<form id="form1" method="post" action="SignUpAdmin" onsubmit="return validateForm()">
<h1>Sign Up Admin page</h1>
	<table>
				<tr>
					<td>User ID</td>
					<td><input type="text" name="uid" /></td>
					<td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="pwd" /></td>
					<td>
				</tr>
				<tr>
					<td>First Name</td>
					<td><input type="text" name="fname" /></td>
					<td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lname" /></td>
					<td>
				</tr>
			</table>
			<br>
			<input type="submit" value="Submit" />
</form>

</body>
</html>