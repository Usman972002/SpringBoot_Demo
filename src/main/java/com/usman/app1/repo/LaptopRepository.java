package com.usman.app1.repo;

import com.usman.app1.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop lap){
        System.out.println("Saved in Database");
    }
}
