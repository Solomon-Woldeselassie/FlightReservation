package com.solomon.flightregistration.entities;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="flight")
public class Flight extends Abstractentities {
	@Column(name="flight_number")
	private String flightNumber;
	@Column(name="operating_airlines")
	private String operatingAirline;
	@Column(name="departure_city")
	private String departureCity;
	@Column(name="arrival_city")
	private String arrivalCity;
	@Column(name="date_of_departure")
	private Date departureDate;
	@Column(name="estimated_departure_time")
	private Timestamp departureTime;

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOperatingAirline() {
		return operatingAirline;
	}

	public void setOperatingAirline(String operatingAirline) {
		this.operatingAirline = operatingAirline;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public Date getDepartureOfDate() {
		return departureDate;
	}

	public void setDepartureOfDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Timestamp getEstimateDepartureTime() {
		return departureTime;
	}

	public void setEstimateDepartureTime(Timestamp estimateDepartureTime) {
		this.departureTime = estimateDepartureTime;
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", operatingAirline=" + operatingAirline + ", departureCity="
				+ departureCity + ", arriveCity=" + arrivalCity + ", departureOfDate=" + departureDate
				+ ", estimateDepartureTime=" + departureTime + "]";
	}

}
