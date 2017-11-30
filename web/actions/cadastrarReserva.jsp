<%-- 
    Document   : efetuarLogout
    Created on : 08/09/2017, 17:06:18
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="fac" class="Controle.Reserva"/>
<!DOCTYPE html>
<html>
      <script type="text/JavaScript">
      setTimeout("location.href = '/Voos.com/index.jsp';",1500);
 </script>
    <body>
        <h1>Cadastro efetuado com sucesso</h1>
        <hr>
        <h2 hidden><%=fac.cadastrarReserva(request)%></h2>
        
    </body>
</html>
