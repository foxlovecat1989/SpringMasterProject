package com.example.springmasterproject.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {

    @Value("${app.useFakeCustomerRepository:false}")
    private Boolean useFakeCustomerRepository;

    @Bean
    CommandLineRunner commandLineRunner(){
        return  args -> {
            System.out.println("Command Line Runner");
        };
    }

    @Bean
    CustomerRepository customerRepository(){
        System.out.println("useFakeCustomerRepository: " + useFakeCustomerRepository);
        return useFakeCustomerRepository ?
                new CustomerFakeRepositoryImpl() :
                new CustomerRepositoryImpl();
    }
}
