package com.cabbooking.customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cabbooking.service.CabServiceImpl;
import com.cabbooking.service.ICabService;

public class User {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("com.cabbooking");
		ICabService cabService=(CabServiceImpl) context.getBean(ICabService.class,"cabService");
		cabService.getAll().forEach(System.out::println);
	}

}
