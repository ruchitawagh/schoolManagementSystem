adminUI.controller('AdminDashboardController', function($rootScope, $scope, $route, $modal) {
	console.log("Admin Dashboard Loaded...");
	$rootScope.baseUrl = '/MyLearningProjectOne/';
	$rootScope.alerts = [];
	
	//fetch academic year details.
	$scope.fetchAcademicYear = function(){
		$scope.Url = $rootScope.baseUrl + 'getSections.do';
		console.log("URL=="+$scope.Url);
		studentRegistrationService.fetchSectionDetails($scope.Url, function(response){
			console.log("Response="+JSON.stringify(response));
			$scope.sections = response.sections;
		});	
	};
	
	/*
	 * to close alerts notification
	 */
	$scope.closeAlert = function(index) {
		$scope.alerts.splice(index, 1);
    };
});	