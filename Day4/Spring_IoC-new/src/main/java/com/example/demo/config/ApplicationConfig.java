package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.demo.entity.Student;

@Configuration
public class ApplicationConfig {
   @Bean
   @Profile(value="dev")
   public Student ram() {
	   return new Student(101,"ram",90);
   }
   
   @Profile(value="dev")
   @Bean
   public Student sham() {
	   return new Student(102,"sham",90);
   }
   
   @Profile(value="prod")
   @Bean
   public Student vicky() {
	   return new Student(103,"vicky",90);
   }
   
   @Bean
   public Student virat() {
	   return new Student(103,"virat",90);
   }
   
}
