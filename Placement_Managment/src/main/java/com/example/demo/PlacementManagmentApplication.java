package com.example.demo;

/* Group 5 :- Placement Management System
 *		member:-   Chetan sanjiv sonar
 *   						
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PlacementManagmentApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(PlacementManagmentApplication.class, args);
		
		context.getBean(AdminRepository.class);
		context.getBean(CertificateRepository.class);
		context.getBean(CollegeRepository.class);
		context.getBean(PlacementRepository.class);
		context.getBean(StudentRepository.class);
		context.getBean(UserRepository.class);
		
		
		
	}

}
