package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lti.model.Address;
import com.lti.model.Customer;
import com.lti.model.User;

public class UserAddressDao {

	
		public void insert(User user){
		
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracleTest");
			EntityManager em=emf.createEntityManager();
			EntityTransaction tx=em.getTransaction();
			tx.begin();
			
			em.persist(user);
			
			tx.commit();
			
			em.close();
			emf.close();	
	}
		public User fetchUser(int id){
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracleTest");					
					EntityManager em=emf.createEntityManager();
					User c=em.find(User.class, id);					
					em.close();
					emf.close();
					return c;
				}
		public void save(Address addr){
			
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracleTest");
			EntityManager em=emf.createEntityManager();
			EntityTransaction tx=em.getTransaction();
			tx.begin();
			em.persist(addr);
			tx.commit();
			em.close();
			emf.close();	
	}

}
