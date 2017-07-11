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
