package com.example.SpringDemo.ManyToOne.controller;

import com.example.SpringDemo.ManyToOne.entity.Country;
import com.example.SpringDemo.ManyToOne.repository.CountryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CountryController {
    @Autowired
    private CountryRepository countryRepository;
    @PostMapping("saveCountry")
    public String saveCountry(@RequestBody Country country) {

        countryRepository.save(country);
        return " country saved.";

    }
    @GetMapping("getCountry/{id}")
    public Optional<Country> getCountry(@PathVariable ("id") Long id){

        return  countryRepository.findById(id);
    }
}
