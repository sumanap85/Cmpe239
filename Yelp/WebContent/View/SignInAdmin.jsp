<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign In Admin</title>
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
        }
        function IsEmptyOrNull(arg)
        {
        	return (arg==null || arg=="");	
        }
    </script>
</head>
<body>
<form id="form1" method="post" action="SignInAdmin" onsubmit="return validateForm()">
<h1>Admin Sign in page</h1>
<table>
				<tr>
					<td>User ID</td>
					<td><input type="text" name="uid" /></td>
					<td>
				</tr>
				<tr>
					<td>UserPassword</td>
					<td><input type="password" name="pwd" /></td>
					<td>
				</tr>
</table>
<br>
			<input type="submit" value="Submit" />
</form>
</body>
</html>