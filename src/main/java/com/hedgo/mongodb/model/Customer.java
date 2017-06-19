package com.hedgo.mongodb.model;

import org.springframework.data.annotation.Id;

import java.util.List;


//@Document - moge dac ta adnotacje i w MongoDB beda te obiekty zapisywane pod inna nazwa kolekcji dokumentow
public class Customer {
    public @Id String id;
    public String firstName;
    public String lastName;
    public Integer age;
    public List<School> schools;

    public Customer() {
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Customer(String firstName, String lastName, Integer age, List<School> schools) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.schools = schools;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<School> getSchools() {
        return schools;
    }

    public void setSchools(List<School> schools) {
        this.schools = schools;
    }


}