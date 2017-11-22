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
         <% if (request.getAttribute("tipo") == "A") { %>
            <h1><%=session.getAttribute("email")%></h1>
            <h1><%=session.getAttribute("tipo")%></h1>
         <% } %>
         <h1><%=session.getAttribute("tipo")%></h1>
         <% if (request.getAttribute("tipo") == "C") { %>
            <h1><%=session.getAttribute("email")%></h1>
            <h1><%=session.getAttribute("tipo")%></h1>
         <% } %>
        <a href="efetuarLogout.jsp">Logout</a>
    </body>
</html>
