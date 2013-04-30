<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Place ad</title>
<LINK REL=STYLESHEET HREF="JSP-Styles.css"  TYPE="text/css">
</head>
<body>
<form id="form1" method="post" action="PlaceAd">
<table BORDER=5 ALIGN="CENTER">
  <TR><TH CLASS="TITLE">Place Ad</TH></TR>
  </table>
  <br>
  
  <TABLE align="center">
      	<tr><td>item name</td><td><input type="text" name="name"/></td></tr>
	  	<tr><td>item Description</td><td><input type="text" name="descp"/></td></tr>
		<tr><td>item quantity</td><td><input type="text" name="qty"/></td></tr>
		<tr><td>item price</td><td><input type="text" name="price"/></td></tr>
		<tr><td>Seller's Info</td><td><input type="text" name="sellerinfo"/></td></tr>
	</TABLE>
	<br>
<center><input type="submit" value="Submit"/></center>


</form>

</body>
</html>