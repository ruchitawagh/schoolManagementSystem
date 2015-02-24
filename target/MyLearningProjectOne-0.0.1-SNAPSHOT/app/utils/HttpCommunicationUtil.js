/*******************************************************************************
 * Copyright (c) 2014 VMware, Inc. All rights reserved.
 ******************************************************************************/

var HttpCommunicationUtil = function($http, $rootScope, AlertMessaging) {
	var factory = {};
	// Commented "/rest" since its not used now. We gradually need to shift all end-points away from "/rest" since it wont be used and disabled eventually
	//var baseUrl = context + "/rest/";
	//TODO: This endpoint should be used...
	var baseUrl = context + "/api/1.0/";

	factory.doPost = function(url, data, successCallbackFunction, errorCallbackFunction, forbiddenCallbackFunction){
		$http.post(baseUrl + url, data)
		.success(function(data, status, headers, config){
			if(undefined == data.code)
			{
				data["code"] = "Please contact the system administrator for more details.";
			}else{
				data["code"] = "Please contact the system administrator with the code: "+data["code"];
			}
			successCallbackFunction(data, status, headers, config);
		})
		.error(function(data, status, headers, config){
			console.log("Error callback called for url: "+url+" with POST method with status: "+status+" and data: ");
			console.log(data);
			if(null!=data && undefined == data.code)
			{
				data = {};
				data["code"] = "Please contact the system administrator for more details.";
				
				if((null!=data.message && data.message.indexOf("AccessDeniedException")>-1)||status=="403"){
	        		// TODO: Add message to show access denied
					$rootScope.ShowFullScreenLoading = false;
					if(undefined != forbiddenCallbackFunction) {
						forbiddenCallbackFunction(data);
					}
	        	}else{
	        		errorCallbackFunction(data, status, headers, config);
	        	}
			}else if(status=='500'){
				if(null!=data.message && data.message.indexOf("AccessDeniedException")==-1){
					AlertMessaging.showAlert(data.message);
				}
				
				if(undefined != forbiddenCallbackFunction) {
					forbiddenCallbackFunction(data, status);
				}
			}
		});
	},
	
	factory.doPut = function(url, data, successCallbackFunction, errorCallbackFunction, forbiddenCallbackFunction){
		$http.put(baseUrl + url, data)
		.success(function(data, status, headers, config){
			if(undefined == data.code)
			{
				data["code"] = "Please contact the system administrator for more details.";
			}else{
				data["code"] = "Please contact the system administrator with the code: "+data["code"];
			}
			successCallbackFunction(data, status, headers, config);
		})
		.error(function(data, status, headers, config){
			console.log("Error callback called for url: "+url+" with PUT method with status: "+status+" and data: ");
			console.log(data);
			if(null!=data && undefined == data.code)
			{
				data = {};
				data["code"] = "Please contact the system administrator for more details.";
				
				if((null!=data.message && data.message.indexOf("AccessDeniedException")>-1)||status=="403"){
	        		// TODO: Add message to show access denied
					$rootScope.ShowFullScreenLoading = false;
					if(undefined != forbiddenCallbackFunction) {
						forbiddenCallbackFunction(data);
					}
	        	}else{
	        		errorCallbackFunction(data, status, headers, config);
	        	}
			}else if(status=='500'){
				if(null!=data.message && data.message.indexOf("AccessDeniedException")==-1){
					AlertMessaging.showAlert(data.message);
				}
				
				if(undefined != forbiddenCallbackFunction) {
					forbiddenCallbackFunction(data, status);
				}
			}
		});
	},

	factory.doGet = function(url, successCallbackFunction, errorCallbackFunction, params, forbiddenCallbackFunction){
		if(params == null) {
			params = undefined;
		}
		$http.get(baseUrl + url, {params: params})
		.success(function(data, status, headers, config){
			//console.log(url + "====success====" + JSON.stringify(data));
			if(undefined == data.code)
			{
				data["code"] = "Please contact the system administrator for more details.";
			}else{
				data["code"] = "Please contact the system administrator with the code: "+data["code"];
			}
			successCallbackFunction(data, status, headers, config);
		})
		.error(function(data, status, headers, config){
			//console.log(url + "====error====" + JSON.stringify(data));
			console.log("Error callback called for url: "+url+" with method GET with status: "+status+" and data: ");
			console.log(data);
			if(null!=data && undefined == data.code)
			{
				data = {};
				data["code"] = "Please contact the system administrator for more details.";
				
				if((null!=data.message && data.message.indexOf("AccessDeniedException")>-1)||status=="403"){
	        		// TODO: Add message to show access denied
					$rootScope.ShowFullScreenLoading = false;
					if(undefined != forbiddenCallbackFunction) {
						forbiddenCallbackFunction(data);
					}
	        	}else{
	        		errorCallbackFunction(data, status, headers, config);
	        	}
			}else if(status=='500'){
				if(null!=data.message && data.message.indexOf("AccessDeniedException")==-1){
					AlertMessaging.showAlert(data.message);
				}
				
				if(undefined != forbiddenCallbackFunction) {
					forbiddenCallbackFunction(data, status);
				}
			}
		});
	};
	
	factory.doDelete = function(url, successCallbackFunction, errorCallbackFunction, forbiddenCallbackFunction){
		$http.delete(baseUrl+url)
		.success(function(data, status, headers, config){
			if(undefined == data.code)
			{
				data["code"] = "Please contact the system administrator for more details.";
			}else{
				data["code"] = "Please contact the system administrator with the code: "+data["code"];
			}
			successCallbackFunction(data, status, headers, config);
		})
		.error(function(data, status, headers, config){
			console.log("Error callback called for url: "+url+" with method DELETE status: "+status+" and data: ");
			console.log(data);
			if(null!=data && undefined == data.code)
			{
				data = {};
				data["code"] = "Please contact the system administrator for more details.";
				
				if((null!=data.message && data.message.indexOf("AccessDeniedException")>-1)||status=="403"){
	        		// TODO: Add message to show access denied
					$rootScope.ShowFullScreenLoading = false;
					if(undefined != forbiddenCallbackFunction) {
						forbiddenCallbackFunction(data);
					}
	        	}else{
	        		errorCallbackFunction(data, status, headers, config);
	        	}
			}else if(status=='500'){
				if(null!=data.message && data.message.indexOf("AccessDeniedException")==-1){
					AlertMessaging.showAlert(data.message);
				}
				
				if(undefined != forbiddenCallbackFunction) {
					forbiddenCallbackFunction(data, status);
				}
			}
		});
	};
	
	factory.jsonP = function(url, successCallbackFunction, errorCallbackFunction){
		$http.jsonp(url);
	};

	return factory;
};

if(typeof noSecvrmUI !== 'undefined') {
	noSecvrmUI.factory('HttpCommunicationUtil', HttpCommunicationUtil);
}
if(typeof vrmUI !== 'undefined') {
	vrmUI.factory('HttpCommunicationUtil', HttpCommunicationUtil);
}
