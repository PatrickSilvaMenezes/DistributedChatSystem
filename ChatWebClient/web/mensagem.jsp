<%-- 
    Document   : mensagem
    Created on : 23 de ago. de 2023, 20:25:40
    Author     : patri
--%>
<%@page import = "java.rmi.Naming"%>
<%@page import = "middleware.EmojiUtils"%>
<%@page import = "middleware.RmiInterfaceWeb"%>
<%@page import = "middleware.RmiInterfaceDesktop"%>
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
   try {
       String msgText = request.getParameter("txtmsg");
           // Verifique se um avatar foi escolhido; caso contrário, defina um avatar padrão
        String avatar = (String) session.getAttribute("radavatar");
        if (avatar == null || avatar.isEmpty()) {
            session.setAttribute("radavatar", "imagens/default_avatar.png");
        }

       if (msgText != null) {
           RmiInterfaceWeb objRmiWeb = (RmiInterfaceWeb) Naming.lookup("rmi://localhost:6666/ChatServerWeb");
           RmiInterfaceDesktop objRmiDesktop = (RmiInterfaceDesktop) Naming.lookup("rmi://localhost:7777/ChatServerDesktop");

           String msgWeb = "<img src=\"" + session.getAttribute("radavatar") + "\" width=\"30\" height=\"30\"><font color=\"" + session.getAttribute("radcor") + "\">" + session.getAttribute("txtnick") + "</font> says: " + EmojiUtils.transformToEmoji(msgText) + "<br>";

           String msgDesktop = "<font color=\"" + session.getAttribute("radcor") + "\">" + session.getAttribute("txtnick") + "</font> says: " + msgText + "<br>";

           if (msgText.contains(":-)") || msgText.contains(":-(") || msgText.contains(":-/")) {
               msgDesktop = "<font color=\"" + session.getAttribute("radcor") + "\">" + session.getAttribute("txtnick") + "</font> says: " + msgText.replaceAll(":-\\)|:-\\(|:-/", "") + "<br>";
           }

           objRmiWeb.storeMsg(msgWeb);
           objRmiDesktop.storeMsg(msgDesktop);
       }
   } catch (Exception e) {
       out.print("Erro: " + e.getMessage());
   }
        %>


    </body>
</html>
