package com.example.SpringDemo.login;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FlipkartRepo extends JpaRepository <Flipkart, Long> {

}
