package com.cognixia.jump.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class CustomerserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerserviceApplication.class, args);
	}
	 @Bean
	 public WebMvcConfigurer corsConfigurer() {
	     return new WebMvcConfigurer() {
	         @Override
	         public void addCorsMappings(CorsRegistry registry) {
	             registry.addMapping("/**")
	                     .allowedOrigins("*")
	                     .allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD", "PATCH")
	                     .allowCredentials(true);
	         }
	     };
	 }
}
