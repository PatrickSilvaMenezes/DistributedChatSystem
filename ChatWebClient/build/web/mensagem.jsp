<%-- 
    Document   : mensagem
    Created on : 23 de ago. de 2023, 20:25:40
    Author     : patri
--%>
<%@page import = "java.rmi.Naming"%>
<%@page import = "middleware.RmiInterfaceWeb"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.io.FileWriter" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Mensagem</h1>
        <form name="frmmsg" method="post" action="mensagem.jsp">
            <b>Mensagem:</b>
            <input type="text" name="txtmsg" maxlength="200" size="210"> <br>
            <input type="submit" name="btnenviar" value="enviar">
        </form>
        
        <%
           try{
             RmiInterfaceWeb objRmi = (RmiInterfaceWeb)Naming.lookup("rmi://localhost:6666/ChatServerWeb");
             String msg = "<img src=\" " + session.getAttribute("radavatar") + "\" widht=\"30\" height=\"30\" +><font color=\""+session.getAttribute("radcor")+"\">" + session.getAttribute("txtnick") + "</font> says: " + request.getParameter("txtmsg") + "<br>";
             objRmi.storeMsg(msg);
           }
           catch(Exception e){
                out.print("Erro: " + e.getMessage());
           }
        %>

    </body>
</html>
