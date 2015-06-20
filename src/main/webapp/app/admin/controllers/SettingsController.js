adminUI.controller('SettingsController', function($scope, $rootScope, SettingsService, $route, $modal) {
	console.log("Settings Controller Loaded");
	$rootScope.baseUrl = '/MyLearningProjectOne/';
	$scope.showLoading = true;
	$rootScope.emptyData = '';
	var size = 'lg';
	$scope.showAddAcademicYearpopup = function(){
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
	
	$scope.edit = function(index){
		$scope.position = index;
		$rootScope.editAcademicYear($scope.position);
	};
});