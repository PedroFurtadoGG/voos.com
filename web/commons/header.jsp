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
            
            <% if (sessionTipo != null && sessionTipo.equals("A")) {  %>
            <li>
               <a href="#">Usuários</a>
               <ul>
                  <li><a href="listaUsuarios.jsp">Listagem</a></li>
               </ul>
            </li>
            <% } %>
            
            <% if (sessionTipo == "C" && sessionTipo == null) {  %>
            <li>
               <a href="#"><%= sessionEmail %></a>
               <ul>
                  <li><a href="listaUsuarios.jsp">Listagem</a></li>
               </ul>
            </li>
            <% } %>
            
            <% if (sessionSessao != null) {  %>
            
            <li>
               <a href="#"><%= sessionEmail %></a>
               <ul>
                   <li><a href="login.jsp">Login </a></li>
                  <li><a href="actions/efetuarLogout.jsp">Logout</a></li>
               </ul>
            </li>
            <% } else { %>
            <li>
               <a href="login.jsp">Login </a>
            </li>
            <% }%>
            <li>
         </ul>
      </div>
   </div>
</header>
