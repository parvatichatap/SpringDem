package com.example.SpringDemo.ManyToOne.controller;

import com.example.SpringDemo.ManyToOne.entity.District;
import com.example.SpringDemo.ManyToOne.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class DistrictController {
    @Autowired
private DistrictRepository districtRepository;
    @PostMapping("saveDistrict")
    private  String saveDistrict(@RequestBody District district){
districtRepository.save(district);
return "District Saved";
    }
    @GetMapping("getDistrict/{id}")
    public Optional<District>getDistrict(@PathVariable("id") Long id){
     return   districtRepository.findById(id);
    }
}
