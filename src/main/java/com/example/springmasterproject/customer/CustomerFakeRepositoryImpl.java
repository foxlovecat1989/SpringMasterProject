package com.example.springmasterproject.customer;

import java.util.List;

// @Repository(value = "fake")
public class CustomerFakeRepositoryImpl implements CustomerRepository {
    @Override
    public Iterable<Customer> findAll() {

        return List.of(
                new Customer(1L, "Fruite", "password", "ed@gmail..com"),
                new Customer(2L, "Apple", "password", "ed@gmail..com"),
                new Customer(3L, "Key", "password", "ed@gmail..com"),
                new Customer(4L, "Elle", "password", "ed@gmail..com")
        );
    }
}
