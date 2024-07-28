app.controller('FlightStatusController', ['$scope', '$http', function($scope, $http) {
	$scope.flights = [];
	$scope.selectedFlightCode = null;
	$scope.flightDetails = null;
	$scope.flightStatus = null;

	// Fetch all flight numbers for dropDown.
	$http.get('http://localhost:8080/api/flights/allflightNumbers')
		.then(function(response) {
			$scope.flights = response.data;
		});

	// Fetch flight details by flight code
	$scope.showDetails = function() {
		if ($scope.selectedFlightCode) {
			$http.get('http://localhost:8080/api/flights', {
				params: { flightNumber: $scope.selectedFlightCode }
			}).then(function(response) {
				$scope.flightDetails = response.data;
				$scope.flightStatus = null;
			});
		}
	};

	// Method to fetch flight status
	$scope.getFlightStatus = function(flightNumber) {
		$http.get('http://localhost:8080/api/flights/flightStatus', {
			params: { flightNumber: flightNumber }
		}).then(function(response) {
			if (response.data && response.data.length > 0) {
				$scope.flightStatus = response.data[0];
			} else {
				$scope.flightStatus = null;
			}
		}, function(error) {
			console.error('Error fetching flight status:', error);
		});
	};

	
	// Function to share notification
	    $scope.shareNotification = function(flightDetails) {
	        const message = `Flight Number: ${flightDetails.flightNumber}, Flight Name: ${flightDetails.flightName}, Source: ${flightDetails.source}, Destination: ${flightDetails.destination}, Capacity: ${flightDetails.capacity}, Class Name: ${flightDetails.className}, Price: ${flightDetails.price}, Arrival Time: ${$scope.flightStatus.arrivalTime}, Departure Time: ${$scope.flightStatus.departureTime}, Gate: ${$scope.flightStatus.gate}, Status: ${$scope.flightStatus.status}`;
	        
	        const notification = {
	            flightNumber: flightDetails.flightNumber,
	            message: message,
	            type: 'SMS' // or 'Email', 'App' based on your requirement
	        };

	        $http.post('/api/sendSms', notification)
	            .then(function(response) {
	                alert('Notification sent successfully!');
	            }, function(error) {
	                console.error('Error sending notification', error);
	                alert('Failed to send notification.');
	            });
	    };
}]);
