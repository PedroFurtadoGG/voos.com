<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="fac" class="Controle.Aviao"/>
<!DOCTYPE html>
<html>
     <script type="text/JavaScript">
      setTimeout("location.href = '/Voos.com/listaAviao.jsp';",1500);
 </script>
    <body>
        <h2><%=fac.excluirAviao(request)%></h2>
    </body>
</html>
