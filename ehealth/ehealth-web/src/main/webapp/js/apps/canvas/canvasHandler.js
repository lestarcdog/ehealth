function RealTimeDataHandler() {
	var socket = $.atmosphere;
	var subSocket;
	var dataMap = {};
	var chart = new CanvasJS.Chart("chartContainer", {
		zoomEnabled : true,
		panEnabled : true,
		axisX : {
			title : "Time",
			valueFormatString : "HH:mm:ss",
			labelAngle : -50
		},
		data : []
	});

	chart.render();

	request = {
		url : WebConstants.MEASUREMENTS_HOST + WebConstants.MEASUREMENTS_URL,
		logLevel : 'debug',
		transport : 'websocket',
	};

	this.observePatient = function(patient,vitalSign) {
		chart.options.title = {
			text : vitalSign.name+" - " + patient.name
		};
		var cmd = new CommandDto("SUBSCRIBE", patient.subjectId);
		//subSocket.push(JSON.stringify(cmd));
		chart.render();
	}

	this.unobservePatient = function(patient) {
		var cmd = new CommandDto("UNSUBSCRIBE", patient.subjectId);
		//subSocket.push(JSON.stringify(cmd));
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
		console.log(realData.subjectId + ":" + date.toLocaleTimeString() + ":" + realData.values);
//		dps.push({
//			x : date,
//			y : realData.values["18949"]
//		});
//		if (dps.length > WebConstants.MAX_CHART_DATAPOINTS) {
//			dps.shift();
//		}
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