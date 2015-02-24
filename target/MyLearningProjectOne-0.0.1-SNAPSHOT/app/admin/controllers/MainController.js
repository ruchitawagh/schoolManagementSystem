schoolUI.controller('MainController', function($scope, $route, $rootScope, $location, $window) {
	console.log("Main Controller Loaded");

	$rootScope.loadSelectedPage = function(menuItemUrl) {
		$location.url(menuItemUrl);
	};
	
	$scope.doLogin = function(){
		console.log("Heloo welcome");
		window.location = "admin.jsp";
	};
	
});