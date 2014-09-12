<!DOCTYPE html>
<html lang="en">
    <head>
  			<title>Dados Cadastrais - FastLibrary</title>
            <%@ include file="head.jsp" %>
    </head>
    <body>
       <!-- Menu -->
       <%@ include file="menu.jsp" %>
              
        <div class="overlay"></div>
        <div class="controlshint"><img src="assets/img/swipe.png" alt="Menu Help"></div>
        <section class="wrap">
            <div class="container">
            	<ol class="breadcrumb">
				
				</ol>
                <div class="row">
                    <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">
                        <div class="well">
                            <div class="header">Dados Cadastrais <a class="headerclose"><i class="fa fa-times pull-right"></i></a> <a class="headerrefresh"><i class="fa fa-refresh pull-right"></i></a> <a class="headershrink"><i class="fa fa-chevron-down pull-right"></i></a></div>
                            <form action="UsuarioController" method="post">
                                <fieldset>
                                    <div class="form-group">
                                        <input id="nome" name="nome" type="text" placeholder="Nome" class="form-control">
                                    </div>
                                    <div class="form-group">
                                        <input id="sobrenome" name="sobrenome" type="text" placeholder="Sobrenome" class="form-control">
                                    </div>
                                    <div class="form-group">
                                        <input id="cpf" name="cpf" type="text" placeholder="CPF" class="form-control">
                                    </div>
                                </fieldset>
                        </div>
                        </div>
                    <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6">
                        <div class="well">
                            <div class="header">Dados de Acesso<a class="headerclose"><i class="fa fa-times pull-right"></i></a> <a class="headerrefresh"><i class="fa fa-refresh pull-right"></i></a> <a class="headershrink"><i class="fa fa-chevron-down pull-right"></i></a></div>
                                <fieldset>
                                    <div class="form-group">
                                        <input id="email" name="email" type="email" placeholder="Email" class="form-control">
                                    </div>
                                    <div class="form-group">
                                        <input id="login" name="login" type="text" placeholder="Login" class="form-control">
                                    </div>
                                    <div class="form-group">
                                        <input id="senha" name="senha" type="password" placeholder="Senha" class="form-control">
                                    </div>	
                                    <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6 perspective">
										<button class="cbtn cbtn-8 cbtn-8a btn-block" type="submit">Salvar</button>
									</div>
                                </fieldset>
                        g    </form>
                        </div>   
                     </div>   
        </section>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <script type="text/javascript">$(document).bind("mobileinit", function(){$.extend(  $.mobile , {autoInitializePage: false})});</script>
        <script src="http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/autosize/js/jquery.autosize.min.js"></script>
        <script src="assets/knob/js/jquery.knob.js"></script>
        <script src="assets/bootstrapmaxlength/js/bootstrap-maxlength.min.js"></script>
        <script src="assets/select2/js/select2.min.js"></script>
        <script src="assets/fseditor/js/jquery.fseditor-min.js"></script>
        <script src="assets/js/leftmenu.js"></script>
        <script src="assets/js/theme.js"></script>
        <script src="assets/js/script.js"></script>
        <script>formcomponents();</script>
        
    </body>
</html>