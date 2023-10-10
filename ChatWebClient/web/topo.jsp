<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <img src="<%=session.getAttribute("radavatar")%> " width="60" height="60">
        <font color="<%=session.getAttribute("radcor")%>" size="5">
        <%=session.getAttribute("txtnick")%></font>

    </body>
</html>
