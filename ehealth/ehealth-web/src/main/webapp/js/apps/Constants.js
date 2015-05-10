var WebConstants = {};
WebConstants.MEASUREMENTS_URL = "/measurements";
WebConstants.MEASUREMENTS_HOST = "http://127.0.0.1:9090";
WebConstants.MAX_CHART_DATAPOINTS = 30;
WebConstants.VITAL_SIGNS = {
	4100 : {
		enabled : false,
		name : "Activity monitor",
		values : [ {
			mdcId : 110,
			name : "Speed"
		}, {
			mdcId : 102,
			name : "Altitude"
		} ]
	},
	4103 : {
		enabled : true,
		name : "Blood pressure monitor",
		values : [ {
			mdcId : 18949,
			name : "Systolic"
		}, {
			mdcId : 18950,
			name : "Diastolic"
		}, {
			mdcId : 18474,
			name : "Pulse rate"
		} ]
	}
};