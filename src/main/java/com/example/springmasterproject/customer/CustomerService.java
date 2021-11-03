package com.example.springmasterproject.customer;

import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    Iterable<Customer> findAllCustomers();
}
