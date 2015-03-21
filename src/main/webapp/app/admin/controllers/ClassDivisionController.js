adminUI.controller('ClassDivisionController', function($rootScope, $scope, $route, $modal, DivisionService) {
	console.log("Class Division Controller Loaded");
	
	$rootScope.baseUrl = '/MyLearningProjectOne/';
	$rootScope.SEND_REQUEST = {
								"request":{}
							  }
	
	/*
	 * display pop up screen to add division names
	 */
	var size = 'lg';
	$scope.showAddDivisionpopup = function(){
		console.log("Inside pop up screen"+size);
		$modalInstance = $modal.open({
			templateUrl: 'app/admin/views/add-division.html',
			size: 'lg'
		});
	};
	
	/*
	 * to close pop up window
	 */
	$scope.cancel = function () {
		$modalInstance.close('cancel');
	};
	
	/*
	 * to save division name into database
	 */
	$scope.saveDivisions = function(register){
		console.log("Saving division name");
		$rootScope.SEND_REQUEST.request.payload = register;
		console.log("Division Name==="+JSON.stringify($rootScope.SEND_REQUEST));
		$scope.Url = $rootScope.baseUrl + '';
		console.log("URL=="+$rootScope.baseUrl+" "+$scope.Url);
		DivisionService.saveDivisions($scope.Url, $rootScope.SEND_REQUEST, function(response){
			console.log("Response="+JSON.stringify(response));
		});			
	};
	
	
	
});