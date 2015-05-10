app.factory("LoginService", ["$http",function($http) {
	q={};
	q.login = function(user) {
		return $http.post("api/login", JSON.stringify(user));
	}
	q.findUserById = function(id) {
		return $http.get("api/getCitizen/"+id);
	}
	return q;
}]);