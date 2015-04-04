var app = angular.module('ehealthApp', ["ngRoute"]);
app.controller("MainController", [function() {
	this.notes = [
	              {id : 1 , msg :"aaaaa"},
	              {id : 2 , msg :"bbbb"},
	              {id : 3 , msg :"cccc"},
	              {id : 4 , msg :"ddddd"},
	              ];
	console.log("valami");
}]);
