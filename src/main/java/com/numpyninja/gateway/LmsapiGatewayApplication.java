package com.numpyninja.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication

public class LmsapiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(LmsapiGatewayApplication.class, args);
	}

	@GetMapping("/greeting")
	public void greetings() {
		
	}
}
