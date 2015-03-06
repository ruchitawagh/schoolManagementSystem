schoolUI.service('LoginService', function($http) {
	console.log("Login Service loaded");
	this.doLogin = function(data){
		//var baseUrl = "/MyLearningProjectOne";
		$http.post('/MyLearningProjectOne/login.do', data).success(function(response){
			console.log("data" +JSON.stringify(response));
			return response;
		});
	};
});   
