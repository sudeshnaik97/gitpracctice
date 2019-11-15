package com.lti.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.lti.dao.AccTranDao;
import com.lti.dao.GenericDao;
import com.lti.model.Account;
import com.lti.model.Transaction;

public class AccountService {

	
	public void openAccount(Account acc)
	{
		GenericDao dao=new GenericDao();
		dao.insert(acc);
		//sending an email to the customer
		
	}
	public void withdraw(int acno, double amount)
	{
		GenericDao dao=new GenericDao();
		Account acc=(Account) dao.fetchById(Account.class, acno);
		if(acc.getBal()>0 && acc.getBal()>amount)
		{
		acc.setBal(acc.getBal()-amount);
		
		Transaction tra=new Transaction();
		tra.setType("Withdraw");
		tra.setAmt(amount);
		tra.setDate(LocalDateTime.now());
		tra.setAccount(acc);
		dao.insert(acc);
		dao.insert(tra);
		}
		else{
			System.out.println("Insufficient Balance");
		}
		
	}
	public void deposit(int acno, double amount)
	{
	GenericDao dao=new GenericDao();
	Account acc=(Account) dao.fetchById(Account.class, acno);
	acc.setBal(acc.getBal()+ amount);
	Transaction tra=new Transaction();
	tra.setType("Deposit");
	tra.setAmt(amount);
	tra.setDate(LocalDateTime.now());
	tra.setAccount(acc);
	dao.insert(acc);
	dao.insert(tra);
		
	}
	public void transfer(int fromAcno,int toAcno,double amount)
	{
		GenericDao dao=new GenericDao();
		Account acc=(Account) dao.fetchById(Account.class, fromAcno);
		Account acc1=(Account) dao.fetchById(Account.class, toAcno);
		if(acc.getBal()<amount || acc.getBal()==0){
			System.out.println("Insufficient Balance");
			
		}
		else{
			double d=acc.getBal()-amount;
			dao.insert(acc);
			Transaction tra=new Transaction();
			Transaction tra1=new Transaction();
			tra.setType("Debited");
			tra.setAmt(amount);
			tra.setDate(LocalDateTime.now());
			tra.setAccount(acc);
			dao.insert(tra);
			double d1=acc1.getBal();
			dao.insert(acc1);
			tra.setType("Credited");
			tra.setAmt(amount);
			tra.setDate(LocalDateTime.now());
			tra.setAccount(acc1);
			dao.insert(tra1);
			
		}
	}
	public double checkBalance(int acno)
	{
		GenericDao dao=new GenericDao();
		Account acc=(Account) dao.fetchById(Account.class, acno);
		System.out.println(acc.getBal());
		return acc.getBal();	
	}
	public List<Account>getAccountByType(String type)
	{
		AccTranDao dao=new AccTranDao();
		
		return dao.fetchByType(type);
		
	}
	public List<Transaction> miniStatement(int accno)
	{
		
		
		AccTranDao dao=new AccTranDao();
		return dao.fetchMiniStatement(accno);
	}
	
	public List<Transaction> getTransactions(int accno,LocalDate date) {
		AccTranDao dao=new AccTranDao();
		return dao.fetchTransactions(accno, date);
	}
	
	public List<Account> getDetailsforIncomeTax(double amount) {
		AccTranDao dao=new AccTranDao();
		return dao.fetchAmount(amount);
	}
	
}
