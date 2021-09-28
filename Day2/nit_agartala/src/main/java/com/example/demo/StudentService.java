package com.example.demo;
import java.util.*;
public class StudentService {
    //HashMap<String, Student> details;
	HashMap<String,List< Student>> details;
    public StudentService() {
    	details= new HashMap<>();
    	
    	List<Student> list1= Arrays.asList(new Student(101,"abc",90),new Student(102,"dfbc",93));
    	List<Student> list2= Arrays.asList(new Student(103,"agybc",80),new Student(104,"dpfbc",63));
    	
    	
//    	details.put("be",new Student(101,"abc",90)); 
//    	details.put("mca",new Student(102,"dfbc",93)); 
//    	details.put("btech",new Student(103,"habc",96)); 
//    	details.put("msc",new Student(104,"dfybc",93)); 
//    	details.put("bsc",new Student(105,"atbc",93)); 
//    	details.put("bca",new Student(106,"5dfbc",91)); 
    			
    	details.put("be", list1);
    	details.put("mca", list2);
    
    }
    public List<Student> findByBranch(String branch) {
    	return details.get(branch);
    }
}
