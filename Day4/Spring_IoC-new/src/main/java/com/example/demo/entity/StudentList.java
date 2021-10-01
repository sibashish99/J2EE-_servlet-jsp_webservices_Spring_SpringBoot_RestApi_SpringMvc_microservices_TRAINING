package com.example.demo.entity;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Lazy;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import lombok.Data;

@Component   //class name with first char with lowercase => studentList
@Data
//@Lazy

//@Scope("prototype")
public class StudentList {
	
	
	@Autowired
	private List<Student> stuList;
}
