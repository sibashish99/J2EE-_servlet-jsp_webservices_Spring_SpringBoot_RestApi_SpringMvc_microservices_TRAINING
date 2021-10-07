package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;


@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Student management Service", version = "1.0"))
public class StudentServiceRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceRestApiApplication.class, args);
	}

}
