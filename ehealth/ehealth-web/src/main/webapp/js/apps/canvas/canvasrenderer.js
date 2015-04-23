var dps = [];
var chart = new CanvasJS.Chart("chartContainer", {
	title : {
		text : "Dummy - values"
	},
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