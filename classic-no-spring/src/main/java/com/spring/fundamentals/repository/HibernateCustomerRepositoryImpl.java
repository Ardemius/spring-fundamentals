package com.spring.fundamentals.repository;

import java.util.ArrayList;
import java.util.List;

import com.spring.fundamentals.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.pluralsight.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();

		customer.setFirstname("Thorin");
		customer.setLastname("Oakenshield");

		customers.add(customer);

		return customers;
	}

}
