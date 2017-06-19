package com.hedgo.mongodb.service;

import com.hedgo.mongodb.model.Customer;
import com.hedgo.mongodb.model.School;
import com.hedgo.mongodb.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CustomerService {
    private
    @Autowired
    CustomerRepository repository;

    public void run() {

        repository.deleteAll();

        repository.save(new Customer("Alice", "Smith"));
        repository.save(new Customer("Bob1", "Smith"));
        repository.save(new Customer("Bob2", "Smith"));
        repository.save(new Customer("Bob3", "Smith"));

        repository.save(new Customer("Andrzej", "Okon", 36));

        List<School> schoolList = Arrays.asList(new School("kopernik", "matura", 4), new School("ftims", "magister", 5));
        repository.save(new Customer("Andrzej", "Okon", 36, schoolList));

        // fetch all customers
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (Customer customer : repository.findAll()) {
            System.out.println(customer);
        }
        System.out.println();

        // fetch an individual customer
        System.out.println("Customer found with findByFirstName('Alice'):");
        System.out.println("--------------------------------");
        System.out.println(repository.findByFirstName("Alice"));

        System.out.println("Customers found with findByLastName('Smith'):");
        System.out.println("--------------------------------");
        for (Customer customer : repository.findByLastName("Smith")) {
            System.out.println(customer);
        }

    }
}
