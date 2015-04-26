var app = angular.module('ehealthApp', [ "ngRoute" ]);

app.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when("/login", {
		templateUrl : 'partials/login.html',
		controller : 'LoginCtrl'
	}).when("/measurements", {
		templateUrl : "partials/measurements.html",
		controller : "MeasurementCtrl"
	}).when("/dashboard", {
		templateUrl : "partials/dashboard.html",
		controller : "DashboardCtrl"
	}).otherwise("/", {
		redirectTo : "/login"
	});
} ]);

app.config([ "$httpProvider", function($httpProvider) {
	$httpProvider.interceptors.push("AuthTokenInterceptor");
	//$httpProvider.defaults.useXDomain = true;
} ]);

app.run(function($rootScope) {
	$rootScope.user = {};
})
