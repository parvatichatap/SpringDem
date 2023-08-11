package com.example.SpringDemo.mongo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepo extends MongoRepository< Client,String> {
}
