<jsp:useBean id="fac" class="Controle.Cidade"/>
<%@include file="/commons/head.jsp" %>
<body>
   <div class="global-wrap">
      <%@include file="/commons/header.jsp" %>
      <div class="container">
         <h1 class="page-title">Cadastro de cidade</h1>
      </div>
      <div class="container">
         <div class="row">
            <div class="col-md-14">
               <div class="row">
                  <div class="col-md-10">
                     <form action="actions/cadastrarCidade.jsp" name="cadastrarCidade" method="post">
                        <h4>Informações da cidade</h4>
                        <div class="form-group">
                           <label>Nome</label>
                           <input class="form-control" required type="text" name="nome" />
                        </div>
                        <div class="form-group">
                           <label>UF</label>
                           <select name="uf" class="form-control">
                              <option value="AC">Acre</option>
                              <option value="AL">Alagoas</option>
                              <option value="AP">Amapá</option>
                              <option value="AM">Amazonas</option>
                              <option value="BA">Bahia</option>
                              <option value="CE">Ceará</option>
                              <option value="DF">Distrito Federal</option>
                              <option value="ES">Espírito Santo</option>
                              <option value="GO">Goiás</option>
                              <option value="MA">Maranhão</option>
                              <option value="MT">Mato Grosso</option>
                              <option value="MS">Mato Grosso do Sul</option>
                              <option value="MG">Minas Gerais</option>
                              <option value="PA">Pará</option>
                              <option value="PB">Paraíba</option>
                              <option value="PR">Paraná</option>
                              <option value="PE">Pernambuco</option>
                              <option value="PI">Piauí</option>
                              <option value="RJ">Rio de Janeiro</option>
                              <option value="RN">Rio Grande do Norte</option>
                              <option value="RS">Rio Grande do Sul</option>
                              <option value="RO">Rondônia</option>
                              <option value="RR">Roraima</option>
                              <option value="SC">Santa Catarina</option>
                              <option value="SP">São Paulo</option>
                              <option value="SE">Sergipe</option>
                              <option value="TO">Tocantins</option>
                           </select>
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
