adminUI.service('staffRegistrationService', function($http) {
console.log("Staff Registration Service loaded");
	
	/*
	 * POST call to save staff details
	 */
	this.submitStaffdata = function(url, data, successFun, errorFun){
		$http.post(url, data).success(function(response){
			successFun(response);
		});
	};
});