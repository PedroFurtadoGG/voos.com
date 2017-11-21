<%-- 
    Document   : index
    Created on : 21/11/2017, 01:08:10
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <form action="efetuarLogin.jsp" class="contact-form" method="post" id="cadastro">
            Nome: <input required type="text" class="form-control" name="email" id="email" value="session" /> <br/>
            Senha <input required type="text" class="form-control" name="senha" id="senha" value="" /> <br/>
             <input type="submit" form="cadastro" value="Submit">Salvar</button>
        </form>
        <h1><%=session.getAttribute("PjtLoginFiltro_name")%></h1>
    
    </body>
</html>
