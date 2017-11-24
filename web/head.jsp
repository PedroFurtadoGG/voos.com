<%-- 
    Document   : head.jsp
    Created on : 22/11/2017, 00:59:17
    Author     : Lenovo
--%>
<!DOCTYPE HTML>
<head>
    <%
      String sessionEmail = (String)session.getAttribute("email");
      String sessionTipo  = (String)session.getAttribute("tipo");
    %>
      <title>Voos.com</title>
      <meta content="text/html;charset=utf-8" http-equiv="Content-Type">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <!-- GOOGLE FONTS -->
      <link href='http://fonts.googleapis.com/css?family=Roboto:400,300,100,500,700' rel='stylesheet' type='text/css'>
      <link href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,400,300,600' rel='stylesheet' type='text/css'>
      <!-- /GOOGLE FONTS -->
      <link rel="stylesheet" href="resources/css/bootstrap.css">
      <link rel="stylesheet" href="resources/css/icomoon.css">
      <link rel="stylesheet" href="resources/css/styles.css">
      <link rel="stylesheet" href="resources/css/mystyles.css">
      <script src="resources/js/modernizr.js"></script>
      <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
   </head>

