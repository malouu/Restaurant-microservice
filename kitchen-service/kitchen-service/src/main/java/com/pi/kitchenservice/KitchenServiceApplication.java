package com.pi.kitchenservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDiscoveryClient
public class KitchenServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KitchenServiceApplication.class, args);
	}

}
