adminUI.controller('RegistrationController', function($scope, $rootScope, studentRegistrationService, $route, $modal) {
	console.log("Registration Controller Loaded");
	$rootScope.baseUrl = '/MyLearningProjectOne/';
	var size = 'lg';
	$scope.showpopup = function(){
		console.log("Inside pop up screen"+size);
		$modalInstance = $modal.open({
			templateUrl: 'app/admin/views/add-student.html',
			//controller: 'AddStudentController',
			size: 'lg'
		});
	};
	
	$scope.cancel = function () {
		$modalInstance.close('cancel');
	};
	
	/*$rootScope.alerts = [
	                 { type: 'danger', msg: 'Oh snap! Change a few things up and try submitting again.' },
	                 { type: 'success', msg: 'Well done! You successfully read this important alert message.' }
	               ];
	
	$scope.valid = function(){
	$scope.showalerts = 1;
	$scope.message = "ahsvchsavchsavch dvbd hdb bdjbjbj cjbkabj";
	console.log("In valid function");
	};
	*/
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
	
	$scope.fetchSections = function(){
		$scope.Url = $rootScope.baseUrl + 'getSections.do';
		console.log("URL=="+$scope.Url);
		studentRegistrationService.fetchSectionDetails($scope.Url, function(response){
			console.log("Response="+JSON.stringify(response));
			$scope.sections = response.sections;
		});	
	};
	
	//$rootScope.fetchAcademicDetails();
});