package com.spring.microservice.nextflixeurekamicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NextflixEurekaMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NextflixEurekaMicroserviceApplication.class, args);
	}
}
