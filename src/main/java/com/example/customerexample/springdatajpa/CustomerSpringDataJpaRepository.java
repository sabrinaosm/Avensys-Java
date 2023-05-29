package com.example.customerexample.springdatajpa;

import com.example.customerexample.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerSpringDataJpaRepository extends JpaRepository<Customer, Long> {

}
