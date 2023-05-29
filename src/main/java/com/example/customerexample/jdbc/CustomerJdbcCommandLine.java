package com.example.customerexample.jdbc;
import com.example.customerexample.jpa.CustomerJpaRepository;
import com.example.customerexample.springdatajpa.CustomerSpringDataJpaRepository;
import com.example.customerexample.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomerJdbcCommandLine implements CommandLineRunner {

    // ******************* JDBC Repository Version *******************
//    private final CustomerJdbcRepository jdbcRepository;
//    public CustomerJdbcCommandLine(CustomerJdbcRepository jdbcRepository) {
//        this.jdbcRepository = jdbcRepository;
//    }

    // ******************* JPA Repository Version *******************
    //    private final CustomerJpaRepository jpaRepository;
    //    public CustomerJdbcCommandLine(CustomerJpaRepository jpaRepository) {
    //        this.jpaRepository = jpaRepository;
    //    }


    // ******************* Spring Data JPA Repository Version *******************
        private final CustomerSpringDataJpaRepository springDataJpaRepository;
        public CustomerJdbcCommandLine(CustomerSpringDataJpaRepository springDataJpaRepository) {
            this.springDataJpaRepository = springDataJpaRepository;
        }

    @Override
    public void run(String... args) throws Exception {
        // ******************* Spring Data JPA Repository Version *******************
                springDataJpaRepository.save(new Customer(1, "Sabrina", "Singapore", "sabrina@gmail.com"));
                springDataJpaRepository.save(new Customer(2, "Joe", "Dubai", "joe@gmail.com"));
                springDataJpaRepository.save(new Customer(3, "Jane", "Canada", "jane@gmail.com"));

                springDataJpaRepository.deleteById(3l);
                System.out.println(springDataJpaRepository.findById(1l));
                System.out.println(springDataJpaRepository.findById(2l));

        // ******************* JPA Repository Version *******************
        //        jpaRepository.insert(new Customer(1, "Sabrina", "Singapore", "sabrina@gmail.com"));
        //        jpaRepository.insert(new Customer(2, "Joe", "Dubai", "joe@gmail.com"));
        //        jpaRepository.insert(new Customer(3, "Jane", "Canada", "jane@gmail.com"));
        //
        //        jpaRepository.deleteById(3);
        //        System.out.println(jpaRepository.findById(1l));
        //        System.out.println(jpaRepository.findById(2l));

        // ******************* JDBC Repository Version *******************
//        jdbcRepository.insert(new Customer(1, "Sabrina", "Singapore", "sabrina@gmail.com"));
//        jdbcRepository.insert(new Customer(2, "Joe", "Dubai", "joe@gmail.com"));
//        jdbcRepository.insert(new Customer(3, "Jane", "Canada", "jane@gmail.com"));
//
//        jdbcRepository.deleteById(3);
//        System.out.println(jdbcRepository.findById(1l));
//        System.out.println(jdbcRepository.findById(2l));

    }
}

