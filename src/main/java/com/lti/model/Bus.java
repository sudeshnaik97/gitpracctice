package com.lti.model;

import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TBL_BUS")
public class Bus {

@Id
@GeneratedValue
private int busno;

private String operator;

private LocalTime departure;
private LocalTime arrival;

@OneToMany(mappedBy="bus",cascade=CascadeType.ALL)
private List<Route> route;

public int getBusno() {
	return busno;
}

public void setBusno(int busno) {
	this.busno = busno;
}

public String getOperator() {
	return operator;
}

public void setOperator(String operator) {
	this.operator = operator;
}

public LocalTime getDeparture() {
	return departure;
}

public void setDeparture(LocalTime departure) {
	this.departure = departure;
}

public LocalTime getArrival() {
	return arrival;
}

public void setArrival(LocalTime arrival) {
	this.arrival = arrival;
}

public List<Route> getRoute() {
	return route;
}

public void setRoute(List<Route> route) {
	this.route = route;
}
	
}
