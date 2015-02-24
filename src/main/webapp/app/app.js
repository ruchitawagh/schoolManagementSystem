var schoolUI = angular.module('schoolUI', ['ngRoute','ui.bootstrap']);
var adminUI = angular.module('adminUI', ['ngRoute','ui.bootstrap']);

/**
 * Mapping to the URLs
 */
adminUI.config(function($routeProvider) {
    console.log("Starting mapping the URLs to the controllers and the templates");

    $routeProvider
        .when('/', {
            /*controller: 'LoginController',*/
            templateUrl: 'app/admin/views/admin-dashboard.html'
        })
        /*.when('/login', {
            controller: 'LoginController',
            templateUrl: 'app/views/login.html',
        })*/
		.when('/registration', {
            controller: 'RegistrationController',
            templateUrl: 'app/admin/views/registration.html',
        })
        .when('/admin-dashboard', {
            /*controller: '',*/
            templateUrl: 'app/admin/views/admin-dashboard.html'
        })
        .when('/class-division', {
            /*controller: '',*/
            templateUrl: 'app/admin/views/add-class-division.html'
        })
        .when('/student-dashboard', {
            /*controller: '',*/
            templateUrl: 'app/admin/views/student-dashboard.html'
        });
         /*.when('/dashboard', {
            //controller: 'AdminDashboardController',
            templateUrl: 'app/views/admin-dashboard.html'
        });*/

    console.log("Completed mapping the URLs to the controllers and the templates complete");
    return schoolUI;
});