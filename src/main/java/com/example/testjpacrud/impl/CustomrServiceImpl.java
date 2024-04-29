package com.example.testjpacrud.impl;

import com.example.testjpacrud.model.Customer;
import com.example.testjpacrud.repository.CustomRepositoy;
import com.example.testjpacrud.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomrServiceImpl implements CustomerService {
    @Autowired
    private CustomRepositoy customRepositoy;
    @Override
    public List<Customer> getAllCustomers() {
        return customRepositoy.findAll();
    }

    @Override
    public Customer getCustomer(Integer customerId) {
        return customRepositoy.findById(customerId).get();
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return customRepositoy.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customRepositoy.save(customer);
    }

    @Override
    public void deleteCustomer(Integer customerId) {
      customRepositoy.deleteById(customerId);
    }
}
