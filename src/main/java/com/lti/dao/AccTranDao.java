package com.lti.dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TemporalType;

import com.lti.model.Account;
import com.lti.model.Transaction;

public class AccTranDao extends GenericDao{
		public List<Account> fetchByType(String type){
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracleTest");
			EntityManager em=emf.createEntityManager();
			javax.persistence.Query q=em.createQuery("select a from Account as a where a.accType:tp");
			q.setParameter("tp", type);
			List<Account> accounts=q.getResultList();
			em.close();
			emf.close();
			return accounts;
		}
		
		public List<Transaction> fetchMiniStatement(int accno){
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracleTest");
			EntityManager em=emf.createEntityManager();
			String q1 ="select t from Transaction t "+
			"where t.account.accno=:ac "+
			"order by t.date desc";
			Query q = em.createQuery(q1);
			q.setParameter("ac", accno);
			q.setMaxResults(5);
			List<Transaction> transactions=q.getResultList();
			em.close();
			emf.close();
			return transactions;
		}

		public List<Transaction> fetchTransactions(int accno,LocalDate date){
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracleTest");
			EntityManager em=emf.createEntityManager();
			String q1 ="select t from Transaction t "+
			"where t.account.accno=:ac "+
			"and t.date >=:dt1 and t.date <= :dt2";
			Query q =  em.createQuery(q1);
			q.setParameter("ac", accno);
			q.setParameter("dt1", LocalDateTime.of(date,LocalTime.of(0, 0, 0)));
			q.setParameter("dt2", LocalDateTime.of(date,LocalTime.of(23, 59, 59)));
			List<Transaction> transactions=q.getResultList();
			em.close();
			emf.close();
			return transactions;
		}

//		public List<Transaction> fetchAmount(double bal){
//			EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracleTest");
//			EntityManager em=emf.createEntityManager();
//			String q1 ="select a from Account a inner join a.transactions t "+
//			"where t.account.bal=:bal";
//			Query q =  em.createQuery(q1);
//			q.setParameter("bal", bal);
////			q.setParameter("dt1", LocalDateTime.of(date,LocalTime.of(0, 0, 0)));
////			q.setParameter("dt2", LocalDateTime.of(date,LocalTime.of(23, 59, 59)));
//			List<Transaction> transactions=q.getResultList();
//			em.close();
//			emf.close();
//			return transactions;
//		}

		public List<Account> fetchAmount(double bal){
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("oracleTest");
		EntityManager em=emf.createEntityManager();
		String q1 ="select a from Account a inner join fetch a.transactions t "+
		"where t.amt=:bal";
		Query q =  em.createQuery(q1);
		q.setParameter("bal", bal);
//		q.setParameter("dt1", LocalDateTime.of(date,LocalTime.of(0, 0, 0)));
//		q.setParameter("dt2", LocalDateTime.of(date,LocalTime.of(23, 59, 59)));
		List<Account> accoun=q.getResultList();
		em.close();
		emf.close();
		return accoun;
	}

		
}


