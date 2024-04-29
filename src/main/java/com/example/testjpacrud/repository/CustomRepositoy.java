package com.example.testjpacrud.repository;

import com.example.testjpacrud.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomRepositoy extends JpaRepository<Customer, Integer> {

}
