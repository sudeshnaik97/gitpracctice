package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.dao.CustomerDao;
import com.lti.dao.UserAddressDao;
import com.lti.model.Address;
import com.lti.model.Customer;
import com.lti.model.User;

public class UserTest {
////	@Test
////	public void TestI() {
////		User user= new User();
////		user.setName("Sudesh");
////		user.setEmail("sud@gmail.com");
////		user.setPassword("12345");
////		UserAddressDao doa=new UserAddressDao();
////		doa.insert(user);
////	}
//	
//	@Test
//	public void addAddressForAnExistingUser()
//	{
//		UserAddressDao dao=new UserAddressDao();
//		User user=dao.fetchUser(145);
//		Address addr=new Address();
//		addr.setPincode(481002);
//		addr.setCity("Balaghat");
//		addr.setLandmark("Near PizzaHUt");
//		addr.setUser(user);
//		dao.save(addr);
//	}
@Test
public void addUserAlongWithAddress(){
	UserAddressDao dao=new UserAddressDao();
User user= new User();
user.setName("shahrukh");
user.setEmail("srk@gmail.com");
user.setPassword("1q2w3e4r");

Address addr=new Address();
addr.setPincode(481009);
addr.setCity("Bandra");
addr.setLandmark("Mannat");
addr.setUser(user);
dao.save(addr);
}


}

