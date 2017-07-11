
<%@page import="org.netlect.TestDB"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
   <head>
      <title>Using GET and POST Method to Read Form Data</title>
   </head>
   
   <body>
      <center>
      <h1>Using GET Method to Read Form Data</h1>
      
      <ul>
         <li><p><b>test name by id:</b>
            <%= request.getParameter("test_id")%>
         </p></li>
      </ul>
   
   </body>
</html>
