<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="fac" class="Controle.Aviao"/>
<!DOCTYPE html>
<html>
    <body>
        <h2><%=fac.excluirAviao(request)%></h2>
    </body>
</html>
