adminUI.controller('StaffRegistrationController', function($scope, $rootScope, staffRegistrationService, $route, $modal) {
	console.log("Staff Registration Controller Loaded");
	$rootScope.baseUrl = '/MyLearningProjectOne/';
	var size = 'lg';
	$scope.showAddRegpopup = function(){
		console.log("Inside pop up screen"+size);
		$modalInstance = $modal.open({
			templateUrl: 'app/admin/views/add-staff.html',
			//controller: 'AddStudentController',
			size: 'lg'
		});
	};
	
	$scope.cancel = function () {
		$modalInstance.close('cancel');
	};
		
	$scope.addStaff = function(staff){
		console.log("In Register Staff");
		$scope.staffInfo = staff;
		console.log("Staff Info"+JSON.stringify(staff));	
		$scope.Url = $rootScope.baseUrl + 'registrationStaff.do';
		console.log("URL=="+$scope.Url);
		staffRegistrationService.submitStaffdata($scope.Url, $scope.staffInfo, function(response){
			console.log("Response="+JSON.stringify(response));
		});	
	};
});