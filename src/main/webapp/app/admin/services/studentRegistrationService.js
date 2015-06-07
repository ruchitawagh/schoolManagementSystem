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
	
	/*
	 * GET API call to fetch sections
	 */
	this.fetchSectionDetails = function(url, successFun, errorFun){
		$http.get(url).success(function(response){
			successFun(response);
		});
	};
});