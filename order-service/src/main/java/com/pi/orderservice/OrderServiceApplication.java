package com.pi.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableDiscoveryClient

public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				// allow all origins to access the service
				// allow preflight requests
				registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "POST", "PUT",
						"DELETE", "OPTIONS", "HEAD").allowedHeaders("Requestor-Type").exposedHeaders("X-Get-Header");
				
			}
		};
	}

}
