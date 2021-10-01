package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entity.Bill;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Invoice;
import com.example.demo.entity.Product;

@Configuration
public class ApplicationConfig {
	
     @Bean
     public Customer ram() {
    	 return new Customer(101, "ramesh",8864795122L);
     }
     
     @Bean(name="sham")
     public Customer sham() {
    	 return new Customer(103, "sham",6764795122L);
     }
     
     @Bean(name="vicky")
     public Customer vicky() {
    	 return new Customer(105, "vicky",6764795122L);
     }
     /*
      Springioc container will call this method and register a bean with the id 
      "sony" attribute , override the default name which is method name with custom name
     */
     
     
     @Bean(name="sony")
     public Product tv() {
    	 return new Product(201,"Sony tv",52554);
     }
     @Bean(name="samsung")
     public Product freeze() {
    	 return new Product(202,"samsung",22554);
     }
     
     
     //refer bean
     @Bean 
     public Bill inv() {
    	 return new Bill(tv(),ram());
     }
     
     @Bean(name="ramsInvoice")
     public Invoice ramsinv() {
    	 return new Invoice(tv(),ram()); 
     }
     @Bean(name="vickysInvoice")
     public Invoice vickyinv() {
    	 return new Invoice(freeze(),vicky()); 
     }
     
     
     
}
