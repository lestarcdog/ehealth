app.factory("AuthTokenInterceptor", ["$rootScope",function($rootScope) {
	return {
		'request' : function(config) {
			if($rootScope.user.token != null) {
				config.headers["Auth-token"] = $rootScope.user.token;
			}
			return config;
		}
	}
}]);