package com.lti.model;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TBL_Route")
public class Route {

@Id
@GeneratedValue
private int routeno;

private String routeDirection;

private LocalDateTime deptTime;
private LocalDateTime arriTime;

@ManyToOne
@JoinColumn(name="Bus_Id")
private Bus bus;

public int getRouteno() {
	return routeno;
}

public void setRouteno(int routeno) {
	this.routeno = routeno;
}

public String getRouteDirection() {
	return routeDirection;
}

public void setRouteDirection(String routeDirection) {
	this.routeDirection = routeDirection;
}

public LocalDateTime getDeptTime() {
	return deptTime;
}

public void setDeptTime(LocalDateTime deptTime) {
	this.deptTime = deptTime;
}

public LocalDateTime getArriTime() {
	return arriTime;
}

public void setArriTime(LocalDateTime arriTime) {
	this.arriTime = arriTime;
}

public Bus getBus() {
	return bus;
}

public void setBus(Bus bus) {
	this.bus = bus;
}

}
