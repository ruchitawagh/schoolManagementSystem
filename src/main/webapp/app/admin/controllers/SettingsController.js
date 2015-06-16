adminUI.controller('SettingsController', function($scope, $rootScope, SettingsService, $route, $modal) {
	console.log("Settings Controller Loaded");
	$rootScope.baseUrl = '/MyLearningProjectOne/';
	$scope.showLoading = true;
	$rootScope.emptyData = '';
	var size = 'lg';
	$scope.showAddRegpopup = function(){
		console.log("Inside pop up screen"+size);
		$modalInstance = $modal.open({
			templateUrl: 'app/admin/views/add-academicyear.html',
			//controller: 'AddStudentController',
			size: 'lg'
		});
	};
	
	/*
	 * Fetch academic year details  
	 */
	$rootScope.fetchAcademicDetails = function(){
		$scope.showLoading = true;
		$scope.Url = $rootScope.baseUrl + 'getAcademicYears.do';
		SettingsService.fetchAcademicYearDetails($scope.Url, function(response){
			console.log("Academic Year Response="+JSON.stringify(response));
			if(null != response && response != ""){
				$scope.showLoading = false;
				if(response.academicYears != '' && null != response.academicYears){
					$rootScope.emptyData = '';
					$rootScope.academicDetails = response.academicYears;
				} else {
					$rootScope.emptyData = "No records found";
				}	
			}
		});	
	};
	
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