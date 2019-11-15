package com.ti.component1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="incomedetails")
public class IncomeDetails {
	@Id
	@GeneratedValue/*(strategy=GenerationType.SEQUENCE,
	generator="id_gen")
	@SequenceGenerator(name="id_gen",
			sequenceName="id_seq",
			initialValue=10000,
			allocationSize=1)*/
	private int custId;
	private String typeOfEmployment;
	@Override
	public String toString() {
		return "IncomeDetails [custId=" + custId + ", typeOfEmployment=" + typeOfEmployment + ", organizationType="
				+ organizationType + ", retirementAge=" + retirementAge + ", employeeName=" + employeeName + "]";
	}
	private String organizationType;
	private int retirementAge;
	private String employeeName;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getTypeOfEmployment() {
		return typeOfEmployment;
	}
	public void setTypeOfEmployment(String typeOfEmployment) {
		this.typeOfEmployment = typeOfEmployment;
	}
	public String getOrganizationType() {
		return organizationType;
	}
	public void setOrganizationType(String organizationType) {
		this.organizationType = organizationType;
	}
	public int getRetirementAge() {
		return retirementAge;
	}
	public void setRetirementAge(int retirementAge) {
		this.retirementAge = retirementAge;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

}
