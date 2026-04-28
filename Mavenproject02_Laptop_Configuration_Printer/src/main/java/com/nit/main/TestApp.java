package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.Laptop;
import com.nit.sbeans.LaptopService;

public class TestApp {
public static void main(String[] args) {
	

	
	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
	
	Laptop laptop=ctx.getBean(Laptop.class);
	
	laptop.setBrand("Dell");
	laptop.setProcessor("Intel i7");
	laptop.setRam("16 GB");
	
	LaptopService service=ctx.getBean(LaptopService.class);
	service.printLaptopDetails();
	
}	
}
