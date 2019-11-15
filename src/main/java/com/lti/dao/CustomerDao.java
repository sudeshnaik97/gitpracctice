package com.lti.dao;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.*;
import com.lti.model.Customer;

public class CustomerDao {

	public void insert(Customer customer){
		//Step 1. Load/create entityManagerFactory object
		//during this step,META-INF/persistence.xml
		//file will read automatically
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracleTest");
		
		//step 2. Load entityManager object
		
		EntityManager em=emf.createEntityManager();
		
		//Step3. participate/Start a transaction
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		
		
		//persist method runs sql query 
		em.persist(customer);
		
		tx.commit();
		
		em.close();
		emf.close();	
	}
	
	public Customer fetch(int cid){
EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracleTest");
		
		//step 2. Load entityManager object
		
		EntityManager em=emf.createEntityManager();
		
		//find method generates select query
		Customer c=em.find(Customer.class, cid);
		
		em.close();
		emf.close();
		return c;
	}



	public List<Customer> fetchByCity(String custcity){
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracleTest");
				
				//step 2. Load entityManager object
				
				EntityManager em=emf.createEntityManager();
				
				//find method generates select query
				//Customer c=em.find(Customer.class, custcity);
				javax.persistence.Query q=em.createQuery("select c from Customer as c where c.custCity=:ct");
				q.setParameter("ct",custcity);
				List<Customer> customers=q.getResultList();
				em.close();
				emf.close();
				return customers;
			}

}