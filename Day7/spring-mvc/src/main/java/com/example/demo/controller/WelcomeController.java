package com.example.demo.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dto.copy.Student;


@Controller
public class WelcomeController {
	
	@Autowired
    private Student object;
   
	@Autowired
	private ModelAndView mdlView;
	
	@Autowired
	private RestTemplate template;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
    public String init(Model model) {
     model.addAttribute("majHeading", "NITA");
     return "index";
    }
  
   @GetMapping(path="/addStudent")
   public String sendForm(Model model) {
	  model.addAttribute("command",object);
      return "addStudent";
    }
//   
////   @PostMapping(path="/addStudent")
////   public String submitForm(Student student,Model model) {
////	 System.out.println(student);
////	 
////	 model.addAttribute("added",student);
////	 return "success";
////   }
//   
//   @PostMapping(path="/addStudent")
//   public ModelAndView submitForm(Student student) {
//	
//	 mdlView.addObject("added",student);
//	 mdlView.setViewName("success");
//	 return mdlView;
//   }
//   
   
  @PostMapping(path="/addStudent")
   public String submitForm(@Valid @ModelAttribute("command") Student student,BindingResult result) {
	 String nextStep="success";
	 //this.template.postForObject("http://localhost:8080/api/v1/students", student, Student.class);
	 if(result.hasErrors()) {
		 nextStep="addStudent";
	 }
	return nextStep;
   }
   
   

}
