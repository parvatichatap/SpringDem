package com.example.SpringDemo.ManyToOne.controller;

import com.example.SpringDemo.ManyToOne.entity.State;
import com.example.SpringDemo.ManyToOne.repository.StateRepository;
//import com.example.SpringDemo.jpa.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StateController {
    @Autowired
    private StateRepository stateRepository;

    @PostMapping("saveState")
    private  String saveState(@RequestBody State state){
        stateRepository.save(state);
        return "State saved";
    }
    @GetMapping("getState/{id}")
    public Optional<State> getStudent (@PathVariable("id") Long id) {
        return stateRepository.findById(id);
    }
}
