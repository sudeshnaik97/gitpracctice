package com.lti.service;

import com.lti.dao.GenericDao;
import com.lti.model.Cart;

public class ItemCartService {

	
	public void add(Cart cr)
	{
		GenericDao dao=new GenericDao();
		dao.insert(cr);
	}
}
