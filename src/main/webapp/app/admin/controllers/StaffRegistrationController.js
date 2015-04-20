adminUI.controller('StaffRegistrationController', function($scope, $rootScope, $route, $modal) {
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
		
	$scope.registerstudent = function(register){
		console.log("In Register Student");
		$scope.studentInfo = register;
		console.log("Info"+JSON.stringify(register));	
		$scope.Url = $rootScope.baseUrl + 'registrationStudent.do';
		console.log("URL=="+$scope.Url);
		studentRegistrationService.submitStudentdata($scope.Url, $scope.studentInfo, function(response){
			console.log("Response="+JSON.stringify(response));
		});	
	};
});