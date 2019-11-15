package com.lti.app;

import java.util.List;

import com.lti.dao.CustomerDao;
import com.lti.model.Customer;

public class App {

	public static void main(String []args)
	{
		Customer c= new Customer();
		c.setCname("Naruto");
		c.setCustCity("Konoha");
		
		CustomerDao dao=new CustomerDao();
		Customer d=dao.fetch(24);
		System.out.println(c.getCname());
		System.out.println(c.getCustCity());
	
		CustomerDao da=new CustomerDao();
		List<Customer> custs=da.fetchByCity("MUM");
		for(Customer cu:custs)
		{
			System.out.println(cu.getCid()+" "+cu.getCustCity()+" "+cu.getCname());
		}
		
		dao.insert(c);
	}
}
