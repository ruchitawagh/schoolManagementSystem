schoolUI.service('LoginService', function($http) {
	console.log("Login Service loaded");
	
	/*
	*POST call to check whether user is valid or not
	*/
	this.doLogin = function(url, data, successFun, errorFun){
		$http.post(url, data).success(function(response){
			successFun(response);
		});
	};
});   
