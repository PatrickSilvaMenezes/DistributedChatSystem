<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.io.IOException"%>
<%@page import="java.net.DatagramPacket"%>
<%@page import="java.net.InetAddress"%>
<%@page import="java.net.MulticastSocket"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="refresh" content="2;publicidade.jsp">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String [] sRet;
            MulticastSocket socketMulticast = new MulticastSocket(3333);
            InetAddress grupo = InetAddress.getByName("239.0.0.1");
            socketMulticast.joinGroup(grupo);
            byte[] msg = new byte[256];
            DatagramPacket datagrama = new DatagramPacket(msg, msg.length);
            socketMulticast.receive(datagrama);
            sRet = new String(datagrama.getData()).trim().split("/");
            System.out.print(sRet);
        %>
        <img src="imagens/ads/<%=sRet[sRet.length-1]%>" width="100%" height="400"/>
    </body>
</html>
