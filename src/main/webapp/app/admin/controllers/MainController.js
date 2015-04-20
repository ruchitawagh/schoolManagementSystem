adminUI.controller('MainController', function($scope, $route, $rootScope, $location, $window) {
	console.log("Main Controller Loaded");
	//$rootScope.baseUrl = '/MyLearningProjectOne/';
	//$scope.errorMsg = null;
	
	/*
	 * function to redirect page 
	 */
	$rootScope.loadSelectedPage = function(menuItemUrl) {
		console.log("####"+menuItemUrl);
		$location.url(menuItemUrl);
	};
	
	/*$scope.doLogin = function(login){
		console.log("In login screen");
		$scope.loginDetails = login;
		console.log("Login details=="+JSON.stringify($scope.loginDetails));
		$scope.Url = $rootScope.baseUrl + 'login.do';
		console.log("URL=="+$scope.Url);
		LoginService.doLogin($scope.Url, $scope.loginDetails, function(response){
			console.log("Rasponse==" +JSON.stringify(response));
			if(response.isValidUser == true){
				window.location = "admin.jsp"; //redirect page to admin dashboard
			} else {
				$scope.errorMsg = " The username or password you entered is incorrect.";
			}
				
		});
		
	};*/
	
});