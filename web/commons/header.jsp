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
        <li>
          
        </li>
        <li>
        </li>
       
        <% if(sessionSessao != null) {  %>
            <li>
              <a href="actions/efetuarLogout.jsp">Logout</a>
            </li>
            <% }else{ %>
            <li>
              <a href="login.jsp">Login </a>
            </li>
         <% } %>
        <li>
        </li>
        <li>
        </li>
      </ul>
    </div>
  </div>
</header>
