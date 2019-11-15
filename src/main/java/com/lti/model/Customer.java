package com.lti.model;

import java.util.*;
import javax.persistence.*;


@Entity
@Table(name="TBL_CST")
public class Customer {
	
	@Id
	@GeneratedValue
	@Column(name="Cust_ID")
	int cid;
	@Column(name="Cust_Name")
	String cname;
	@Column(name="Cust_City")
	String custCity;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public String getCustCity() {
		return custCity;
	}
	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}
	
	
	
}
