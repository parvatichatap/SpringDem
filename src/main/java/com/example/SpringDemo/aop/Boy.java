package com.example.SpringDemo.aop;

import org.springframework.stereotype.Component;

@Component
public class Boy {
    public int study1(int i){
        System.out.println("In boy study");
        return i;
    }

}
