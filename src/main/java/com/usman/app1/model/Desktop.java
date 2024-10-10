package com.usman.app1.model;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    public void compile(){
        System.out.println("Compiling using Desktop");
    }
}
