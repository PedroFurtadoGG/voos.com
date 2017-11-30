<%-- 
    Document   : formCadastroAeroporto
    Created on : 28/11/2017, 21:34:28
    Author     : Bruno
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<jsp:useBean id="fac" class="Controle.Aviao"/>
<%@include file="/commons/head.jsp" %>
<body>
   <div class="global-wrap">
      <%@include file="/commons/header.jsp" %>
      <div class="container">
         <h1 class="page-title">Cadastro de Aeroporto</h1>
      </div>
      <div class="container">
         <div class="row">
            <div class="col-md-14">
               <div class="row">
                  <div class="col-md-10">
                    <form action="actions/cadastrarAeroporto.jsp" name="cadastrarAeroporto" method="post">
                        <h4>Informações do Aeroporto</h4>
                        <div class="form-group">
                           <label>Nome</label>
                           <input class="form-control" required type="text" name="nome" />
                        </div>
                        <div class="form-group">
                           <label>Localização</label>
                           <input class="form-control" required type="text" name="link_localizacao" />
                        </div> 
                        <div class="form-group">
                           <label>Cidade</label>
                           <select name="id_cidade" class="form-control"><option value="">Selecione...</option>
                            <%
                                Class.forName("com.mysql.jdbc.Driver").newInstance();
                                String connectionURL = "jdbc:mysql://localhost:3306/voos";
                                Connection connection= DriverManager.getConnection(connectionURL, "root", "");
                                PreparedStatement psmnt = connection.prepareStatement("select * from cidades ");
                                ResultSet results = psmnt.executeQuery();
                                while(results.next()){
                                
                                String cidade = results.getString(3);
                                String idcidade = results.getString(1);
                            %>
                            <option value="<%= idcidade %>"> <%=cidade%></option>
                            <%} results.close(); psmnt.close(); %>
                            </select><br>
                        </div>
                        <div>
                           <hr>
                           <input type="submit" class="btn btn-primary" value="Salvar">
                        </div>
                    </form>
                  </div>
                 
               </div>
            </div>
         </div>
      </div>
   </div>
   <div class="gap"></div>
   <footer id="main-footer">
      <div class="container">
         <div class="row row-wrap">
            <div class="col-md-3">
               <a class="logo" href="index.html">
               <img src="http://www.kanzenshuu.com/wp-content/themes/kanzenshuu/images/logo_rof.png?x66125" alt="Image Alternative text" title="Image Title" />
               </a>
            </div>
         </div>
      </div>
   </footer>
   <script src="resources/js/jquery.js"></script>
   <script src="resources/js/bootstrap.js"></script>
   <script src="resources/js/slimmenu.js"></script>
   <script src="resources/js/bootstrap-datepicker.js"></script>
   <script src="resources/js/bootstrap-timepicker.js"></script>
   <script src="resources/js/nicescroll.js"></script>
   <script src="resources/js/dropit.js"></script>
   <script src="resources/js/ionrangeslider.js"></script>
   <script src="resources/js/icheck.js"></script>
   <script src="resources/js/fotorama.js"></script>
   <script src="resources/js/typeahead.js"></script>
   <script src="resources/js/card-payment.js"></script>
   <script src="resources/js/magnific.js"></script>
   <script src="resources/js/owl-carousel.js"></script>
   <script src="resources/js/fitvids.js"></script>
   <script src="resources/js/tweet.js"></script>
   <script src="resources/js/countdown.js"></script>
   <script src="resources/js/gridrotator.js"></script>
   <script src="resources/js/custom.js"></script>
   <script src="resources/js/switcher.js"></script>
   </div>
   </div>
</body>
</html>