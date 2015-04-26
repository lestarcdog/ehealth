app.factory("RealtimeDataService", ["$http",function($http) {
	s = {};
	s.getMyPatients = function(userId) {
		return [ {
			subjectId : "patient1",
			name : "Kiss János"
		}, {
			subjectId : "patient2",
			name : "Másik János"
		} ];
	}
	return s;
}]);