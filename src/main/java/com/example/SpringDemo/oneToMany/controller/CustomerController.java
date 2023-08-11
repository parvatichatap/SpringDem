package com.example.SpringDemo.oneToMany.controller;

import com.example.SpringDemo.oneToMany.dto.CustomerRequestDto;
import com.example.SpringDemo.oneToMany.entity.Customer;
import com.example.SpringDemo.oneToMany.entity.Product;
import com.example.SpringDemo.oneToMany.repository.CustomerRepository;
import com.example.SpringDemo.oneToMany.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Map;

@RestController
public class CustomerController {

    @Autowired
    private ProductService productService;
    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("save")
    public String saveCustomer( @RequestBody CustomerRequestDto customer) {
        return productService.saveCustomer(customer);
    }
    @GetMapping("getCustomer")
    public List<Map<String, String>> getCustomer() {
        return customerRepository.listOfCustomer();
    }

    @GetMapping("getCustomerById")
    public Map<String, String> getCustomerById(@RequestParam Long id) {
        return customerRepository.getCustById(id);
    }


}