package com.example.demo.responses;

import java.util.List;

public class UserResponse {

	private String userId;
	private String firstName;
	private String lastName;
	private String email;
	private List<AdressResponse> adresses;
	private ContactResponse contact;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<AdressResponse> getAdresses() {
		return adresses;
	}

	public void setAdresses(List<AdressResponse> adresses) {
		this.adresses = adresses;
	}

	public ContactResponse getContact() {
		return contact;
	}

	public void setContact(ContactResponse contact) {
		this.contact = contact;
	}

}
