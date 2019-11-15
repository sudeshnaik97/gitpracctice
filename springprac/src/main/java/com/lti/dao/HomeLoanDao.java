package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;



@Component("income")
public class HomeLoanDao implements HomeLoanDaoInterface {

	@PersistenceContext
	private EntityManager entitymanager;
	
	/* (non-Javadoc)
	 * @see com.lti.dao.IncomeupdateDaoInterface#addNewRecord(java.lang.Object)
	 */
	@Transactional
	public void addNewRecord(Object object ) {
		entitymanager.merge(object);
			
		
			}
	
	/* (non-Javadoc)
	 * @see com.lti.dao.IncomeupdateDaoInterface#fetchById(java.lang.Class, java.lang.Object)
	 */
	public Object fetchById(Class clas,Object ob) {
		
		//find method is used to generate select query
		Object object=entitymanager.find(clas, ob);
		
		
		return object;
}
}
