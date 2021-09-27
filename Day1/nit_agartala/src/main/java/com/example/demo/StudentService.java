package com.example.demo;
import java.util.*;
public class StudentService {
    HashMap<String, Student> details;
    
    public StudentService() {
    	details= new HashMap<>();
    	
    	details.put("be",new Student(101,"abc",90)); 
    	details.put("mca",new Student(102,"dfbc",93)); 
    	details.put("btech",new Student(103,"habc",96)); 
    	details.put("msc",new Student(104,"dfybc",93)); 
    	details.put("bsc",new Student(105,"atbc",93)); 
    	details.put("bca",new Student(106,"5dfbc",91)); 
    
    }
    public Student findByBranch(String branch) {
    	return details.get(branch);
    }
}
