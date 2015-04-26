app.controller("DashboardCtrl", [ "$scope", "$rootScope", function($scope, $rootScope) {
	if ($rootScope.user.token == null) {
		$location.path("/login")
	}
} ]);