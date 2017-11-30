<%@include file="/commons/sessions.jsp" %>
<header id="main-header">
   <div class="container">
      <div class="nav">
         <ul class="slimmenu">
            <li>
               <a class="logo" href="index.jsp">Home</a>
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
