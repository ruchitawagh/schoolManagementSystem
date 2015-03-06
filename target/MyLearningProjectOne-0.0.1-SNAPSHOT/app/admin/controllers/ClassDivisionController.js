adminUI.controller('ClassDivisionController', function($scope, $route, $modal) {
	console.log("Class Division Controller Loaded");
	var size = 'lg';
	$scope.showAddDivisionpopup = function(){
		console.log("Inside pop up screen"+size);
		$modalInstance = $modal.open({
			templateUrl: 'app/admin/views/add-division.html',
			//controller: 'AddStudentController',
			size: 'lg'
		});
	};
	
	$scope.cancel = function () {
		$modalInstance.close('cancel');
	};
	
	$scope.valid = function(){
	$scope.showalerts = 1;
	$scope.message = "ahsvchsavchsavch dvbd hdb bdjbjbj cjbkabj";
	console.log("In valid function");
	};
	
	$scope.saveDivision = function(DivisionName){
		console.log("In division");
		console.log("Info"+DivisionName);
		
		DivisionService.fetchData();			
	};
	
	
	
});