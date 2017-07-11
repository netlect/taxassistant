<%@page import="org.netlect.TestDB"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test name</title>
</head>
<body>
<%
out.println(new TestDB().getTestName("2"));
%>

  <form action = "main.jsp" method = "POST">
         test id: <input type = "text" name = "test_id">
         <input type = "submit" value = "Submit" />
  </form>  
    
</body>
</html>
