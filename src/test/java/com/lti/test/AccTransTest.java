package com.lti.test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

import org.junit.Test;

import com.lti.dao.GenericDao;
import com.lti.model.Account;
import com.lti.model.Person;
import com.lti.model.Transaction;
import com.lti.service.AccountService;

public class AccTransTest {

	@Test
	public void add() {

		Account acc = new Account();
		acc.setAccno(1234567);
		acc.setAccType("Current");
		acc.setBal(1200.0);
		acc.setName("Bunty");
		Account acc1 = new Account();
		acc1.setAccno(362514);
		acc1.setAccType("Current");
		acc1.setBal(540000.0);
		acc1.setName("Malcom");
		Account acc2 = new Account();
		acc2.setAccno(748596);
		acc2.setAccType("CURRENT");
		acc2.setBal(790000.0);
		acc2.setName("Guruji");
		// GenericDao dao=new GenericDao();
		// dao.insert(acc);
		AccountService accser = new AccountService();
		accser.openAccount(acc);
		accser.openAccount(acc1);
		accser.openAccount(acc2);
	}

	@Test
	public void withd() {
		AccountService accs = new AccountService();
		accs.withdraw(234512897, 45000);

	}

	@Test
	public void deposit() {
		AccountService accs1 = new AccountService();
		accs1.deposit(234512897, 5000);

	}

	@Test
	public void fetchbytype() {
		AccountService acc = new AccountService();
		List<Account> acc1 = acc.getAccountByType("Savings");

		for (Account account : acc1) {
			System.out.println(account);
		}
	}

	@Test
	public void fetchMiniStatement() {
		AccountService acc = new AccountService();
		List<Transaction> acc1 = acc.miniStatement(1234567);

		for (Transaction tra : acc1) {
			System.out.println(tra);
		}
	}
	
	@Test
	public void fetchTransactions() {
		AccountService acc = new AccountService();
		LocalDate date = LocalDate.of(2019, 11, 9);
		List<Transaction> acc1 = acc.getTransactions(234512897, date);

		for (Transaction tra : acc1) {
			System.out.println(tra);
		}
	}
	
	@Test
	public void fetchAmount() {
		AccountService acc1 = new AccountService();
		
		List<Account> l1 = acc1.getDetailsforIncomeTax(100);

		for (Account a : l1) {
			System.out.println(a.getName());
			for(Transaction tx : a.getTransactions()){
				System.out.println(tx.getDate());
				System.out.println(tx.getAmt());
			}
		}
	}
	
	
}
