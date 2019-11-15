package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.dao.CustomerDao;
import com.lti.model.Customer;

public class CustomerTest {

	@Test
	public void testIfCustomerIsGettingSavedOrNot() {
		Customer c= new Customer();
		c.setCname("Itachi");
		c.setCustCity("Akatsuki");
		CustomerDao dao=new CustomerDao();
		dao.insert(c);
	}
	@Test
	public void testById()
	{
		
		CustomerDao dao=new CustomerDao();
		Customer d=dao.fetch(98);
		assertNotNull(d);
		System.out.println(d.getCname());
		System.out.println(d.getCustCity());
		
	}
	
//@Test(expected=NullPointerException.class)
//	public void testByIdNot()
//	{
//		
//		CustomerDao dao=new CustomerDao();
//		Customer d=dao.fetch(9);
//		//assertNotNull(d);
////		System.out.println(d.getCname());
////		System.out.println(d.getCustCity());

//	}
}
