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
            
            <% if (sessionTipo == "A" && sessionEmail == "admin@admin.com.br") {  %>
            <li>
               <a href="#">Usuários</a>
               <ul>
                  <li><a href="listaUsuarios.jsp">Listagem</a></li>
               </ul>
            </li>
            <% } %> 
            
            <li>
               <a href="#">Usuários</a>
               <ul>
                  <li><a href="listaUsuarios.jsp">Lista de Usuários</a></li>
               </ul>
            </li>
         </ul>
      </div>
   </div>
</header>
