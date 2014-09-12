<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png">
        <link rel="shortcut icon" href="assets/ico/favicon.png">
        <title>Legend</title>
        <link href="assets/bootstrap/css/bootstrap.css" rel="stylesheet">
        <link href="assets/css/styles.css" rel="stylesheet">
        <!--[if lt IE 9]>
        <script src="assets/js/html5shiv.js"></script>
        <script src="assets/js/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        <section class="login">
	        <div class="login-panel">
	        <h3 class="text-muted">Login</h3>
	        	<form role="form" action="Login" method="post">
		        	<input class="form-control" name="login" placeholder="Usuário" type="text">
		        	<div class="input-group">
				      <input type="password" name="senha" class="form-control" placeholder="Senha">
				      <span class="input-group-btn">
				        <button class="btn btn-default btn-lg" type="submit">Login</button>
				      </span>
				    </div>
	        	</form>
	        	<hr />
	        	<p class="text-muted text-center"><a href="#">Esqueceu a senha ?
	        	<p class="text-muted text-center">Ou</p>
	        	<p class="text-muted text-center">Ainda não é cadastrado ? <a href="register.html">Criar conta !</a></p>
	        </div>
        </section>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <script type="text/javascript">$(document).bind("mobileinit", function(){$.extend(  $.mobile , {autoInitializePage: false})});</script>
        <script src="http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/backstretch/js/jquery.backstretch.min.js"></script>
        <script src="assets/js/theme.js"></script>
        <script src="assets/js/script.js"></script>
        <script>login();</script>
    </body>
</html>