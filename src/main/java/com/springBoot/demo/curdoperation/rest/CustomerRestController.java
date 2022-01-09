package com.springBoot.demo.curdoperation.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.demo.curdoperation.dao.CustomerDao;
import com.springBoot.demo.curdoperation.entity.Customer;

@RestController
public class CustomerRestController {
	
	CustomerDao customerdao;
	@Autowired
	public CustomerRestController(@Qualifier("customerDaoJPAIMPL") CustomerDao c) {
		customerdao=c;
	}
	@GetMapping("/")
	public String getCustomer(){	
		return "Hello World!";
	}
	@GetMapping("/customers")
	public List<Customer> getCustomers(){
		List<Customer> customers=customerdao.getCustomers();		
		return customers;
	}

}
