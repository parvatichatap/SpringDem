package com.example.SpringDemo.ManyToOne.repository;

import com.example.SpringDemo.ManyToOne.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country , Long> {

}
