package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_USER1")
public class User {
	@Id
	@GeneratedValue
  private int id;
	@Column(name="USER_Name")
  private String name;
  
	@Column(unique=true,name="USER_email",columnDefinition ="varchar2(100)")
  private String email;
  
  @Column(name="USER_pass")
  private String password;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
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
 
//  private Address address;
  
}
