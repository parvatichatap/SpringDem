package com.example.SpringDemo.ManyToOne.repository;

import com.example.SpringDemo.ManyToOne.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistrictRepository extends JpaRepository<District , Long> {

}
