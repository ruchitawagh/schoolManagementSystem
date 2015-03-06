schoolUI.service('studentRegistrationService', function(HttpCommunicationUtil) {
	console.log("Student Registration Service");
	this.studentRegistrationService = function(data){
		$http.post('app/json/userLogin.json', data).success(function(response){
			console.log("data" +JSON.stringify(response));
		});
	};
});