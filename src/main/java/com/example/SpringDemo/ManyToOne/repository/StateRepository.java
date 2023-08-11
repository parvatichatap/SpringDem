package com.example.SpringDemo.ManyToOne.repository;

import com.example.SpringDemo.ManyToOne.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State ,Long> {

}
