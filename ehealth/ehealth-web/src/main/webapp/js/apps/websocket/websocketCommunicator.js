var content = $("#chartContent");
var socket = $.atmosphere;
var request = {
	url : "http://127.0.0.1:9090/measurements",
	logLevel : 'debug',
	transport : 'websocket',
	fallbackTransport : 'long-polling'
};

request.onOpen = function(response) {
	content.html($('<p>', {
		text : 'Atmosphere connected using ' + response.transport
	}));
	var cmd1 = {
		command : "subscribe",
		value : "jozsi"
	};
	subSocket.push(JSON.stringify(cmd1));

};

request.onMessage = function(response) {
	var message = response.responseBody;
	console.log(message);
	try {
		var realData = JSON.parse(message);
		var date = new Date(realData.time);
		console.log(realData.mdcMeasurementId + ":" + date.toLocaleTimeString()
				+ ":" + realData.value);

		// dps.push({
		// x : date.getTime(),
		// y : realData.value,
		// label : date.toLocaleTimeString()
		// });
		// chart.render();

	} catch (e) {
		console.log('This does not look like a valid JSON: ', message.data);
		return;
	}
};

request.onError = function(response) {
	console.log(response)
};

var subSocket = socket.subscribe(request);