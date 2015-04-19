var app = angular.module('ehealthApp', [ "ngRoute" ]);
app.config(function($routeProvider) {
	$routeProvider.when("/login", {
		templateUrl: 'partials/login.html',
        controller: 'LoginCtrl'
	}).when("/measurements", {
		templateUrl: "partials/measurements.html",
		controller: "MeasurementCtrl"
	}).otherwise("/", {
		redirectTo: "/login"
	});
});
