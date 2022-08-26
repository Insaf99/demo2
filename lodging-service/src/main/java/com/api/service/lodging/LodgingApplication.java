package com.api.service.lodging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class LodgingApplication {

	public static void main(String[] args) {
		SpringApplication.run(LodgingApplication.class, args);
	}

}
