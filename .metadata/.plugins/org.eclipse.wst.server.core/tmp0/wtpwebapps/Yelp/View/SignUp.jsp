<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign Up</title>
<LINK REL=STYLESHEET HREF="JSP-Styles.css"  TYPE="text/css">
</head>
<body>
<H2 ALIGN="CENTER">Sign Up for new Account</H2>

<form id="form1" method="post" action="SignUp">


First Name  <input type="text" name="first"/>
<br>
Last Name   <input type="text" name="last"/>
<br>
Email       <input type="text" name="email"/>
<br>
Password    <input type="password" name="pass"/>
<br>
<input type="submit" value="Submit"/>

</form>


</body>
</html>