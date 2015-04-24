app.factory("LoginService", ["$http",function($http) {
	q={};
	q.login = function() {
		$http.get("/api/login").then(function(value) {
			console.log(value);
		}, function(reason) {
			console.log(reson)
		}, function(value) {
			console.log(value);
		});
	}
	
	return q;
}]);