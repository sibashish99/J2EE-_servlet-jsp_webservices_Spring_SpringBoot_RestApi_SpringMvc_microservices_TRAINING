package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.training.entity.OrderBook;

import com.example.demo.entity.Bill;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Invoice;
import com.example.demo.entity.Product;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication(scanBasePackages = {"com.example.demo","org.training.entity"})
@Slf4j
public class SpringIoCApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(SpringIoCApplication.class, args);
	    
		Customer customer= ctx.getBean("sham",Customer.class);
		log.info(customer.toString());
		
		Product obj= ctx.getBean("sony",Product.class);
		log.info(obj.toString());
		
		Invoice inv= ctx.getBean("invoice",Invoice.class);
		log.info(inv.toString());
		
		Bill bill= ctx.getBean(Bill.class);
		log.info(bill.toString());
		
		OrderBook ob= ctx.getBean(OrderBook.class);
		log.info(ob.toString());
		
		List<Invoice> list= ob.getInvList();
		list.forEach(System.out::println);
		
		ctx.close();
	}

}
