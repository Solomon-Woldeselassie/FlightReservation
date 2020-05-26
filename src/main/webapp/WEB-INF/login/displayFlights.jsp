<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Flights</title>
</head>
<body>
<table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">Operating Airline</th>
      <th scope="col">Departure City</th>
      <th scope="col">Arrival City</th>
    </tr>
  </thead>
  <c:forEach items="${flights}" var="flight">
  <tbody>
    <tr>
      <td>${flight.operatingAirline}</td>
      <td>${flight.departureCity}</td>
      <td>${flight.arrivalCity}</td>
      <td><a href="completeReservation?id=${flight.id}">Select</a></td>
    </tr>
  </tbody>
  </c:forEach>
</table>
</body>
</html>