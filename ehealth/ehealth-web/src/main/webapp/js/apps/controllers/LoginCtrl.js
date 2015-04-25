app.controller("LoginCtrl", [ "$scope", "$rootScope", "LoginService", function($scope, $rootScope, loginService) {
	if ($rootScope.user != null) {
		$scope.message = "You are already logged in!";
	}

	$scope.login = function() {
		console.log($scope.loginUser);
		loginService.login($scope.loginUser).success(function(data, status, headers, config) {
			if (status == 200) {
				$rootScope.user.token = headers("Auth-token");
				$rootScope.user.username = $scope.loginUser.username;
				delete $scope.loginuser;
			} else {
				$scope.message = "Invalid login. Try again";
			}

		});
	}
} ]);