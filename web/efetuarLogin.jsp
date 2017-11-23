<%-- 
    Document   : efetuarLogin
    Created on : 08/09/2017, 17:06:18
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="fac" class="Controle.FormBase"/>
<!DOCTYPE html>

 
<html>
     <%@include file="/head.jsp" %>
    <body>
        <h1>Resultado da Inscrição</h1>
        <hr>
        <h2><%=fac.efetuarLogin(request)%></h2>
        <br>
        <br>
       
        [<a href="index.jsp">      Voltar para pagina inicial </a>]
    </body>
</html>
