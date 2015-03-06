schoolUI.controller('MainController', function($scope, $route, $rootScope, LoginService, $location, $window) {
	console.log("Main Controller Loaded");

	$rootScope.loadSelectedPage = function(menuItemUrl) {
		$location.url(menuItemUrl);
	};
	
	$scope.doLogin = function(login){
		console.log("In login screen");
		console.log("Login details=="+JSON.stringify(login));
		$scope.loginDetails = login;
		console.log("####"+JSON.stringify($scope.loginDetails));
		LoginService.doLogin($scope.loginDetails, function(response){
			console.log("Rasponse" +JSON.stringify(response));
		});
		//window.location = "admin.jsp";
	};
	
});