package com.example.springmasterproject.customer;

import org.springframework.stereotype.Repository;

public interface CustomerRepository {
    Iterable<Customer> findAll();
}
