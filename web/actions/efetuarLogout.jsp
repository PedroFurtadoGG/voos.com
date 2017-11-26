<%-- 
    Document   : efetuarLogout
    Created on : 08/09/2017, 17:06:18
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="fac" class="Controle.Login"/>
<!DOCTYPE html>

 <script type="text/JavaScript">
      setTimeout("location.href = 'login.jsp';",1500);
 </script>
 
<html>
     
    <body>
        <h1>Resultado da Inscrição</h1>
        <hr>
        <h2><%=fac.efetuarLogout(request)%></h2>
        <br>
        <br>
       
        [<a href="index.jsp">      Voltar para pagina inicial </a>]
    </body>
</html>