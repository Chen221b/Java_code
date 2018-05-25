package com.damon.example.action;

import com.damon.example.model.Person;


public class ShowPersonalInformation extends ActionSupport{
	private Person person;
	private String userName;
	
	public String execute() {
		person = new Person();
		person.setName(userName);
		person.setAge(23);
		return "success";
	}
	
	public Person getPerson() {
		return person;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
}