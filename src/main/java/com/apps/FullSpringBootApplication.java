package com.apps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//@EntityScan(basePackages = "")
public class FullSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullSpringBootApplication.class, args);
	}

}
