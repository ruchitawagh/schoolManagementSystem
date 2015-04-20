<html ng-app="adminUI">
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
	<!-- <script src="app/admin/controllers/LoginController.js"></script>-->
	<script src="app/admin/controllers/AdminDashboardController.js"></script>
	<script src="app/admin/controllers/RegistrationController.js"></script>
	<script src="app/admin/controllers/ClassDivisionController.js"></script>
	<script src="app/admin/controllers/MainController.js"></script>
	<script src="app/admin/controllers/StaffRegistrationController.js"></script>
	
	<!-- load services -->
	<script src="app/admin/services/DivisionService.js"></script>
	<script src="app/admin/services/studentRegistrationService.js"></script>
	
	
</head>
<body ng-controller="MainController">
	<!-- <div>
  		<alert ng-repeat="alert in alerts" type="{{alert.type}}" close="closeAlert($index)">{{alert.msg}}</alert>
	</div>-->	
	<div class="navbar">
		<div class="navbar-inner">
			<div class="container-fluid">
				<a class="btn btn-navbar" data-toggle="collapse" data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</a>
				<a class="brand" href="index.html"> <img src="app/img/logo.png" /> <span>ZealTech</span></a>
				<!-- user dropdown starts -->
				<div class="btn-group pull-right" dropdown is-open="status.isopen">
					<!--<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
						<i class="icon-user"></i><span class="hidden-phone"> admin</span>
						<span class="caret"></span>
					</a>-->
					<button type="button" class="btn dropdown-toggle" dropdown-toggle ng-disabled="disabled">
						Admin <span class="caret"></span>
					</button>
					<ul class="dropdown-menu" role="menu">
						<li><a href="#">Logout</a></li>
						<!-- <li class="divider"></li>
						<li><a href="#">Logout</a></li>-->
					</ul>
				</div>
				<!-- user dropdown ends -->
			</div>
		</div>
	</div>
	<!-- topbar ends -->
	<div class="container-fluid">
		<div class="row-fluid">			
			<!-- left menu starts -->
			<div class="span2 main-menu-span">
				<div class="well nav-collapse sidebar-nav">
					<ul class="nav nav-tabs nav-stacked main-menu">
						<li ng-click="loadSelectedPage('admin-dashboard');" style="cursor: pointer;"><a class="ajax-link"><i class="icon-home"></i><span class="hidden-tablet"> Dashboard</span></a></li>
						<li ng-click="loadSelectedPage('student-registration');" style="cursor: pointer;"><a class="ajax-link"><i class="icon-user"></i><span class="hidden-tablet"> Student</span></a></li>
						<li ng-click="loadSelectedPage('student-registration');" style="cursor: pointer;"><a class="ajax-link"><i class="icon icon-black icon-users"></i><span class="hidden-tablet"> Staff</span></a></li>
						<!-- <li><a class="ajax-link" href="chart.html"><i class="icon-list-alt"></i><span class="hidden-tablet"> Fee</span></a></li>
						<li><a class="ajax-link" href="typography.html"><i class="icon-bell"></i><span class="hidden-tablet"> Notification</span></a></li>-->
					</ul>
				</div>
			</div>
			<!-- left menu ends -->

			<div id="content" class="span10">
			<!-- content starts -->
				<div>
					<ul class="breadcrumb">
						<li>
							<a href="#">Home</a> <span class="divider">/</span>
						</li>
						<li>
							<a href="#">Dashboard</a>
						</li>
					</ul>
				</div>       
		
			<ng-view></ng-view>
			
			</div>
			
		</div><!--/fluid-row-->
			
		<hr>

		<footer>
			<p class="pull-left">&copy; Zeal Technology</a> 2012</p>
			<p class="pull-right">Powered by: ZealTech</a></p>
		</footer>
		
	</div><!--/.fluid-container-->

</body>
</html>
