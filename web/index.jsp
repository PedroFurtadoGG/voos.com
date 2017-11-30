<%@include file="/commons/head.jsp" %>
<body>
  <div class="global-wrap">
    <%@include file="/commons/header.jsp" %>
      <!-- TOP AREA -->
      <img src="http://allswalls.com/images/airplane-in-the-sunset-wallpaper-1.jpg">
   </div>
   <!-- END TOP AREA  -->
   <div class="container">
      <div class="search-tabs search-tabs-bg search-tabs-nobox search-tabs-lift-top">
         <div class="tabbable">
            <ul class="nav nav-tabs" id="myTab">
               <li class="active"><a href="#tab-1" data-toggle="tab"><i class="fa fa-plane"></i> <span >Voos</span></a>
               </li>
            </ul>
            <div class="tab-content">
               <div class="tab-pane fade in active">
                  <h2>Procure viagens disponiveis</h2>
                  <form>
                     <div class="row">
                        <div class="col-md-4">
                           <div class="form-group form-group-lg">
                              <label>De</label>
                              <select class="form-control">
                                 <option value="">SELECIONE</option>
                              </select>
                              <label>Para</label>
                              <select class="form-control">
                                 <option value="">SELECIONE</option>
                                
                              </select>
                           </div>
                        </div>
                        <div class="col-md-8">
                           <div class="input-daterange" data-date-format="M d, D">
                              <div class="row">
                                 <div class="col-md-3">
                                    <div class="form-group form-group-lg">
                                       <label>Data de Ida</label>
                                       <input class="form-control" name="dt_incial" type="date" />
                                       <label>Data da volta</label>
                                       <input class="form-control" name="dt_incial" type="date" />
                                    </div>
                                 </div>
                                 <div class="col-md-3">
                                    <div class="form-group form-group-lg form-group-select-plus">
                                       <label>Passageiros</label>
                                       <div class="btn-group btn-group-select-num" data-toggle="buttons">
                                          <label class="btn btn-primary active">
                                          <input type="radio" name="options" />1</label>
                                          <label class="btn btn-primary">
                                          <input type="radio" name="options" />2</label>
                                          <label class="btn btn-primary">
                                          <input type="radio" name="options" />3</label>
                                          <label class="btn btn-primary">
                                          <input type="radio" name="options" />3+</label>
                                       </div>
                                       <select class="form-control hidden">
                                          <option>1</option>
                                          <option>2</option>
                                          <option>3</option>
                                          <option selected="selected">4</option>
                                          <option>5</option>
                                          <option>6</option>
                                          <option>7</option>
                                          <option>8</option>
                                          <option>9</option>
                                          <option>10</option>
                                          <option>11</option>
                                          <option>12</option>
                                          <option>13</option>
                                          <option>14</option>
                                       </select>
                                    </div>
                                 </div>
                              </div>
                           </div>
                        </div>
                     </div>
                     <button class="btn btn-primary btn-lg" type="submit">Buscar</button>
                  </form>
               </div>
            </div>
         </div>
      </div>
      <div class="gap gap-small"></div>
   </div>
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
</body>