package com.example.springmasterproject.customer;

import com.example.springmasterproject.exception.NotFoundException;

import java.util.List;

// @Repository(value = "fake")
public class CustomerFakeRepositoryImpl implements CustomerRepository {
    List<Customer> customers =
            List.of(
                new Customer(1L, "Fruite", "password", "ed@gmail..com"),
                new Customer(2L, "Apple", "password", "ed@gmail..com"),
                new Customer(3L, "Key", "password", "ed@gmail..com"),
                new Customer(4L, "Elle", "password", "ed@gmail..com")
             );

    @Override
    public Iterable<Customer> findAll() {
        return customers;
    }

    @Override
    public Customer findOneById(Long id){
        Customer result =
                customers.stream()
                        .filter(customer ->  customer.getId().equals(id))
                        .findFirst()
                        .orElseThrow(
                                () -> new NotFoundException("Customer ID: " + id + " NOT FOUND!")
                        );
        return result;
    }
}
