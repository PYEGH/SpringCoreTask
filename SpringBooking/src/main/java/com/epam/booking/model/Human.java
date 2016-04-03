package com.epam.booking.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Human {
	private String name;
	private String surname;

	public String getName() {
		return name;
	}

	public Human() {
	}

	@Autowired
	public Human( String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
}
