package com.example.SpringDemo.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")

public class FlipkartController {
    @Autowired
   public  FlipkartRepo flipkartRepo;

    @PostMapping("saveFlipkart")
    public  String saveFlipkart(@RequestBody Flipkart flipkart){
        flipkartRepo.save(flipkart);
        return "flipkart save";
    }
}
