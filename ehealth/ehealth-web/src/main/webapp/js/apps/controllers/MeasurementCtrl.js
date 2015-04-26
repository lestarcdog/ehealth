app.controller("MeasurementCtrl", [ "RealtimeDataService", "$scope", "$location", "$rootScope", function(rtDataService, $scope, $location, $rootScope) {
	// if ($rootScope.user.token == null) {
	// $location.path("/login")
	// }
	$scope.selectedPatient = {};
	$scope.mypatients = rtDataService.getMyPatients($rootScope.user.userId);

	$scope.selectPatient = function(patient) {
		if($scope.selectedPatient.subjectId != null) {
			handler.unobservePatient($scope.selectedPatient.subjectId);
		}
		$scope.selectedPatient = patient;
		handler.observePatient(patient.subjectId)
	}

	var handler = new RealTimeDataHandler();
	handler.createWebSocket();

} ]);

function RealTimeDataHandler() {
	this.socket = $.atmosphere;
	this.subSocket;
	this.chart = $("#chartContainer");
	this.dps = [];
	this.request = {
		url : "http://127.0.0.1:9090/measurements",
		logLevel : 'debug',
		transport : 'websocket',
	};
	
	this.observePatient = function(patientId) {
		var cmd = new CommandDto("SUBSCRIBE",patientId);
		this.subSocket.push(JSON.stringify(cmd));
	}
	
	this.unobservePatient = function(patientId) {
		var cmd = new CommandDto("UNSUBSCRIBE",patientId);
		this.subSocket.push(JSON.stringify(cmd));
	}

	this.request.onMessage = function(response) {
		var message = response.responseBody;
		console.log(message);
		try {
			var realData = JSON.parse(message);
			var date = new Date(realData.time * 1000);
			console.log(realData.id + ":" + date.toLocaleTimeString() + ":" + realData.value);
			this.dps.push({
				x : date.getTime(),
				y : realData.value,
				label : "cat2"
			});
			chart.render();

		} catch (e) {
			console.log('This does not look like a valid JSON: ', message.data);
			return;
		}
	};

	this.request.onError = function(response) {
		console.log(response)
	};

	this.createWebSocket = function () {
		this.subSocket = this.socket.subscribe(this.request);
	}
}


function CommandDto(command,value) {
	this.command = command;
	this.value = value;
}