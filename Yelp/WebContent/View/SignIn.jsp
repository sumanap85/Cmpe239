<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign In</title>
<LINK REL=STYLESHEET HREF="JSP-Styles.css"  TYPE="text/css">
<script>
function IsValidZipCode(zip) {
    var isValid = /^[0-9]{5}(?:-[0-9]{4})?$/.test(zip);
    if (isValid)
        alert('Valid ZipCode');
    else {
        alert('Invalid ZipCode');
    }
}
function chkzip(value) {
	   var re = /^\d{5}([\-]\d{4})?$/;
	   if(re.test(value))
		   alert('Valid ZipCode');
           else {
               alert('Invalid ZipCode');
		   
	   }
	   //return (re.test(value));
	}

</script>
</head>
<body>
<form id="form1" method="post" action="SignIn">
<TABLE BORDER=5 ALIGN="CENTER">
  <TR><TH CLASS="TITLE">
      Sign In</TABLE>
      <br>
      <br>
Email       <input type="text" name="email"/>
<br>
Password    <input type="password" name="pass"/>
<br>
<input type="submit" value="Submit"/>
<input id="Button1" type="submit" value="Validate" onclick="IsValidZipCode(this.form.zip.value)" />
			<input id="Button2" type="submit" value="Validate2" onclick="chkzip(this.form.zip.value)" />
</form>
</body>
</html>