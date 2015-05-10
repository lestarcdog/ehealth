app.controller("MeasurementCtrl", [ "RealtimeDataService", "$scope", "$location", "$rootScope", function(rtDataService, $scope, $location, $rootScope) {
	 if ($rootScope.user.token == null) {
		$location.path("/login")
	}
	$scope.selectedPatient = {};
	rtDataService.getAllMyPatients($rootScope.user.id).success(function(data, status, headers, config) {
		$scope.mypatients = data
	});

	$scope.selectPatient = function(patient) {
		if ($scope.selectedVitalSign == null) {
			alert("Please select a vital sign parameter");
			return;
		}
		if ($scope.selectedPatient.ssn != null) {
			handler.unobservePatient($scope.selectedPatient);
		}
		$scope.selectedPatient = patient;
		handler.observePatient(patient, $scope.selectedVitalSign);
	}

	$scope.selectedVitalSign = null;
	$scope.vitalSigns = WebConstants.VITAL_SIGNS;
	$scope.notifications = [];

	var handler = new RealTimeDataHandler();
	handler.createWebSocket();
	
	function RealTimeDataHandler() {
		this.socket = $.atmosphere;
		this.subSocket = null;
		this.chart = $("#chartContainer");
		this.dps = [];
		this.request = {
			url : "http://127.0.0.1:10000/measurements",
			logLevel : 'debug',
			transport : 'websocket',
			headers : {"Auth-token" : $rootScope.user.token}		
		};

		this.observePatient = function(patientId,vitalSign) {
			var cmd = new CommandDto("SUBSCRIBE", patientId.ssn);
			this.subSocket.push(JSON.stringify(cmd));
		}

		this.unobservePatient = function(patientId) {
			var cmd = new CommandDto("UNSUBSCRIBE", patientId);
			this.subSocket.push(JSON.stringify(cmd));
		}

		this.request.onMessage = function(response) {
			var message = response.responseBody;
			console.log(message);
			try {
				var message = JSON.parse(message);
				if (message.type == "RealtimeMeasurementDto") {

				} else if (message.type = "RealtimeDecisionDto") {
					message.time = new Date(message.timeInMillis);
					console.log(message.message);
					$scope.notifications.push(message)
				}

			} catch (e) {
				console.log('This does not look like a valid JSON: ', message.data);
				return;
			}
		};

		this.request.onError = function(response) {
			console.log(response)
		};

		this.createWebSocket = function() {
			this.subSocket = this.socket.subscribe(this.request);
		}
	}


} ]);

// DTO class
function CommandDto(command, value) {
	this.command = command;
	this.value = value;
}
