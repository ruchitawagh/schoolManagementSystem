<html ng-app="schoolUI">
<head>
	<title>Zeal Tech</title>
	<!-- The styles -->
	<link id="bs-css" href="app/styles/bootstrap-cerulean.css" rel="stylesheet">
	<style type="text/css">
	  body {
		padding-bottom: 40px;
	  }
	  .sidebar-nav {
		padding: 9px 0;
	  }
	</style>
	<link id="bs-css" href="app/styles/bootstrap-cerulean.css" rel="stylesheet">
	<link href="app/styles/bootstrap-responsive.css" rel="stylesheet">
	<link href="app/styles/charisma-app.css" rel="stylesheet">
	<link href="app/styles/jquery-ui-1.8.21.custom.css" rel="stylesheet">
	<link href='app/styles/fullcalendar.css' rel='stylesheet'>
	<link href='app/styles/fullcalendar.print.css' rel='stylesheet'  media='print'>
	<link href='app/styles/chosen.css' rel='stylesheet'>
	<link href='app/styles/uniform.default.css' rel='stylesheet'>
	<link href='app/styles/colorbox.css' rel='stylesheet'>
	<link href='app/styles/jquery.cleditor.css' rel='stylesheet'>
	<link href='app/styles/jquery.noty.css' rel='stylesheet'>
	<link href='app/styles/noty_theme_default.css' rel='stylesheet'>
	<link href='app/styles/elfinder.min.css' rel='stylesheet'>
	<link href='app/styles/elfinder.theme.css' rel='stylesheet'>
	<link href='app/styles/jquery.iphone.toggle.css' rel='stylesheet'>
	<link href='app/styles/opa-icons.css' rel='stylesheet'>
	<link href='app/styles/uploadify.css' rel='stylesheet'> 
	
	<!-- load library files -->
	
	<script src="app/vendor/angular.min.js"></script>
	<script src="app/vendor/angular-route.js"></script>
	<script src="app/vendor/ui-bootstrap-tpls-0.12.0.min.js"></script>
	
		<!-- load javascript files -->
	<script src="app/app.js"></script>



	<!-- load controllers -->
	<!-- <script src="app/admin/controllers/LoginController.js"></script>
	<script src="app/admin/controllers/RegistrationController.js"></script>
	<script src="app/admin/controllers/ClassDivisionController.js"></script> -->
	<script src="app/admin/controllers/MainController.js"></script>
	
	<!-- 
	<script src="app/admin/services/LoginService.js"></script>
	<script src="app/admin/services/DivisionService.js"></script>
	 -->
	
</head>
<body ng-controller="MainController">	
	<div class="container-fluid">
		<div class="row-fluid">
		
			<div class="row-fluid">
				<div class="span12 center login-header">
					<h2>Welcome to Charisma</h2>
				</div><!--/span-->
			</div><!--/row-->
			
			<div class="row-fluid">
				<div class="well span5 center login-box">
					<div class="alert alert-info">
						Please login with your Username and Password.
					</div>
					<form class="form-horizontal">
						<fieldset>
							<div class="input-prepend" title="Username" data-rel="tooltip">
								<span class="add-on"><i class="icon-user"></i></span><input autofocus class="input-large span10" name="username" id="username" type="text" value="admin" />
							</div>
							<div class="clearfix"></div>

							<div class="input-prepend" title="Password" data-rel="tooltip">
								<span class="add-on"><i class="icon-lock"></i></span><input class="input-large span10" name="password" id="password" type="password" value="admin123456" />
							</div>
							<div class="clearfix"></div>

							<div class="input-prepend">
							<label class="remember" for="remember"><input type="checkbox" id="remember" />Remember me</label>
							</div>
							<div class="clearfix"></div>

							<p class="center span5">
							<button type="submit" class="btn btn-primary" ng-click="doLogin();">Login</button>
							</p>
						</fieldset>
					</form>
				</div><!--/span-->
			</div><!--/row-->
				</div><!--/fluid-row-->
		
	</div><!--/.fluid-container-->

</body>
</html>
