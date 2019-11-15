package com.lti.test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.lti.dao.GenericDao;
import com.lti.model.Bus;
import com.lti.model.Route;
import com.lti.service.BusService;

public class BusTest {

	
	@Test
	public void insertData()
	{
		Bus b=new Bus();
		b.setOperator("Nalale");
		b.setArrival(LocalTime.of(12, 05));
		b.setDeparture(LocalTime.of(12, 06));
		Route rou= new Route();
		rou.setRouteno(10);
		rou.setArriTime(LocalDateTime.of(2019, 11, 20, 12, 5));
		rou.setDeptTime(LocalDateTime.of(2019, 12,11,12,9));
		rou.setRouteDirection("Balaghat");
		rou.setBus(b);
		List<Route> li=new ArrayList<Route>();
		li.add(rou);b.setRoute(li);
		BusService bs=new BusService();
		bs.add1(b);
 	}
	
	@Test
	public void BusRouteTest()
	{
		GenericDao dao= new GenericDao();
		Route rou=(Route) dao.fetchById(Route.class, 445);
		System.out.println(rou.getRouteDirection());
		System.out.println(rou.getArriTime());
		Bus b=rou.getBus();
		System.out.println(b.getOperator());
		System.out.println(b.getDeparture());
		
		
	}
	
}
