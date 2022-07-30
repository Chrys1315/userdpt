package com.devsuperior.userdpt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "entities")
@SpringBootApplication
public class UserdptApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserdptApplication.class, args);
	}

}
