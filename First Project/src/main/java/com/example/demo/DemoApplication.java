package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(DemoApplication.class, args);

		Students s = context.getBean(Students.class);
		s.setName("Yogesh");	
		s.setEmail("yogeshgaur@gmail.com");	
		s.setRollNo(12);	
		String Name = s.getName();
		String Email = s.getEmail();
		int RollNo = s.getRollNo();
		String school = s.showSchool();
		System.out.println(Name);
		System.out.println(Email);
		System.out.println(RollNo);
		System.out.println(school);
	}
}
