package com.example.springmasterproject.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v2/customers")
public class CustomerControllerV2 {

    private final CustomerService customerService;

    @Autowired
    public CustomerControllerV2(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public Iterable<Customer> findAll(){
        System.out.println("v2 controller");
        return customerService.findAllCustomers();
    }

    @PostMapping
    public void create(@RequestBody Customer customer){
        System.out.println("POST REQUEST");
    }

    @PutMapping
    public void update(@RequestBody Customer customer){
        System.out.println("PUT REQUEST");
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable("id") Long id){
        System.out.println("DELETE REQUEST");
    }
}
