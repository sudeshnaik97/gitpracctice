package com.lti.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.lti.entity.Customer;
import com.lti.service.ServiceCustomer;

@Controller
public class RegisterController {
	
	@Autowired
	private ServiceCustomer customerService;
	@RequestMapping(path="reg.lti",method=RequestMethod.POST)

//public String register(HttpServletRequest requset){
//public String register(@RequestParam("name") String name, @RequestParam("name1") String name1){ //only use when to retrieve few data from db and display
		
	public String register(Customer customer, @RequestParam("profilePic") MultipartFile m){
		System.out.println(m.getOriginalFilename());
		
		String path = "d:/uploads/";
		String finalpath = path + m.getOriginalFilename();
		
		try {
			m.transferTo(new File(finalpath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		customer.setProfilepicname(m.getOriginalFilename());
		customerService.register(customer);
		return "confirmation.jsp";
	}
}
