package com.damon.example.model;

import java.util.ArrayList;

public class Person{
	private String name;
	private int age;
	private String sex;
	
	public Person(){
		name = "default";
		age = 0;
		sex = "default";
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
}
