adminUI.service('DivisionService', function($http) {
console.log("Division Service loaded");
	
	/*
	*POST call to save division name
	*/
	this.saveDivisions = function(url, data, successFun, errorFun){
		$http.post(url, data).success(function(response){
			successFun(response);
		});
	};
});