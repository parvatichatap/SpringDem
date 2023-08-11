//package com.example.SpringDemo.LoginPassword.controller;


//import com.example.SpringDemo.LoginPassword.entity.People;
//import com.example.SpringDemo.LoginPassword.repository.ApiResponse;
//import com.example.SpringDemo.LoginPassword.repository.PeopleRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@CrossOrigin(origins = "http://localhost:3000/")
//public class PeopleController {
//    @Autowired
//   private PeopleRepository peopleRepository;
//    @PostMapping("savePeople")
//    private ResponseEntity<?> setSavePeople(@RequestBody People people) {
//        People peopleObj = peopleRepository.save(people);
//        ApiResponse response = new ApiResponse();
//
//        if (peopleObj != null) {
//            response.setMessage("Success");
//            response.setStatusCode(HttpStatus.CREATED.value());
//            response.setResult("User created successfully!!");
//            return ResponseEntity.ok(response);
//        }
//
//        return ResponseEntity.ok(response);
//    }
//    @GetMapping("getPeople")
//    public List<People> getPeopleList() {
//        return peopleRepository.findAll();
//    }
//    @PutMapping("updatePassword")
//    public String updatePassword(@RequestBody People people) {
//
//       People p = peopleRepository.findByPeopleName(people.getPeopleName());
//        p.setPassword(people.getPassword());
//       peopleRepository .save(p);
//
//        return "password update";
//    }
//
//    @DeleteMapping("deletePeople")
//    public String deletePeople(@RequestBody People people){
//       People p1=peopleRepository.findByPeopleName(People.getPeopleName());
//       peopleRepository.deleteByPeopleName(p1);
//        return "Record deleted";
//    }
//}
