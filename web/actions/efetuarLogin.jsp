<%-- 
  Document   : efetuarLogout
  Created on : 08/09/2017, 17:06:18
  Author     : Lenovo
  --%>
<%@include file="/commons/sessions.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="fac" class="Controle.Login"/>
<!DOCTYPE html>
<html>
  <body>
    <h1>Resultado da Inscrição</h1>
    <hr>
    <h2 hidden><%=fac.efetuarLogin(request)%></h2>
    <br>
    <%
      if (sessionTipo.equals("A")) {
    %>
    <script type="text/JavaScript">
      setTimeout("location.href = 'login.jsp';",1500);
    </script>
    <% } %>
    <%
      if (sessionTipo.equals("C")) {
    %>
    <script type="text/JavaScript">
      setTimeout("location.href = 'index.jsp';",1500);
    </script>
    <% } %>
</html>
