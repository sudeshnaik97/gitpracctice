package com.lti.dao;

import org.springframework.transaction.annotation.Transactional;

public interface HomeLoanDaoInterface {

	void addNewRecord(Object object);

	Object fetchById(Class clas, Object ob);

}