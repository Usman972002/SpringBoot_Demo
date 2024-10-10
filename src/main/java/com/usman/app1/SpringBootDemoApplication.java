package com.usman.app1;

import com.usman.app1.model.Alien;
import com.usman.app1.model.Laptop;
import com.usman.app1.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		 ApplicationContext context =  SpringApplication.run(SpringBootDemoApplication.class, args);
//		System.out.println("Bismillah");
//		Alien alien = context.getBean(Alien.class);
//		alien.code();

		LaptopService service = context.getBean(LaptopService.class);
		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);
	}

}
