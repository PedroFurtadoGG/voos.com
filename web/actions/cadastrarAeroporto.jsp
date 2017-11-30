<%-- 
    Document   : cadastrarAeroporto
    Created on : 29/11/2017, 01:09:43
    Author     : Bruno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="fac" class="Controle.Aeroporto"/>
<!DOCTYPE html>

<script type="text/JavaScript">
      setTimeout("location.href = 'http://localhost:8084/Voos.com/listaAeroporto.jsp';",1000);
 </script> 
<html>
     
    <body>
        <h1>Cadastro efetuado com sucesso</h1>
        <hr>
        <h2 hidden><%=fac.cadastrarAeroporto(request)%></h2>
        
    </body>
</html>
