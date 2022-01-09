package com.springBoot.demo.curdoperation.dao;

import java.util.List; 
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springBoot.demo.curdoperation.entity.Customer;
@Repository
public class CustomerDaoJPAIMPL implements CustomerDao {
	EntityManager entityManager;
	@Autowired
	public CustomerDaoJPAIMPL(EntityManager e) {
		entityManager=e;
	}
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		
		TypedQuery<Customer> theQuery = 
				entityManager.createQuery("from Customer order by lastName",
											Customer.class);		
		List<Customer> customers = theQuery.getResultList();
		return customers;
	}

}
