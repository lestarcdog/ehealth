app.controller("DashboardCtrl", [ "$scope", "$rootScope", "LoginService", function($scope, $rootScope, LoginService) {
	if ($rootScope.user.token == null) {
		$location.path("/login")
	}

	LoginService.findUserById($rootScope.user.id).success(function(data, status, headers, config) {
		console.log(data);
		$scope.localUser = data;
	})
} ]);