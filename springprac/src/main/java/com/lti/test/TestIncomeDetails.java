package com.lti.test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.dao.HomeLoanDaoInterface;
import com.ti.component1.IncomeDetails;
import com.ti.component1.BankDetails;
import com.ti.component1.CustomerDetails;
import com.ti.component1.PropertyDetails;



public class TestIncomeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx=
				new ClassPathXmlApplicationContext("springpractice.xml");
		
HomeLoanDaoInterface ob=(HomeLoanDaoInterface)ctx.getBean("income");

//IncomeDetails id=new IncomeDetails();
//id.setEmployeeName("Vishwendra");
//id.setOrganizationType("IT");
//id.setRetirementAge(55);
//id.setTypeOfEmployment("Service");
//ob.addNewRecord(id);
//
//
//IncomeDetails id1=new IncomeDetails();
//id1.setEmployeeName("Utkarsh");
//id1.setOrganizationType("Civil");
//id1.setRetirementAge(62);
//id1.setTypeOfEmployment("Service");
//ob.addNewRecord(id1);
//
//
//IncomeDetails id2=new IncomeDetails();
//id2.setEmployeeName("Sudesh");
//id2.setOrganizationType("IT");
//id2.setRetirementAge(59);
//id2.setTypeOfEmployment("Govt. Service");
//ob.addNewRecord(id2);
/*customerDetails cd=new customerDetails();
cd.setFname("Vishwendra");
cd.setMname("Narendra");
cd.setLname("Singh");
cd.setGender("Male");
cd.setDob(LocalDate.of(1995, 11, 7));
cd.setEmail("visshu@gmail.com");
cd.setAadharNo(213654781267L);
cd.setNationality("Indian");
cd.setPan("asder1234");
cd.setPhno(9874561215L);
ob.addNewRecord(cd);*/
IncomeDetails list=(IncomeDetails)ob.fetchById(IncomeDetails.class, 541);
System.out.println(list);
//PropertyDetails ppd=new PropertyDetails();
//ppd.setPropId(123564);
//ppd.setProplocation("Aundh");
//ppd.setEstamount(1500000);
//ob.addNewRecord(ppd);
//BankDetails bd= new BankDetails();
//bd.setAccountNo(123400003456l);
//bd.setBranch("Hdfc Powai");
//bd.setIfsc("HDFC0SDFGH");
//bd.setCreditscore(799);
//ob.addNewRecord(bd);
//BankDetails list=(BankDetails)ob.fetchById(BankDetails.class, 1);
//System.out.println(list);
	}

}
