<%-- 
    Document   : efetuarLogout
    Created on : 08/09/2017, 17:06:18
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="fac" class="Controle.FormBase"/>
<!DOCTYPE html>

 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmação da Inscrição do Produto</title>
    </head>
    <body>
        <h1>Resultado da Inscrição</h1>
        <hr>
        <h2><%=fac.efetuarLogout(request)%></h2>
        <br>
        <br>
       
        [<a href="index.jsp">      Voltar para pagina inicial </a>]
    </body>
</html>
