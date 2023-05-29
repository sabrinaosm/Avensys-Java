package com.example.customerexample.jdbc;

import com.example.customerexample.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerJdbcRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY =
            """
                INSERT INTO Customer (id, name, address, email)
                VALUES (?, ?, ?, ?);
            """;

    private static String DELETE_QUERY =
            """
                DELETE FROM Customer WHERE id = ?;
            """;

    private static String SELECT_QUERY =
            """
                SELECT FROM Customer WHERE id = ?;
            """;

    public void insert(Customer customer) {
        springJdbcTemplate.update(INSERT_QUERY, customer.getId(), customer.getName(), customer.getAddress(), customer.getEmail());
    }

    public void deleteById(long id) {
        springJdbcTemplate.update(DELETE_QUERY, id);
    }

    public Customer findById(long id) {
        return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Customer.class), id);
    }
}
