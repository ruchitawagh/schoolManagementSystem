schoolUI.controller('LoginController', function($scope, $route, $rootScope, LoginService, $location, $window) {
	console.log("Login Controller Loaded");
	/*$rootScope.SEND_REQUEST = {
								"request":{}
				 			  }*/
	$rootScope.baseUrl = '/MyLearningProjectOne/';
	$scope.errorMsg = null;
	$rootScope.loadSelectedPage = function(menuItemUrl) {
		$location.url(menuItemUrl);
	};
	
	$scope.doLogin = function(login){
		console.log("In login screen");
		$scope.loginDetails = login;
		console.log("Login details=="+JSON.stringify($scope.loginDetails));
		$scope.Url = $rootScope.baseUrl + 'login.do';
		console.log("URL=="+$scope.Url);
		LoginService.doLogin($scope.Url, $scope.loginDetails, function(response){
			console.log("Rasponse==" +JSON.stringify(response));
			if(response.status == "Success"){
				window.location = "admin.jsp"; //redirect page to admin dashboard
			} else {
				$scope.login = '';
				$scope.errorMsg = response.msg;
			}	
		}, function(response){
			
		});
		
	};
	
});