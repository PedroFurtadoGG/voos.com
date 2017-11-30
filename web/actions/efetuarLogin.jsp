<%@include file="/commons/sessions.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="fac" class="Controle.Login"/>
<!DOCTYPE html>
 <script type="text/JavaScript">
      setTimeout("location.href = '/Voos.com/index.jsp';",1500);
 </script>
<h2 hidden><%=fac.efetuarLogin(request)%></h2>



