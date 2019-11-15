package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.lti.model.Address;
import com.lti.model.User;

public class GenericDao {				//common dao class to be used for every case
	public void insert(Object obj){
			
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracleTest");
	EntityManager em=emf.createEntityManager();
	EntityTransaction tx=em.getTransaction();
	tx.begin();
	
	// merge can be used for insert and update both
	em.merge(obj);
	
	tx.commit();
	
	em.close();
	emf.close();	
}

	public Object fetchById(Class clazz,Object obj1){
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracleTest");					
				EntityManager em=emf.createEntityManager();
				Object obj=em.find(clazz,obj1);					
				em.close();
				emf.close();
				return obj;
			}
	
	public void DeleteById(Class clazz,Object obj1){
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracleTest");					
				EntityManager em=emf.createEntityManager();
				Object obj=em.find(clazz,obj1);	
				EntityTransaction tx=em.getTransaction();
				tx.begin();
				
				// merge can be used for insert and update both
			
				
				em.remove(obj);
				tx.commit();
				em.close();
				emf.close();
				
			}
	//public 

}
