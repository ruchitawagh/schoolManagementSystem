schoolUI.service('DivisionService', function($http) {
	console.log("Division Service loaded");
	
	this.fetchData = function(){
	alert('hello');
		$http.get('app/json/userLogin.json').success(function(response){
			console.log("data" +JSON.stringify(response));
		});
	};
	/*$http.get('../../json/userLogin.json').success(function(response){
		consle.log("data" +response);
	});*/
});