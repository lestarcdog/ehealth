app.controller("MeasurementCtrl", [ "RealtimeDataService", "$scope", "$location", "$rootScope",
		function(rtDataService, $scope, $location, $rootScope) {
			// if ($rootScope.user.token == null) {
			// $location.path("/login")
			// }
			$scope.selectedPatient = {};
			$scope.mypatients = rtDataService.getMyPatients($rootScope.user.userId);
			
			var handler = new RealTimeDataHandler();

			$scope.selectPatient = function(patient) {
				if($scope.selectedVitalSign == null) {
					return;
				}							
				if ($scope.selectedPatient.subjectId != null) {
					handler.unobservePatient($scope.selectedPatient);
				}
				$scope.selectedPatient = patient;
				handler.observePatient(patient,$scope.selectedVitalSign);
			}
			
			$scope.selectedVitalSign = null;
			$scope.vitalSigns = WebConstants.VITAL_SIGNS;

			
			//handler.createWebSocket();
			
		} ]);