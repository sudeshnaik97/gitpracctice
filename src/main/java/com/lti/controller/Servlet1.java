package com.lti.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.lti.dao.CustomerDao;
import com.lti.model.Customer;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		{	
			String uname=request.getParameter("cname");
			String city=request.getParameter("custcity");
			int id=Integer.parseInt(request.getParameter("fid"));
			
			Customer c= new Customer();
			c.setCname(request.getParameter("cname"));
			c.setCustCity(request.getParameter("custcity"));
			
			CustomerDao dao=new CustomerDao();
		     dao.insert(c);
		//	c=dao.fetch(id);
			System.out.println(c.getCname());
			System.out.println(c.getCustCity());
			
		}
	}

}
