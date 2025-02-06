package com.apps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EntityScan(basePackages = "")
//@EnableJpaRepositories(basePackages = "")
public class FullSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullSpringBootApplication.class, args);
	}

}
