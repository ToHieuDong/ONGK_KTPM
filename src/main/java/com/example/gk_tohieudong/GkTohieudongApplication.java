package com.example.gk_tohieudong;

import com.example.gk_tohieudong.BackEnd.models.Customer;
import com.example.gk_tohieudong.BackEnd.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;

@SpringBootApplication
public class GkTohieudongApplication {
    @Autowired
    private CustomerRepository customerRepository;
    public static void main(String[] args) {
        SpringApplication.run(GkTohieudongApplication.class, args);
    }

    @Bean
    public CommandLineRunner x () {
        return  new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Random random = new Random();

                for (int i = 0; i < 10; i++) {
                    Customer customer = new Customer("Dong"+i, "hd.dt", "0123", "LA");
                    customerRepository.save(customer);

                }


            }
        };

    }

}
