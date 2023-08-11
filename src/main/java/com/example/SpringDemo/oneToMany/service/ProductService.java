package com.example.SpringDemo.oneToMany.service;

import com.example.SpringDemo.oneToMany.dto.CustomerRequestDto;
import com.example.SpringDemo.oneToMany.entity.Customer;
public interface ProductService {

    String saveCustomer(CustomerRequestDto customer);
}

