<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign up User</title>
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
        	if(IsEmptyOrNull(document.forms["form1"]["stAddress"].value))
        	{
        		alert("Streett Address must be filled out");
          		return false;
        	}
        	if(IsEmptyOrNull(document.forms["form1"]["stAddress"].value))
        	{
        		alert("Streett Address must be filled out");
          		return false;
        	}
        	if(IsEmptyOrNull(document.forms["form1"]["city"].value))
        	{
        		alert("City must be filled out");
          		return false;
        	}
        	if(IsEmptyOrNull(document.forms["form1"]["state"].value))
        	{
        		alert("State must be filled out");
          		return false;
        	}
        	if(IsEmptyOrNull(document.forms["form1"]["zip"].value))
        	{
        		alert("Zip must be filled out");
          		return false;
        	}
        	else
        	{
        		 var re = /^\d{5}([\-]\d{4})?$/;
        		 var zip = document.forms["form1"]["zip"].value;
        		 if( !re.test(zip))
        		 {
        			alert('Invalid ZipCode');
        			return false;
        		  }
        	}
        	if(document.forms["form1"]["mem"].value == "Simple")
        	{
        		var ccnum = document.forms["form1"]["ccnum"].value;
        		if(IsEmptyOrNull(ccnum))
        		{
        			alert('Non Premium members must fill out credit card number');
    			 	return false;
        		}
        		if(ccnum.length != 16)
        		{
        			alert('credit card number must be 16 digits');
    			 	return false;
        		}
        		var regex = /^\s*\d+\s*$/;
        		if( !regex.test(ccnum) ) 
        		{
        			alert('bad input');
    			 	return false;
        		}
        	}
        }
        function IsEmptyOrNull(arg)
        {
        	return (arg==null || arg=="");	
        }
    </script>
</head>
<body>
<form id="form1" method="post" action="SignUpUser" onsubmit="return validateForm()" >
<h1>Sign Up User page</h1>
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
					<td>Membership Type</td>
					<td><select id="mem">
					<option value="Simple">Simple</option>
  					<option value="Premium">Premium</option>
					</select></td>
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
				<tr>
					<td>Street Address</td>
					<td><input type="text" name="stAddress" /></td>
				</tr>
				<tr>
					<td>City</td>
					<td><input type="text" name="city" /></td>
				</tr>
				<tr>
					<td>State</td>
					<td><input type="text" name="state" /></td>
				</tr>
				<tr>
					<td>Zip Code</td>
					<td><input type="text" name="zip" /></td>
				</tr>
				<tr>
					<td>Credit Card Number</td>
					<td><input type="text" name="ccnum" /></td>
					<td>
				</tr>
			</table>
			<br>
			<input type="submit" value="Submit" />
</form>
</body>
</html>