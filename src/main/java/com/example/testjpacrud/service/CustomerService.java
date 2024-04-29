package com.example.testjpacrud.service;

import com.example.testjpacrud.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer getCustomer(Integer customerId);
    Customer addCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    void deleteCustomer(Integer customerId);
}
