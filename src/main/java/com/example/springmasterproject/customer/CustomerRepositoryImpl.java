package com.example.springmasterproject.customer;

import java.util.List;

// @Repository
// @Primary
public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Iterable<Customer> findAll() {
        // TODO - connect to a real db
        return List.of(
                new Customer(1L, "get data from real db", "password", "ed@gmail..com")
        );
    }

    @Override
    public Customer findOneById(Long id) {
        return new Customer(1L, "get data from real db", "password", "ed@gmail..com");
    }
}
