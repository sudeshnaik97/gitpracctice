package com.lti.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="TBL_Account")
public class Account {
	
	@Id
	private int accno;
	@Column(name="AccHolder")
	private String name;
	@Column(name="AccType")
	private String accType;
	@Column(name="AccBalance")
	private double bal;
	@OneToMany(mappedBy="account")
	private List<Transaction> transactions;
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public List<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", name=" + name + ", accType=" + accType + ", bal=" + bal + "]";
	}

	
		
}
