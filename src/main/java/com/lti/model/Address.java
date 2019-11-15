package com.lti.model;

import javax.persistence.Column;
import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TBL_ADDR1")
public class Address{
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="addr_pincode",columnDefinition ="number(6)")
	private int pincode;
	private String city;
	private String landmark;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name= "USER_ID")//fkey
	private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
