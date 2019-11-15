package com.lti.model;

import java.time.LocalDate;

import javax.persistence.*;


@Entity
@Table(name="TBL_Passport")
public class Passport {
	//private int id;
	
	@Id
	private String passNo;
	
	@Column(name="Country_Passport")
	private String country;
	
	@Column(name="IssueDate")
	private LocalDate issueDate;
	
	@Column(name="Expire_Date")
	private LocalDate expdate;
	
	@OneToOne
	@JoinColumn(name= "Person_ID",nullable=false)
	private Person person;		//should not be null

	public String getPassNo() {
		return passNo;
	}

	public void setPassNo(String passNo) {
		this.passNo = passNo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getExpdate() {
		return expdate;
	}

	public void setExpdate(LocalDate expdate) {
		this.expdate = expdate;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
