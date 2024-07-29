var app = angular.module('flightStatusApp', ['ngRoute']);
app.config(['$routeProvider', function($routeProvider) {
	$routeProvider
		.when('/viewflightinfo', {
			templateUrl: 'views/viewflightinfo.html',
			controller: 'FlightStatusController'
		})
		.otherwise({
			redirectTo: '/viewflightinfo'
		});
}]);
