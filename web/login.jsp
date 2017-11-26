<%@include file="/commons/head.jsp" %>
<body>
  <div class="global-wrap">
    <%@include file="/commons/header.jsp" %>
  </div>
  <div class="container">
    <div class="container">
         <h1 class="page-title">Login/Registre-se na Voos.com</h1>
    </div>
    <div class="row" data-gutter="60">
      <div class="col-md-4">
        <h3>Bem vindo</h3>
        <p>Ultricies vestibulum egestas ad cras mollis nam dictumst netus leo facilisis justo maecenas molestie ipsum felis mus cubilia hendrerit vestibulum accumsan consectetur convallis vitae nec sapien diam justo lobortis aenean</p>
        <p>Lobortis tristique interdum curae luctus mattis nisl aenean diam suscipit</p>
      </div>
      <div class="col-md-4">
        <h3>Login</h3>
        <form action="actions/efetuarLogin.jsp" method="post" id="login">
          <div class="form-group form-group-icon-left"><i class="fa fa-user input-icon input-icon-show"></i>
            <label>Usuário</label>
            <input class="form-control" placeholder="email" name="email" type="text" />
          </div>
          <div class="form-group form-group-icon-left"><i class="fa fa-lock input-icon input-icon-show"></i>
            <label>Senha</label>
            <input class="form-control" type="password" name="senha" placeholder="senha" />
          </div>
           <input class="btn btn-primary" type="submit" form="login" value="Logar"></button>
        </form>
      </div>
      <div class="col-md-4">
        <h3>Novo na Voos.com?</h3>
       
        <form action="actions/cadastrarCliente.jsp" method="post" id="cadastrarUsuario">
          <div class="form-group">
            <label>Nome Completo</label>
            <input class="form-control" name="nome" placeholder="Bernardo Santos" type="text" required />
          </div>
          <div class="form-group">
            <label>Email</label>
            <input class="form-control" name="email" placeholder="bnegao@voos.com" type="text" required />
          </div>
          <div class="form-group">
            <label>Cpf</label>
            <input class="form-control" name="cpf" type="text" required />
          </div>
          <div class="form-group">
            <label>Telefone</label>
            <input class="form-control" name="telefone" type="tel" required />
          </div>
          <div class="form-group">
            <label>Data nascimento</label>
            <input class="form-control" name="data_nascimento" type="date" required/>
          </div>
          <div class="form-group">
            <label>Senha</label>
            <input class="form-control" name="senha" type="password"required/>
          </div>
          <input hidden disable type="text" value="C" name="tipo">
          <input class="btn btn-primary" type="submit" value="Cadastrar" />
        </form>
      </div>
    </div>
    <div class="gap gap-small"></div>
  </div>
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
</body>
