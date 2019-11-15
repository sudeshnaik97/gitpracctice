package com.lti.test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import com.lti.dao.GenericDao;
import com.lti.model.Cart;
import com.lti.model.Item;
import com.lti.model.Passport;
import com.lti.model.Person;
import com.lti.service.ItemCartService;

public class CartItemTest {

	@Test
	public void test() {
		Cart crt=new Cart();
		crt.setTotal(12);
		ItemCartService its= new ItemCartService();
		its.add(crt);
	}
	@Test
	public void ItemAtCartNo() {
		GenericDao dao=new GenericDao();
		Cart cr=(Cart) dao.fetchById(Cart.class, 10003);
		
		Item it= new Item();
		it.setId(1003);
		it.setQuantity(16);
		it.setCart(cr);
		dao.insert(it);
		
	}
	
	@Test
	public void fetchById()
	{
		
	}
}
