app.controller("MeasurementCtrl", [ "RealtimeDataService",
		function(rtDataService) {
			console.log("Measurement controller init");
			alert(rtDataService.get());
		} ]);