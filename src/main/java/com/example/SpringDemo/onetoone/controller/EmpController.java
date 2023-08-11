package com.example.SpringDemo.onetoone.controller;

import com.example.SpringDemo.di.Employee;
import com.example.SpringDemo.onetoone.Repository.AddressRepository;
import com.example.SpringDemo.onetoone.Repository.EmpRepository;
import com.example.SpringDemo.onetoone.model.Address;
import com.example.SpringDemo.onetoone.model.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
    @Autowired
    private EmpRepository empRepository;

    @Autowired
    private AddressRepository addressRepository;

    @PostMapping("saveEmp")
    public String saveEmp(@RequestBody Emp emp){
        Emp emp1 = new Emp();
        emp1.setName(emp.getName());
        emp1.setMobileNumber(emp.getMobileNumber());

        Address address = new Address();
        address.setCity(emp.getAddress().getCity());
        address.setFlatNumber(emp.getAddress().getFlatNumber());
        address.setStreetName(emp.getAddress().getStreetName());
        address.setEmp(emp1);

        emp1.setAddress(address);

        empRepository.save(emp1);
        addressRepository.save(address);
        return "emp saved ...";
    }
    @PutMapping("updateEmp")
    public String updateEmp(@RequestBody Emp emp){
        Emp e=empRepository.getReferenceById(emp.getId());
        e.setName(emp.getName());
        e.setMobileNumber(emp.getMobileNumber());

        Address address1 = new Address();
        address1.setCity(emp.getAddress().getCity());
        address1.setFlatNumber(emp.getAddress().getFlatNumber());
        address1.setStreetName(emp.getAddress().getStreetName());
        address1.setEmp(e);

        e.setAddress(address1);
        empRepository.save(e);
        addressRepository.save(address1);
        return "emp updated ...";
    }
}


