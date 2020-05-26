<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
	<form action="findFlight" method="post">
		<pre>
<label for="flightDeparture"><b>Departure City</b></label>
    <input type="text" placeholder="Enter Departure City"
				name="from" required>
    <label for="flightArrival"><b>Arrival City</b></label>
    <input type="text" placeholder="Enter Arrival City"
				name="to" required>
    <label for="flightDeparture"><b>Departure Date</b></label>
    <input type="text" placeholder="Enter Departure Date"
				name="departureDate" required>		
    <button type="submit" class="btn btn-primary" value ="sumbit">Search</button>
  </pre>
	</form>
</body>
</html>