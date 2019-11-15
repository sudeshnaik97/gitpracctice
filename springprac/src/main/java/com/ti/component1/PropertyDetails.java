package com.ti.component1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="propertydetails")
public class PropertyDetails {
	
	@Id
	@Column(name="propertyId")
	private int propId;
	@Column(name="propertylocation")
	private String proplocation;
	@Column(name="estimatedamount")
	private double estamount;
	public int getPropId() {
		return propId;
	}
	public void setPropId(int propId) {
		this.propId = propId;
	}
	public String getProplocation() {
		return proplocation;
	}
	public void setProplocation(String proplocation) {
		this.proplocation = proplocation;
	}
	public double getEstamount() {
		return estamount;
	}
	public void setEstamount(double estamount) {
		this.estamount = estamount;
	}
	@Override
	public String toString() {
		return "propertyDetails [propId=" + propId + ", proplocation=" + proplocation + ", estamount=" + estamount
				+ "]";
	}
	
	
}
