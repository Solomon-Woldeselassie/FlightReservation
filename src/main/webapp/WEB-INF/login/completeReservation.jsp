<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<ul class="list-group">
 <li class="list-group-item list-group-item-primary">${flight.operatingAirline}</li>
 <li class="list-group-item list-group-item-primary">${flight.departureCity}</li>
 <li class="list-group-item list-group-item-primary">${flight.arrivalCity}</li>
</ul>
<form action="completeReservation" method="post">
<h2>Payment Detail:</h2>
<div class="md-form">
  <input type="text" id="inputMDEx" class="form-control" name="passengerFirstName">
  <label for="inputMDEx">First Name</label>
</div>
<div class="md-form">
  <input type="text" id="inputMDEx" class="form-control" name="passengerLastName">
  <label for="inputMDEx">Last Name</label>
</div>
<div class="md-form">
  <input type="text" id="inputMDEx" class="form-control" name="passengerEmail">
  <label for="inputMDEx">Email</label>
</div>
<div class="md-form">
  <input type="text" id="inputMDEx" class="form-control" name="passengerPhoneNumber">
  <label for="inputMDEx">Phone Number</label>
</div>

<h2>Payment Detail:</h2>
<div class="md-form">
  <input type="text" id="inputMDEx" class="form-control" name="nameOnTheCard">
  <label for="inputMDEx">Name on Card</label>
</div>
<div class="md-form">
  <input type="text" id="inputMDEx" class="form-control" name="cardNumber">
  <label for="inputMDEx">Card Number</label>
</div>
<div class="md-form">
  <input type="text" id="inputMDEx" class="form-control" name="expiryDate">
  <label for="inputMDEx">Expiration Date</label>
</div>
<div class="md-form">
  <input type="text" id="inputMDEx" class="form-control" name="securityCode">
  <label for="inputMDEx">Three Digit Security Code</label>
</div>
<input type="hidden" name="flightId" value="${flight.id}">
 <button type="submit" class="btn btn-primary" value ="sumbit">Submit</button>
</form>

</body>
</html>