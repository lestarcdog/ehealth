app.controller("MeasurementCtrl", [ "RealtimeDataService", "$scope", "$location", "$rootScope",
		function(rtDataService, $scope, $location, $rootScope) {
			// if ($rootScope.user.token == null) {
			// $location.path("/login")
			// }

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
			$scope.notifications = [];
			$scope.vitalSigns = WebConstants.VITAL_SIGNS;

			var handler = new RealTimeDataHandler($scope);
			handler.createWebSocket($rootScope.user.token);

			function RealTimeDataHandler(sc) {
				var socket = $.atmosphere;
				var subSocket = null;
				var chart = new EhealthChart();
				var scope = sc;
				var authtoken = authtoken;
				var request = {
					url : WebConstants.MEASUREMENTS_HOST + WebConstants.MEASUREMENTS_URL,
					logLevel : 'debug',
					transport : 'websocket',
				};

				this.observePatient = function(patient, vitalSign) {
					var cmd = new CommandDto("SUBSCRIBE", patient.ssn);
					subSocket.push(JSON.stringify(cmd));
					chart.createChart(vitalSign);
				}

				this.unobservePatient = function(patient) {
					var cmd = new CommandDto("UNSUBSCRIBE", patient.ssn);
					subSocket.push(JSON.stringify(cmd));
				}

				request.onMessage = function(response) {
					var message = null;
					try {
						message = JSON.parse(response.responseBody);
						message.time = new Date(message.timeInMillis);
						console.log(message);
						if (message.type == "RealtimeMeasurementDto") {
							chart.addData(message);
						} else if (message.type = "RealtimeDecisionDto") {
							scope.notifications.push(message);
							scope.$apply();
						}

					} catch (e) {
						console.log('Error: ', e);
						return;
					}
				};

				request.onError = function(response) {
					console.log(response)
				};

				this.createWebSocket = function(authtoken) {
					request.headers = {
						"Auth-token" : authtoken
					};
					subSocket = socket.subscribe(request);
				};
			}
		} ]);

function EhealthChart() {
	var chart = null;
	var activeMeasurement = null;
	var dataMap = [];

	this.addData = function(message) {
		if (message.mdcId == activeMeasurement) {
			var date = new Date(message.timeInMillis);
			for (idx in WebConstants.VITAL_SIGNS[activeMeasurement].values) {

				vs = WebConstants.VITAL_SIGNS[activeMeasurement].values[idx];
				var num = message.values[vs.mdcId];
				dataMap[idx].dataPoints.push({
					x : date,
					y : num
				});

			}
			chart.render();
		}
	}

	this.createChart = function(vitalSign) {
		activeMeasurement = vitalSign.mdcId;
		dataMap = [];
		for (idx in vitalSign.values) {
			vs = vitalSign.values[idx];
			dataMap.push({
				type : "line",
				legendText : vs.name,
				showInLegend : true,
				dataPoints : []
			});
		}

		chart = new CanvasJS.Chart("chartContainer", {
			zoomEnabled : true,
			panEnabled : true,
			axisX : {
				title : "Time",
				valueFormatString : "HH:mm:ss",
				labelAngle : -50
			},
			data : dataMap
		});

		chart.options.title = {
			text : vitalSign.name
		};

		chart.render();
	}

}

function CommandDto(command, value) {
	this.command = command;
	this.value = value;
}
