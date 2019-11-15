package com.lti.test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import com.lti.dao.GenericDao;
import com.lti.model.Passport;
import com.lti.model.Person;

public class PersonPassportTest {

	@Test
public void add(){
		
		Person person=new Person();
		person.setName("Hritik Roshan");
		person.setAge(50);
		
		GenericDao dao=new GenericDao();
		dao.insert(person);
	}
	@Test
	public void assignPassportToAPerson(){
		
		GenericDao dao=new GenericDao();
		Person per=(Person) dao.fetchById(Person.class, 201);
		
		Passport pass= new Passport();
		pass.setPassNo("KWER1234WSE");
		pass.setCountry("india");
		pass.setIssueDate(LocalDate.of(2010, 9, 10));
		pass.setExpdate(LocalDate.of(2017, 9, 10));
		pass.setPerson(per);
		dao.insert(pass);
		
	}
	@Test
	public void addPersonAlongWithPassport(){
		GenericDao dao=new GenericDao();
		
		Person per=new Person();
		per.setName("Bobby Deol");
		per.setAge(47);
		Passport pass=new Passport();

		pass.setPassNo("12QWASE32ER1");
		pass.setCountry("NewZealand");
		pass.setIssueDate(LocalDate.of(2002, 1, 4));
		pass.setExpdate(LocalDate.of(2009, 1, 4));
		pass.setPerson(per);
		per.setPassport(pass);
		dao.insert(per);
	}
	@Test
public void UpdateTest(){
		
		GenericDao dao=new GenericDao();
		Person per=(Person) dao.fetchById(Person.class, 201);
		
	    per.setAge(53);
	
		dao.insert(per);
		
	}
	@Test
public void DeleteTest(){
		
		GenericDao dao=new GenericDao();
		Person per=(Person) dao.fetchById(Person.class, 208);
		dao.DeleteById(Person.class,208);
		
	}

}
