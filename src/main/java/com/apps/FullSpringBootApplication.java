package com.apps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EntityScan(basePackages = "")
//@EnableJpaRepositories(basePackages = "")
public class FullSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullSpringBootApplication.class, args);
	}

}
