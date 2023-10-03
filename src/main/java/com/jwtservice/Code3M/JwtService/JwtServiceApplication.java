package com.jwtservice.Code3M.JwtService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class JwtServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtServiceApplication.class, args);
	}

}
