adminUI.controller('AddAcademicYearController', function($scope, $rootScope, SettingsService, $route, $modal) {
	
	/*
	 * to save academic year details
	 */
	$scope.test = function(AcademicYear){
		console.log(JSON.stringify(AcademicYear));
		$scope.academicDetails = AcademicYear;
		$scope.Url = $rootScope.baseUrl + 'addAcademicYear.do';
		SettingsService.addAcademicYearDetails($scope.Url, $scope.academicDetails, function(response){
			console.log("Academic Year POST Response="+JSON.stringify(response));
			$scope.cancel();
			$rootScope.alerts.push({type: 'success', msg: 'Academic year data saved successfully.'});
			$rootScope.fetchAcademicDetails();
		});
	};
	
	
	
	/*
	 * to close popup screen
	 */
	$scope.cancel = function () {
		$modalInstance.close('cancel');
	};
	
});	