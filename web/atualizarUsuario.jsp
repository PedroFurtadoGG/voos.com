<%-- 
    Document   : atualizarUsuario
    Created on : 25/11/2017, 23:13:31
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="fac" class="Controle.Usuario"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%=fac.getUsuarioSingle(request)%>
    </body>
</html>
