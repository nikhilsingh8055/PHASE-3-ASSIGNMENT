package com.simplilearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.simplilearn")
public class RestFulWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestFulWebServicesApplication.class, args);
	}

}
