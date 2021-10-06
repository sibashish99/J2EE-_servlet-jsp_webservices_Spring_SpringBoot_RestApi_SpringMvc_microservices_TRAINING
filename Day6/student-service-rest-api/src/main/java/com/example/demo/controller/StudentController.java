package com.example.demo.controller;

import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping(path = "/api/v1/students")
public class StudentController {
   private StudentService service;
   
   @Autowired
   public void setService(StudentService service) {
	   this.service= service;
   }
   
   @GetMapping
   @RolesAllowed(value = {"ROLE_ADMIN"})
   public List<Student> findAll(){
	   return this.service.findAll();
   }
   
   @RolesAllowed(value = {"ROLE_ADMIN","ROLE_GUEST"})
   @GetMapping(path = "/{rollNo}")
   public Student findById(@PathVariable("rollNo") int rollNo){
	   return this.service.findById(rollNo);
   }
   
   @GetMapping(path = "/srchName/{name}")
   public List<Student> findByStudentName(@PathVariable("name") String studentName){
	   return this.service.findByName(studentName);
   }
   
   @PutMapping(path = "/{rollNo}/{markToUpdate}")
   public ResponseEntity<String> updateMark(@PathVariable("rollNo") int rollNo, @PathVariable("markToUpdate") double markToUpdate){
	   int count = this.service.updateMark(rollNo, markToUpdate);
	   return ResponseEntity.ok().body(count + " updated");
   }
   
   @DeleteMapping(path="{rollNo}")
   public ResponseEntity<String> removeStudent(@PathVariable("rollNo") int rollNo){
	   int count = this.service.remove(rollNo);
	   
	   if(count ==1) {
		  return ResponseEntity.ok().body(count +" deleted");
			   
	   } else {
		  return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Record not found.");
	   }
	   
			   
   }
   @PostMapping
   public ResponseEntity<Student> add(@RequestBody Student entity) {
	   Student addEntity= this.service.addStudent(entity);
	   return ResponseEntity.status(HttpStatus.CREATED).body(addEntity); 
   }
   
   
}
