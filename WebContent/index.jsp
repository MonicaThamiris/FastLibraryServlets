<!DOCTYPE html>
<html lang="en">
    <head>
             <title>Home - FastLibrary</title>
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
					<li><a href="#">
				    	
					</a></li>
					<li class="pull-right"><a href="" class="text-muted"><i class="fa fa-refresh"></i></a></li>
				
				</ol>
        		<div class="row">
        			<div class="col-xs-6 col-sm-4 col-md-4 col-lg-4">
	                    <div class="well text-center">
	                    	<p><i class="fa fa-users fa-2x text-muted"></i></p>
	                    	<span class="text-muted"><a href="dadosCadastrais.jsp">Dados Cadastrais</a><span class="text-success"></span></span>
	                    </div>
            		</div>
            	</div>
            </div>					
        </section>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <script type="text/javascript">$(document).bind("mobileinit", function(){$.extend(  $.mobile , {autoInitializePage: false})});</script>
        <script src="http://code.jquery.com/mobile/1.3.2/jquery.mobile-1.3.2.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/flot/js/jquery.flot.js" type="text/javascript"></script>
        <script src="assets/flot/js/jquery.flot.stack.js" type="text/javascript"></script>
        <script src="assets/flot/js/jquery.flot.resize.js" type="text/javascript"></script>
        <script src="assets/flot/js/jquery.flot.pie.js" type="text/javascript"></script>
        <script src="assets/flot/js/jquery.flot.categories.js" type="text/javascript"></script>
        <script src="assets/flot/js/jquery.flot.fillbetween.js" type="text/javascript"></script>
        <script src="assets/humane/js/humane.min.js"></script>
        <script src="assets/easypiechart/js/jquery.easypiechart.min.js"></script>
        <script src="assets/biccalendar/js/bic_calendar.min.js"></script>
        <script src="assets/skycons/js/skycons.js"></script>
        <script src="assets/sparkline/js/jquery.sparkline.js"></script>
        <script src="assets/js/leftmenu.js"></script>
        <script src="assets/js/theme.js"></script>
        <script src="assets/js/script.js"></script>
        <script>index();</script>
    </body>
</html>