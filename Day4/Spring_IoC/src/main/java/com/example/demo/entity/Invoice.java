package com.example.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString

@Component("invoice")
public class Invoice {
   private Product product;
   private Customer customer;
   
   
   public Product getProduct() {
	return product;
   }
 //setter dependency  injection
//   @Autowired
   public void setProduct(Product product) {
	this.product = product;
   }
   public Customer getCustomer() {
	return customer;
   }
//   @Autowired
   public void setCustomer(Customer customer) {
	this.customer = customer;
   }
//constructor dependency injection
@Autowired
public Invoice(@Qualifier("sony") Product product,@Qualifier("sham") Customer customer) {
	super();
	this.product = product;
	this.customer = customer;
}
   
   
}
