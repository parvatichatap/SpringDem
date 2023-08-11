package com.example.SpringDemo.login;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Entity
@Setter
@Getter

public class Flipkart {
    @Id
    @GeneratedValue
    private Long id;

    private String firstname;
    private String lastname;
    private String username;
    private String email;
    private String password;
    private String phone;
}

