package com.example.springmasterproject.customer;

import org.springframework.stereotype.Repository;
import java.util.List;

// @Repository(value = "fake")
public class CustomerFakeRepositoryImpl implements CustomerRepository {
    @Override
    public Iterable<Customer> findAll() {

        return List.of(
                new Customer(1L, "Fruite"),
                new Customer(2L, "Apple"),
                new Customer(3L, "Key"),
                new Customer(4L, "Elle")
        );
    }
}
