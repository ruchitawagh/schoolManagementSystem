adminUI.service('SettingsService', function($http) {
console.log("Settings Service loaded");
	
	/*
	*GET call to fetch academic details
	*/
	this.fetchAcademicYearDetails = function(url, successFun, errorFun){
		$http.get(url).success(function(response){
			successFun(response);
		});
	};
	
	/*
	 * POST call to save academic details
	 */
	this.addAcademicYearDetails = function(url, data, successFun, errorFun){
		$http.post(url, data).success(function(response){
			successFun(response);
		});
	};
});