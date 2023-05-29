package com.example.customerexample.jpa;

import com.example.customerexample.customer.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CustomerJpaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Customer customer) {
        entityManager.merge(customer);
    }

    public Customer findById(long id) {
        return entityManager.find(Customer.class, id);
    }

    public void deleteById(long id) {
        Customer customer = entityManager.find(Customer.class, id);
        entityManager.remove(customer);
    }
}
