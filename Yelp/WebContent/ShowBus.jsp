<%@ page import="java.sql.*"%>
<%@ page import="javax.imageio.*"%>
<%@ page import="java.awt.image.BufferedImage"%>
<%@ page import="java.io.ByteArrayInputStream"%>
<%@ page import="java.util.List"%>
<%@ page import="javax.xml.bind.*"%>
<%@ page import="com.yelp.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<%
        				
		List<BusinessDetail> list  =  (List<BusinessDetail>)  request.getSession().getAttribute("showbb");
		if(list == null)
			System.out.println(" is is nulll");
		else
			System.out.println(" is not null");
		String userid = request.getParameter("id");
		for(BusinessDetail d : list)
		{
			if(d.getUserid().equals(userid))
			{
				out.println("<table>");
				out.println("<tr><th>Business id</th><th>Business Name</th><th>Stars</th><th>Address</th></tr>");
				List<BusinessData> data = d.getBusinessData();
				for(BusinessData x : data)
				{
					if(Float.parseFloat(x.getBusinessStars()) < 3.0 ) 
						continue;
					out.println("<tr>");
					out.println("<td>" + x.getBusinessID() + "</td>" + "<td>" + x.getBusinessName() + 
							"</td>" +  "<td>" + x.getBusinessStars()  + "</td>"  + "<td>" +  x.getBusinessAddress() + "</td>" );
					out.println("</tr>");
				}
				out.println("</table>");
				break;
			}
		}

		%>
		
		
        			


</body>
</html>