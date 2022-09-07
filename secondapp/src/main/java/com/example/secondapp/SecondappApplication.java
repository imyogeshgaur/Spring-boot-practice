package com.example.secondapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
@SpringBootApplication
public class SecondappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondappApplication.class, args);
	}

}
