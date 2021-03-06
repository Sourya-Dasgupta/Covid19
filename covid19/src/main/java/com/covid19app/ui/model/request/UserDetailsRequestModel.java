package com.covid19app.ui.model.request;

import java.sql.Date;

public class UserDetailsRequestModel {

	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String password;
	private int age;
	private String location;
	private Boolean infected_status;
	private Date dateOfInfection;

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Boolean getInfected_status() {
		return infected_status;
	}

	public void setInfected_status(Boolean infected_status) {
		this.infected_status = infected_status;
	}

	public Date getDateOfInfection() {
		return dateOfInfection;
	}

	public void setDateOfInfection(Date dateOfInfection) {
		this.dateOfInfection = dateOfInfection;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
