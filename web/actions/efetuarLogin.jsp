<%@include file="/commons/sessions.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="fac" class="Controle.Login"/>
<!DOCTYPE html>
<h2 hidden><%=fac.efetuarLogin(request)%></h2>
<h1>Login efetuado com sucesso</h1>
<script type="text/JavaScript">
   setTimeout("location.href = 'http://localhost:8080/Voos.com/login.jsp';",1500);
</script>