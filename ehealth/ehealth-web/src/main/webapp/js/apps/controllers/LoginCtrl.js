app.controller("LoginCtrl", [ "$scope","LoginService",
		function($scope, loginService) {
			console.log("Login controller init");
			alert(loginService.login());
		} ])