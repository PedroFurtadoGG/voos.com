<%@include file="/commons/sessions.jsp" %>
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
               <a href="#">Cidades</a>
               <ul>
                  <li><a href="listaCidade.jsp">Listagem</a></li>
                  <li><a href="formCadastroCidade.jsp">Cadastro</a></li>
               </ul>
            </li>
            <li>
               <a href="#">Aeroportos</a>
               <ul>
                  <li><a href="listaAeroporto.jsp">Listagem</a></li>
                  <li><a href="formCadastroAeroporto.jsp">Cadastro</a></li>
               </ul>
            </li>
            <% } %>
            <% if (sessionSessao != null) {  %>
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
