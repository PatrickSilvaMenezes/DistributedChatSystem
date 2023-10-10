<%-- 
    Document   : conversa
    Created on : 23 de ago. de 2023, 20:25:28
    Author     : patri
--%>
<%@page import = "java.rmi.Naming"%>
<%@page import = "middleware.RmiInterfaceWeb"%>
<%@page import = "java.io.FileReader" %>
<%@page import = "java.io.BufferedReader" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="refresh" content="3;conversa.jsp">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Conversa</h1>
        <%
           try{
             RmiInterfaceWeb objRmi = (RmiInterfaceWeb)Naming.lookup("rmi://localhost:6666/ChatServerWeb");
             out.print(objRmi.recoverMsgs());
           }
           catch(Exception e){
                out.print("Erro: " + e.getMessage());
           }
        %>
    </body>
</html>
