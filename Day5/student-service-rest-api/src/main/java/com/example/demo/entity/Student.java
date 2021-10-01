package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="student")
public class Student {
  @Id
  @Column(name="rollno")
  int rollNo;
  @Column(name="studentname")
  String studentName;
  @Column(name="dateofbirth") 
  LocalDate dateOfBirth;
  @Column(name="markscored")
  double markScored;
}
