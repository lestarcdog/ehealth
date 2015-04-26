app.controller("MeasurementCtrl", [
		"RealtimeDataService",
		"$scope",
		"$location",
		"$rootScope",
		function(rtDataService, $scope, $location, $rootScope) {
			// if ($rootScope.user.token == null) {
			// $location.path("/login")
			// }
			$scope.selectedPatient = {};
			$scope.mypatients = rtDataService
					.getMyPatients($rootScope.user.userId);

			$scope.selectPatient = function(patient) {
				if ($scope.selectedPatient.subjectId != null) {
					handler.unobservePatient($scope.selectedPatient.subjectId);
				}
				$scope.selectedPatient = patient;
				handler.observePatient(patient);
			}

			var handler = new RealTimeDataHandler();
			handler.createWebSocket();

		} ]);

function RealTimeDataHandler() {
	var socket = $.atmosphere;
	var subSocket;
	var dps = [];
	var chart = new CanvasJS.Chart("chartContainer", {
		axisX : {
			title : "X Axis Title",
			valueFormatString : "HH:mm:ss",
		},
		data : [ {
			type : "line",
			dataPoints : dps
		} ]
	});
	
	chart.render();
	
	request = {
		url : WebConstants.MEASUREMENTS_HOST+WebConstants.MEASUREMENTS_URL,
		logLevel : 'debug',
		transport : 'websocket',
	};

	this.observePatient = function(patient) {
		chart.options.title = {text : "Bloodpressure - "+patient.name};
		var cmd = new CommandDto("SUBSCRIBE", patient.subjectId);
		subSocket.push(JSON.stringify(cmd));
		chart.render();
	}

	this.unobservePatient = function(patientId) {
		var cmd = new CommandDto("UNSUBSCRIBE", patientId);
		subSocket.push(JSON.stringify(cmd));
	}

	request.onMessage = function(response) {
		var message = response.responseBody;
		console.log(message);
		try {
			var realData = JSON.parse(message);

		} catch (e) {
			console.log('This does not look like a valid JSON to me: ', message.data);
			return;
		}
		var date = new Date(realData.time);
		console.log(realData.subjectId + ":" + date.toLocaleTimeString() + ":"
				+ realData.values);
		dps.push({
			x : date.getTime(),
			y : realData.values["18949"]
		});
		if (dps.length > 15) {
			dps.shift();
		}
		chart.render();
	};

	request.onError = function(response) {
		console.log(response)
	};

	this.createWebSocket = function() {
		subSocket = socket.subscribe(request);
	}
}

function CommandDto(command, value) {
	this.command = command;
	this.value = value;
}