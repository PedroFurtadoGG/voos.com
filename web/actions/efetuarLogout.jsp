<%@include file="/commons/sessions.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="fac" class="Controle.Login"/>
<!DOCTYPE html>
<script type="text/JavaScript">
   setTimeout("location.href = 'http://localhost:8080/Voos.com/login.jsp';",1);
</script>
<h1>Deslog efetuado com sucesso <%= sessionEmail %></h1>
<h2 hidden><%=fac.efetuarLogout(request)%></h2>
