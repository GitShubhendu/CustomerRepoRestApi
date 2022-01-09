package com.springBoot.demo.curdoperation.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springBoot.demo.curdoperation.entity.Customer;
@Repository
public class CustomerDaoIMPL implements CustomerDao {
	EntityManager entityManager;
	@Autowired
	public CustomerDaoIMPL(EntityManager e) {
		entityManager=e;
	}
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		System.out.println("inside dao");
		Session currentSession=entityManager.unwrap(Session.class);
		Query<Customer> theQuery = 
				currentSession.createQuery("from Customer order by lastName",
											Customer.class);
		
		// execute query and get result list
		List<Customer> customers = theQuery.getResultList();
		return customers;
	}

}
