package com.example.fourthapp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.fourthapp.entity.User;
import com.example.fourthapp.service.UserService;

@SpringBootApplication
public class FourthappApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(FourthappApplication.class, args);
		UserService service  = context.getBean(UserService.class);
		User user = new User();
		user.setName("Yogesh");
		user.setEmail("itsyyoy@gmail.com");
		user.setPassword("abc@123");

		service.save(user);

	}

}
