app.controller("LoginCtrl", [ "$scope", "$rootScope", "LoginService", function($scope, $rootScope, loginService) {
	if ($rootScope.user.token != null) {
		$scope.message = "You are already logged in!";
	}

	$scope.login = function() {
		console.log($scope.loginUser);
		loginService.login($scope.loginUser).success(function(data, status, headers, config) {
			$rootScope.user.token = headers("Auth-token");
			$rootScope.user.id = data.id
			$rootScope.user.userGroup = data.userGroup;
			$scope.message = "Login succeeded "+data.userId;
			delete $scope.loginUser;
		}).error(function(data, status, headers, config) {
			$scope.message = "Failed login";
		});
	}
} ]);