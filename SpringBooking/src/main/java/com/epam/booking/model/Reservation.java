package com.epam.booking.model;

public class Reservation {

	private String reservationNumber;
	private String filmTitle;
	private String dateOfSeance;
	private int seat;
	private Money price;
	private Human person;

	public Reservation(String reservationNumber, String filmTitle,
			String dateOfSeance, int seat, Money price, Human person) {
		this.reservationNumber = reservationNumber;
		this.filmTitle = filmTitle;
		this.dateOfSeance = dateOfSeance;
		this.seat = seat;
		this.price = price;
		this.person = person;
	}

	public String getFilmTitle() {
		return filmTitle;
	}

	public void setFilmTitle(String filmTitle) {
		this.filmTitle = filmTitle;
	}

	public String getDateOfSeance() {
		return dateOfSeance;
	}

	public void setDateOfSeance(String dateOfSeance) {
		this.dateOfSeance = dateOfSeance;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public Money getPrice() {
		return price;
	}

	public void setPrice(Money price) {
		this.price = price;
	}

	public Human getPerson() {
		return person;
	}

	public void setPerson(Human person) {
		this.person = person;
	}

	public String getReservationNumber() {
		return reservationNumber;
	}

	public void setReservationNumber(String reservationNumber) {
		this.reservationNumber = reservationNumber;
	}

}
