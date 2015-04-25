var app = angular.module('ehealthApp', [ "ngRoute" ]);

app.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when("/login", {
		templateUrl : 'partials/login.html',
		controller : 'LoginCtrl'
	}).when("/measurements", {
		templateUrl : "partials/measurements.html",
		controller : "MeasurementCtrl"
	}).otherwise("/", {
		redirectTo : "/login"
	});
} ]);

app.config(["$httpProvider" , function($httpProvider) {
	$httpProvider.interceptors.push("AuthTokenInterceptor");
}]);
