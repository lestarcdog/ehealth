app.factory("LoginService", ["$http",function($http) {
	q={};
	q.login = function(user) {
		return $http.post("api/login", JSON.stringify(user));
	}
	
	return q;
}]);