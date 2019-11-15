package com.ti.component1;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="TBL_CustDetail")
public class CustomerDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="personal_gen")
	@SequenceGenerator(name="personal_gen", sequenceName="personal_seq", 
	initialValue=100,allocationSize=1)
	private int pId;
	@Column(name="firstname")
	private String fname;
	@Column(name="middlename")
	private String mname;
	@Column(name="lastname")
	private String lname;
	@Column(name="email")
	private String email;
	@Column(name="phoneno")
	private long phno;
	@Column(name="datofbirth")
	private LocalDate dob;
	@Column(name="gender")
	private String gender;
	@Column(name="nationality")
	private String nationality;
	@Column(name="aadharno")
	private long aadharNo;
	@Column(name="PANCARDNO")
	private String pan;
	//private IncomeDetails incDte;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate localDate) {
		this.dob = localDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	@Override
	public String toString() {
		return "customerDetails [f_name=" + fname + ", m_name=" + mname + ", l_name=" + lname + ", email=" + email
				+ ", phno=" + phno + ", dob=" + dob + ", gender=" + gender + ", nationality=" + nationality
				+ ", aadhar_no=" + aadharNo + ", pan=" + pan + "]";
	}
		

}
