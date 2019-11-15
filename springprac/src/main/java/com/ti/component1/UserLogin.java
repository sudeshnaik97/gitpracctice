package com.ti.component1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Userlogin")
public class UserLogin {
	@Id
	@Column(name="Email")
	private String email;
	@Column(name="Password")
	private String password;
	
}
