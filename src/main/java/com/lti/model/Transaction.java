package com.lti.model;

import java.time.*;
import java.util.*;


import javax.persistence.*;



@Entity
@Table(name="TBL_Transaction")
public class Transaction {
	
	@Id
	@GeneratedValue
	private int t_no;
	@Column(name="Transactiontype")
	private String type;
	@Column(name="Trans_amt")
	private double amt;
	@Column(name="Trans_time")
	private LocalDateTime date;
	
	@ManyToOne
	@JoinColumn(name="Accnum")
	private Account account;
	public int getT_no() {
		return t_no;
	}
	public void setT_no(int t_no) {
		this.t_no = t_no;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Transaction [t_no=" + t_no + ", type=" + type + ", amt=" + amt + ", date=" + date + "]";
	}
	
	
}
