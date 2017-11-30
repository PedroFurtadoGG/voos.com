<%-- 
    Document   : excluirAeroporto
    Created on : 29/11/2017, 01:13:38
    Author     : Bruno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="fac" class="Controle.Aeroporto"/>
<!DOCTYPE html>
<script type="text/JavaScript">
      setTimeout("location.href = 'http://localhost:8084/Voos.com/listaAviao.jsp';",1000);
 </script> 
<html>
    <body>
        <h2><%=fac.excluirAeroporto(request)%></h2>
    </body>
</html>
