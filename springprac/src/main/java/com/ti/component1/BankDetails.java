package com.ti.component1;

import javax.persistence.*;

@Entity
@Table(name="BankDetails")
public class BankDetails {
	@Id
	@Column(name="AccountNo")
	private long accountNo;// should be a 12 digit number
	@Column(name="Branch")
	private String branch;// should be a string branch name
	@Column(name="IFSC")
	private String ifsc;
	@Column(name="CreditScore")
	private int creditscore;	// should be a three digit number
	
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public int getCreditscore() {
		return creditscore;
	}
	public void setCreditscore(int creditscore) {
		this.creditscore = creditscore;
	}
	@Override
	public String toString() {
		return "bankdetails [accountNo=" + accountNo + ", branch=" + branch + ", ifsc=" + ifsc + ", creditscore="
				+ creditscore + "]";
	}
	
	
}
