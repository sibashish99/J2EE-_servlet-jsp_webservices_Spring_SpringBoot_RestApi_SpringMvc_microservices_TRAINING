package com.example.demo.dto.copy;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import lombok.Data;


@Data

@Component
public class Student {
  int rollNo;
  String studentName; 
  LocalDate dateOfBirth;
  double markScored;
}
