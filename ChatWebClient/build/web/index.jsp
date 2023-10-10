<%-- 
    Document   : index
    Created on : 4 de ago. de 2023, 11:52:53
    Author     : thomas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <form action="sala.jsp" method="GET" name="frmlogin">
        <table>
            <tr>
                <td bgcolor="green" colspan="2" align="center">
                    <font color="white" size="+2">Login</font>
                </td>
            </tr>
            <tr>
                <td>Nick:</td>
                <td> <input type="text" name="txtnick" size="100" maxlength"20" /></td>
            </tr>
            <tr>
                <td>Cor:</td>
                <td>
                    <input type="radio" name="radcor" value="blue" /> <font color="blue">Azul</font>
                    <input type="radio" name="radcor" /> <font color="red">Vermelho</font>
                    <input type="radio" name="radcor"/> <font color="black">Preto</font>
                    <input type="radio" name="radcor"/> <font color="green">Verde</font>
                </td>
            </tr>
             <tr>
                <td>Avatar:</td>
                <td>
                    <input type="radio" name="radavatar" value="imagens/avatar1.png"/> <img src="imagens/avatar1.png" width="40" height="40"></img>
                    <input type="radio" name="radavatar" value="imagens/avatar2.png"/> <img src="imagens/avatar2.png" width="40" height="40"></img>
                    <input type="radio" name="radavatar" value="imagens/avatar3.png"/> <img src="imagens/avatar3.png" width="40" height="40"></img>
                    <input type="radio" name="radavatar" value="imagens/avatar4.png"/> <img src="imagens/avatar4.png" width="40" height="40"></img>
                </td>
            </tr>
            <tr></tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" name="cmd" value="Entrar">
                </td>
                    
            </tr>
        </table>
        </form>
        
        
    </center>
</body>
</html>