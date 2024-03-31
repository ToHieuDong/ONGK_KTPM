package com.example.gk_tohieudong.BackEnd.repositories;

import com.example.gk_tohieudong.BackEnd.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
