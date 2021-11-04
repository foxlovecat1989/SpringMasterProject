package com.example.springmasterproject.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Iterable<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findOneById(Long id) {
        return customerRepository.findOneById(id);
    }
}
