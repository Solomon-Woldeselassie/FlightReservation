package com.solomon.flightregistration.entities;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
@Entity
public class Reservation extends Abstractentities {
	private boolean checkedIn;
	private int numberOfBags;
	private Time created;
	@OneToOne
	private Passanger passanger;
	@OneToOne
	private Flight flight;

	public boolean isCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

	public int getNumberofBags() {
		return numberOfBags;
	}

	public void setNumberofBags(int numberofBags) {
		this.numberOfBags = numberofBags;
	}

	public Time getDateCreated() {
		return created;
	}

	public void setDateCreated(Time dateCreated) {
		created = dateCreated;
	}

	public Passanger getPassanger() {
		return passanger;
	}

	public void setPassanger(Passanger passanger) {
		this.passanger = passanger;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	@Override
	public String toString() {
		return "Reservation [checkedIn=" + checkedIn + ", numberofBags=" + numberOfBags + ", DateCreated=" + created
				+ ", passanger=" + passanger + ", flight=" + flight + "]";
	}

}
