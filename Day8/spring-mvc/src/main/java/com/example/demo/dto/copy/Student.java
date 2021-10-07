package com.example.demo.dto.copy;

import java.time.LocalDate;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;


@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
@Component
public class Student {
 @Range(min=100, max=500, message="Should be between 100-500.")
  int rollNo;
  @Length(min =3, max=20 , message="Name length should be between 3 to 20.")
  String studentName; 
  @DateTimeFormat(iso = ISO.DATE)
  LocalDate dateOfBirth;
  double markScored;
}
