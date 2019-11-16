package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Customer;


//For Dao class instead of @Component, suggestion is to use @Repository
@Repository
public class CustomerRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void add(Customer customer)
	{
		entityManager.persist(customer);
	}
}
