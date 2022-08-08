package com.example.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceRegistryReproApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryReproApplication.class, args);
	}

}
