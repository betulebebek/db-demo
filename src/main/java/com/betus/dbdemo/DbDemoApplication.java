package com.betus.dbdemo;
import com.betus.dbdemo.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DbDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DbDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository) {
        return runner -> {

        };
    }
}