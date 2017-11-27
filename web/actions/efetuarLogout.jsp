<%@include file="/commons/sessions.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="fac" class="Controle.Login"/>
<!DOCTYPE html>
<script type="text/JavaScript">
   setTimeout("location.href = 'http://localhost:8084/Voos.com/login.jsp';",1000);
</script>
<h2 hidden><%=fac.efetuarLogout(request)%></h2>
