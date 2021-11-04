package com.example.springmasterproject.customer;

import com.example.springmasterproject.exception.ApiRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/customers")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public Iterable<Customer> findAll(){
        Iterable<Customer> customers = customerService.findAllCustomers();
        customers.forEach(System.out::println);
        return customers;
    }

    @GetMapping(path = "/{id}")
    public Customer findOneById(@PathVariable("id") Long id){
        return customerService.findOneById(id);
    }

    @GetMapping(path = "/{id}/exception")
    public Customer getCustomerException(@PathVariable("id") Long id){

        throw new ApiRequestException("ApiRequestException for Customer" + id);
    }

    @PostMapping
    public void create(@RequestBody @Valid Customer customer){
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
