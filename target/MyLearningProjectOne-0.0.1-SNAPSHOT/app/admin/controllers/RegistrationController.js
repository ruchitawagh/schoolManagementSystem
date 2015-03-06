adminUI.controller('RegistrationController', function($scope, $route, $modal) {
	console.log("Registration Controller Loaded");
	var size = 'lg';
	$scope.showAddRegpopup = function(){
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
	
	$scope.valid = function(){
	$scope.showalerts = 1;
	$scope.message = "ahsvchsavchsavch dvbd hdb bdjbjbj cjbkabj";
	console.log("In valid function");
	};
	
	$scope.registerstudent = function(register){
		console.log("In Register Student");
		console.log("Info"+JSON.stringify(register));	
		studentRegistrationService.submitStudentdata(function(data){
			
		});	
	};
});