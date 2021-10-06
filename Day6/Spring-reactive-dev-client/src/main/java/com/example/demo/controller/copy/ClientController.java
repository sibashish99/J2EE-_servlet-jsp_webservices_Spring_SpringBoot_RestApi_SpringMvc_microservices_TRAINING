package com.example.demo.controller.copy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.dto.copy.Student;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/client/students")

public class ClientController {
   private WebClient client;
   private static String uri="http://localhost:8080/api/v1/students";
   @Autowired
   public void setClient(WebClient client) {
	   this.client= client;
   }
   @GetMapping
   public Flux<String> getAllStudents(){
	   //return client.get().uri(uri).retrieve().bodyToFlux(String.class);
	   return client.get().uri(uri).headers(header -> header.setBasicAuth("india" , "india"))
			   .retrieve().bodyToFlux(String.class);
			   
   }
   @GetMapping
   public Mono<String> getStudents(){
	   return client.get().uri("http://localhost:8080/api/v1/students/{rollNo}").retrieve().bodyToMono(String.class);		   
   }
   @PostMapping
   public Mono<Student> addStudents(@RequestBody Student entity){   
	   return client.post().uri(uri)
			   .body(Mono.just(entity),Student.class)
			   .retrieve()
			   .bodyToMono(Student.class);
   }
   @DeleteMapping(path = "/{id}") 
   public Mono<String> removeStudent(@PathVariable("rollNo") int rollNo){
	   return client.delete() 
			   .uri(" http://localhost:8080/api/v1/students/{rollNo}" ,rollNo)
			   .retrieve() 
			   .bodyToMono(String.class);
	}
}
  

