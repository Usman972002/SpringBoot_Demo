package com.usman.app1.service;

import com.usman.app1.repo.LaptopRepository;
import com.usman.app1.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap){
        System.out.println("Method Called in Service");
        repo.save(lap);
    }
}
