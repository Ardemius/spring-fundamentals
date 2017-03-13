package com.spring.fundamentals.service;

import java.util.List;

import com.spring.fundamentals.model.Customer;
import com.spring.fundamentals.repository.CustomerRepository;
import com.spring.fundamentals.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

	/* (non-Javadoc)
	 * @see com.pluralsight.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
