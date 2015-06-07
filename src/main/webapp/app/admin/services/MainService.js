adminUI.service('MainService', function($http) {
console.log("Main Service loaded");
	
	/*
	*GET call to fetch academic years 
	*/
	this.fetchAcademicYearDetails = function(url, successFun, errorFun){
		$http.get(url).success(function(response){
			successFun(response);
		});
	};
});