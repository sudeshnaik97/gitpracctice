package com.lti.service;

import com.lti.dao.GenericDao;
import com.lti.model.Bus;

public class BusService {

	public void add1(Bus b)
	{
		
		GenericDao dao=new GenericDao();
		dao.insert(b); 
	}
	
}
