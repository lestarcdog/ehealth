app.factory("RealtimeDataService", ["$http",function($http) {
	s = {};
	s.getAllMyPatients = function(id) {
		return $http.get("api/getPatients/"+id);
	}
	return s;
}]);