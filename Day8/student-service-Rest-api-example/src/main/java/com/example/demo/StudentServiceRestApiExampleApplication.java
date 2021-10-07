package com.example.demo;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.context.ConfigurableApplicationContext;

import reactor.core.publisher.*;

@SpringBootApplication
public class StudentServiceRestApiExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(StudentServiceRestApiExampleApplication.class, args);
		Flux<String> namePublisher= Flux.just("yuvan","iranna","amit");
		//namePublisher.subscribe(System.out::println);
		
		namePublisher.subscribe(new Subscriber<String>() {
            @Override
			public void onNext(String t) {
				// TODO Auto-generated method stub
				System.out.println(t.toString());
			}
            @Override
            public void onSubscribe(Subscription s) {
            	// TODO Auto-generated method stub
                s.request(4);
            	System.out.println("Subscriber called.."+s);
            }
            @Override
            public void onError(Throwable t) {
            	// TODO Auto-generated method stub
            	System.out.println("Error statement.."+t.getMessage());
            }
            @Override
            public void onComplete() {
            	// TODO Auto-generated method stub
            	System.out.println("completed.....");
            }
		});
		ctx.close();
	}

}
