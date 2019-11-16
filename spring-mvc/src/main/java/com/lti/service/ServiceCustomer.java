package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Customer;
import com.lti.repository.CustomerRepository;


//again use instead of @Component use @Service for service class
@Service
public class ServiceCustomer {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private SendMailService sendMailService;
	public void register (Customer customer)
	{
		customerRepository.add(customer);
		sendMailService.send(customer.getEmail(), "Thankyou for Registeruing!!", "Baar Baar AANA");
	}
	
}
