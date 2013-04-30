<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><head><title>Online movie store template</title>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="style.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div id="wrapper">
<div id="inner">
<div id="header">
<h1><img src="images/logo.gif" alt="Online Movie Rental" height="63" width="519" /></h1>
<div id="nav"> <a href="http://www.freewebsitetemplates.com">your account</a>
| <a href="http://www.freewebsitetemplates.com">view cart</a>
| <a href="login.jsp">login</a>
</div>
<!-- end nav --> <a href="http://www.freewebsitetemplates.com"><img src="images/header_1.jpg" alt="Harry Potter cd" height="145" width="744" /></a> <a href="http://www.freewebsitetemplates.com"><img src="images/header_2.jpg" alt="" height="48" width="745" /></a> </div>
<!-- end header -->
<dl id="browse">
<dt>Full Category Lists</dt>
<dd class="first"><a href="http://www.freewebsitetemplates.com">Action &amp;
Adventure</a></dd>
<dd><a href="http://www.freewebsitetemplates.com">Anime
&amp; Manga</a></dd>
<dd><a href="http://www.freewebsitetemplates.com">Art
House &amp; International</a></dd>
<dd><a href="http://www.freewebsitetemplates.com">Classics</a></dd>
<dd><a href="http://www.freewebsitetemplates.com">Comedy</a></dd>
<dd><a href="http://www.freewebsitetemplates.com">Cult
Movies</a></dd>
<dd><a href="http://www.freewebsitetemplates.com">Drama</a></dd>
<dd><a href="http://www.freewebsitetemplates.com">New
&amp; Future Releases</a></dd>
<dd><a href="http://www.freewebsitetemplates.com">Horror</a></dd>
<dd><a href="http://www.freewebsitetemplates.com">Musicals</a></dd>
<dd><a href="http://www.freewebsitetemplates.com">Mystery
&amp; Suspense</a></dd>
<dd><a href="http://www.freewebsitetemplates.com">Science
Fiction &amp; Fantasy</a></dd>
<dd class="last"><a href="http://www.freewebsitetemplates.com">Westerns</a></dd>
<dt>Search Your Favourite Movie</dt>
<dd class="searchform">
<form action="?" method="get">
<div>
<select name="cat"><option value="-" selected="selected">CATEGORIES</option><option value="-">------------</option></select>
</div>
<div><input name="q" value="DVD TITLE" class="text" type="text" /></div>
<div class="softright"><input src="images/btn_search.gif" type="image" /></div>
</form>
</dd>
</dl>
<div id="body">
<div class="inner">
<div id="choice" align="center">
<p>
If you are already a registered user, please login below.
</p>
<p>
 If you are not a registered user, Please <a href="Register.jsp"> register </a> here.
</p>
<div id="formcontent" align="center">
<form id="form1" method="post" action="SigninServlet">
        
    <div class="form-row"> 
    Email: <br>
    <input type="text" name="email" size="40" value="${param.email}"/>
    </div>
    
    <div style="color:red">${Error.notuser}
    </div>
    
    <div style="color:red">${Error.wrong}
    </div>
        
    <div class="form-row"> 
    Password:<br>
    <input type="password" name="password" size="40"/>
    </div>

    <div style="color:red">${Error.password}
    </div>
    
    <div class="form-row"> 
    <input class="submit" type="submit" value="Login">
    </div>

    <div style="color:red">${cannot}
    </div>
    <font color="red">
<% if (request.getAttribute("message") != null) { %>
<%=request.getAttribute("message") %>
<% } %></font>
    
        
</form>
</div>
</div>
<div class="clear"></div>
</div>
<!-- end .inner --> </div>
<!-- end body -->
<div class="clear"></div>
<div id="footer"> Web design, Supported by CMPE 273 
<div id="footnav"> Legal 
Privacy
Policy </div>
<!-- end footnav --> </div>
<!-- end footer --> </div>
<!-- end inner --> </div>
<!-- end wrapper -->
</body></html>