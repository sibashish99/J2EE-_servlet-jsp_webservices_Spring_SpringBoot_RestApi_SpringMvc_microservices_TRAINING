package com.example.demo;

//import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Student;
import com.example.demo.entity.StudentList;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
//@Slf4j
public class SpringIoCNewApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(SpringIoCNewApplication.class, args);
	    
		StudentList list= ctx.getBean(StudentList.class);
//		List<Student> stuList= list.getStuList();
//		log.info(stuList.toString());
		list.getStuList().forEach(System.out::println);
		
//		System.out.println("singleton =>"+ctx.isSingleton("studentList"));
//		System.out.println("prototype =>"+ctx.isSingleton("studentList"));
		
		
		
		
		
		ctx.close();
	}

}




































































