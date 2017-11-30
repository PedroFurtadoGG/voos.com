<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<jsp:useBean id="fac" class="Controle.Reserva"/>
<%@include file="/commons/head.jsp" %>
<%
   String sessionEmail = (String)session.getAttribute("email");
   String sessionTipo  = (String)session.getAttribute("tipo");
   String sessionSessao = (String)session.getAttribute("sessao");
   %>
<script type="text/javascript">
   $(document).ready(function(){
       $("select").change(function(){
           $(this).find("option:selected").each(function(){
               var optionValue = $(this).attr("value");
               if(optionValue){
                   $(".box").not("." + optionValue).hide();
                   $("." + optionValue).show();
               } else{
                   $(".box").hide();
               }
           });
       }).change();
   });
</script>
<body>
   <div class="global-wrap">
      <header id="main-header">
         <div class="container">
            <div class="nav">
               <ul class="slimmenu">
                  <li>
                     <a class="logo" href="index.jsp">
                     <img src="http://www.kanzenshuu.com/wp-content/themes/kanzenshuu/images/logo_rof.png?x66125" alt="Image Alternative text" title="Image Title" />
                     </a>
                  </li>
                  <!-- Esse if faz o filtro por tipo -->
                  <% if ("A".equals(sessionTipo)) {  %>
                  <li>
                     <a href="#">Usuários</a>
                     <ul>
                        <li><a href="listaUsuarios.jsp">Listagem</a></li>
                        <li><a href="login.jsp">Cadastro</a></li>
                     </ul>
                  </li>
                  <li>
                     <a href="#">Aviões</a>
                     <ul>
                        <li><a href="listaAviao.jsp">Listagem</a></li>
                        <li><a href="formCadastroAviao.jsp">Cadastro</a></li>
                     </ul>
                  </li>
                  <li>
                     <a href="listaCidades.jsp">Cidades</a>
                     <ul>
                        <li><a href="listaCidade.jsp">Listagem</a></li>
                        <li><a href="formCadastroCidade.jsp">Cadastro</a></li>
                     </ul>
                  </li>
                  <% } %>
                  <% if (sessionSessao != null) {  %>
                  <li>
                     <a href="#">Reservas</a>
                     <ul>
                        <li><a href="formReserva.jsp">Reservar</a></li>
                     </ul>
                  </li>
                  <li>
                     <a href="#"><%= sessionEmail %></a>
                     <ul>
                        <li><a href="actions/efetuarLogout.jsp">Logout</a></li>
                     </ul>
                  </li>
                  <% } else { %>
                  <li>
                     <a href="login.jsp">Login/Registrar </a>
                  </li>
                  <% }%>
               </ul>
            </div>
         </div>
      </header>
      <div class="container">
         <h1 class="page-title">Reservas</h1>
      </div>
      <div class="container">
         <div class="row">
            <div class="col-md-14">
               <div class="row">
                  <div class="col-md-10">
                     <form action="actions/cadastrarReserva.jsp" name="cadastrarReserva" method="post">
                        <h4>Informações do voo</h4>
                        <div class="form-group">
                           <label>Classe</label>
                        </div>
                        <select class="form-control" name="classe">
                           <option value="">Selecione</option>
                           <option value="P">Primeira Classe</option>
                           <option value="Ex">Executiva</option>
                           <option value="E">Econômica</option>
                        </select>
                        <div class="form-group P box">
                           <label>Valor Passagem</label>
                           <input class="form-control" required type="text" name="valorPassagem" value="25000" disabled />
                        </div>
                        <div class="form-group Ex box">
                           <label>Valor Passagem</label>
                           <input class="form-control" required type="text" name="valorPassagem" value="35000" disabled />
                        </div>
                        <div class="form-group E box">
                           <label>Valor Passagem</label>
                           <input class="form-control" required type="text" name="valorPassagem" value="45000" disabled />
                        </div>
                        <div class="form-group form-group-lg">
                           <label>Data de Ida</label>
                           <input class="form-control" name="data_ida" type="date" />
                           <label>Data da volta</label>
                           <input class="form-control" name="data_volta" type="date" />
                        </div>
                        <div class="form-group">
                           <%
                              Class.forName("com.mysql.jdbc.Driver").newInstance();
                              String connectionURL = "jdbc:mysql://localhost:3306/voos";
                              Connection connection= DriverManager.getConnection(connectionURL, "root", "");
                              PreparedStatement psmnt = connection.prepareStatement("SELECT * FROM usuarios WHERE email = '"+sessionEmail+"'");
                              ResultSet results = psmnt.executeQuery();
                              while(results.next()){
                              String id_usuario = results.getString(1);
                              %>
                           <input class="form-control" name="id_usuario" value="<%= id_usuario %>"  type="hidden" disabled/>
                           <%} results.close(); psmnt.close(); %>
                           <br>
                        </div>
                        <div class="form-group">
                           <label>Destino</label>
                           <select name="id_aeroporto" class="form-control">
                              <%
                                 PreparedStatement psx = connection.prepareStatement("SELECT * FROM aeroportos");
                                 ResultSet resultsx = psx.executeQuery();
                                 while(resultsx.next()){
                                 String id_aeroporto = resultsx.getString(1);
                                 String nome = resultsx.getString(2);
                                 %>
                              <option value="<%= id_aeroporto %>"><%=nome%></option>
                              <%} resultsx.close(); psmnt.close(); %>
                           </select>
                           <br>
                        </div>
                        <div class="form-group">
                           <label>Poltrona</label>
                           <select name="id_poltrona" class="form-control">
                              <%
                                 PreparedStatement ps2 = connection.prepareStatement("SELECT id_poltrona,nome FROM poltronas");
                                 ResultSet results2 = ps2.executeQuery();
                                 while(results2.next()){
                                 String id_poltrona = results2.getString(1);
                                 String nome = results2.getString(2);
                                 %>
                              <option value="<%= id_poltrona %>"><%=nome%></option>
                              <%} results2.close(); psmnt.close(); %>
                           </select>
                           <br>
                        </div>
                        <div class="form-group">
                           <label>Hora Embarque</label>
                           <input class="form-control" required type="text" name="hr_embarque"/>
                           <input class="form-control" name="status" value="X" hidden disabled/>
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
