<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
   <body>
       <iframe src="topo.jsp" width="100%" height="150"></iframe>
       <iframe src="conversa.jsp" width="100%" height="400"></iframe>
       <iframe src="mensagem.jsp" width="100%" height="150"></iframe>
      <%-- <%
           /*out.print("O valor de txtnick: " + request.getParameter("txtnick")+ "<br/>");
           out.print("O valor de <b>radcor</b>: " + request.getParameter("radcor") + "<br/>");*/
        %>
        O valor de <u>radavatar</u> é: <% /*out.print(request.getParameter("radavatar")); */%>
        Os valores são: <b><%/*= request.getParameter("txtnick")*/%></b>--%>
       
      <% 
       session.setAttribute("txtnick", request.getParameter("txtnick"));
       session.setAttribute("radcor", request.getParameter("radcor"));
       session.setAttribute("radavatar", request.getParameter("radavatar"));
      %>
    </body>
</html>
