package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepository;

@Service
public class StudentService {
 
  //field injection
  @Autowired
  private StudentRepository repo;
   
  public List<Student> findAll(){
	  return this.repo.findAll();
  }
  
  public Student addStudent(Student entity) {
	  return this.repo.save(entity);
  }
  
  public Student findById(Integer key) {
	  return this.repo.findById(key)
			          .orElseThrow(() ->new RuntimeException("Id not found"));
  } 
  
  public List<Student> findByName(String name){
	  return this.repo.findByStudentName(name);
  }
  
  public int updateMark(int rollNo, double markToUpdated) {
	  return this.repo.updateMark(rollNo, markToUpdated);
  }
  
  public int remove(int rollNo) {
	  int rowdeleted=0;
	  if(this.repo.existsById(rollNo)) {
		  this.repo.deleteById(rollNo);
		  rowdeleted=1;
	  }
	  return rowdeleted;  
  } 
  
  
}
