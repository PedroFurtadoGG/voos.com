<%-- 
    Document   : atualizarAviao
    Created on : 28/11/2017, 15:55:02
    Author     : Bruno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="fac" class="Controle.Aviao"/>
<!DOCTYPE html>

<script type="text/JavaScript">
      setTimeout("location.href = 'http://localhost:8084/Voos.com/listaAviao.jsp';",1000);
 </script> 

<html>
   
    <body>
        <h1>Aviao Atualizado com Sucesso</h1>
        <h2 hidden ><%=fac.atualizarAviao(request)%></h2>
    </body>
</html>
