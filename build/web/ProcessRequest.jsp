
<%@page import="java.rmi.Naming"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="author" content="Daniel Santos">
        <title>Response</title>
        <!-- Add some styles CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/css/materialize.min.css">

        <!-- Add some JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/js/materialize.min.js"></script>
    </head>
    <body>
  
 <%
    InterfaceRMI inte = (InterfaceRMI) Naming.lookup("rmi://localhost/MessageSystem");
    String name = request.getParameter("name");
    
    String greeting = inte.Greet(name);
    inte.showName(name);
   
    out.println(greeting);
 %>      
    </body>
</html>
