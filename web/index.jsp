<%-- 
    Document   : index
    Created on : 21/11/2017, 01:08:10
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="/head.jsp" %>
    <body>
       <form action="efetuarLogin.jsp" class="contact-form" method="post" id="cadastro">
            Nome: <input required type="text" class="form-control" name="email" id="email" value="session" /> <br/>
            Senha <input required type="text" class="form-control" name="senha" id="senha" value="" /> <br/>
             <input type="submit" form="cadastro" value="Submit">Salvar</button>
        </form>
         <% if (sessionTipo == "A") { %>
            <h1><%=sessionEmail%></h1>
            <h1><%=sessionTipo%></h1>
         <% } %>
         
        <a href="efetuarLogout.jsp">Logout</a>
    </body>
</html>
