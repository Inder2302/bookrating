package com.goodbooks.bookrating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BookratingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookratingApplication.class, args);
	}

}
