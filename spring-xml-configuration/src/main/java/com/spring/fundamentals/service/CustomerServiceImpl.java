package com.spring.fundamentals.service;

import java.util.List;

import com.spring.fundamentals.model.Customer;
import com.spring.fundamentals.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	/*
	 * This hardcoded instantiation of the HibernateCustomerRepositoryImpl object is no more
	 * needed when using Spring setter injection
	 */
	// private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl() {
	}

	// 2) This constructor is used for Spring constructor injection
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	// 1) This setter is used for Spring setter injection
//	public void setCustomerRepository(CustomerRepository customerRepository) {
//		this.customerRepository = customerRepository;
//	}
	
	/**
	 * 5) To demonstrate autowiring by name, we rename setCustomerRepository to setFoo, 
	 * to match our change in the applicationContext.xml
	 */
	public void setFoo(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
}
