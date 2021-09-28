package com.example.demo;

public class Student {
   private int id;
   private String name;
   private double markScored;
   
   public Student(int id, String name, double markScored) {
	super();
	this.id = id;
	this.name = name;
	this.markScored = markScored;
  }
   public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getMarkScored() {
	return markScored;
}
public void setMarkScored(double markScored) {
	this.markScored = markScored;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", markScored=" + markScored + "]";
}
   
   
}
