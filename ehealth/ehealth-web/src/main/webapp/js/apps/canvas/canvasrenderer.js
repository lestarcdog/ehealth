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
	// dataPoints : [ {x: 10 , y: 50, label: "valami"},{x: 20 , y: 70, label:
	// "valami2"}]
	} ]
});

chart.render();