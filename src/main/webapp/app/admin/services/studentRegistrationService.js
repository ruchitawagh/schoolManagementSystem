adminUI.service('studentRegistrationService', function($http) {
	console.log("Student Registration Service");
	/*
	*POST call to register student information 
	*/
	this.submitStudentdata = function(url, data, successFun, errorFun){
		$http.post(url, data).success(function(response){
			successFun(response);
		});
	};
});