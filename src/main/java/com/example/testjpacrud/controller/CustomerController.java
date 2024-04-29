package com.example.testjpacrud.controller;

import com.example.testjpacrud.model.Customer;
import com.example.testjpacrud.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/all")
    public String getAllCustomers(){
        return customerService.getAllCustomers().toString();
    }
    @GetMapping("/get")
    public String getCustomer(@Param("customerId") String customerId){
        return customerService.getCustomer(Integer.parseInt(customerId)).toString();
    }
    @PostMapping("/add")
    public String addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer).toString();
    }
    @PutMapping("/update")
    public String updateCustomer(@RequestBody Customer customer){
        return customerService.updateCustomer(customer).toString();
    }
    @DeleteMapping
public String deleteCustomer(@Param("customerId") String customerId){
        customerService.deleteCustomer(Integer.parseInt(customerId));
        return "Customer deleted";
    }
}
