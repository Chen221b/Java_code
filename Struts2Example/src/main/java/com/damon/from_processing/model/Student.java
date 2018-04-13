package com.damon.from_processing.model;

public class Student{
	private String name;
	private int age;
	private String sex;
	
	public Student(){
		name = "student_name";
		age = 0;
		sex = "student_sex";
	}
	
	public String toString(){
		return name + age + sex;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
}