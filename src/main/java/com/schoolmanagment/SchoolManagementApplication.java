package com.schoolmanagment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableCaching            // Activates the Redis caching logic
@EnableTransactionManagement // Activates the @Transactional logic
public class SchoolManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolManagementApplication.class, args);
    }
}