package com.damon.from_processing.action;

import com.damon.from_processing.model.Student;
import com.opensymphony.xwork2.ActionSupport;

public class Register extends ActionSupport{
	private Student studentInfo;
	
	public String execute() {
		return "success";
	}
	
	public Student getStudentInfo() {
		return studentInfo;
	}
/*	When the form is submitted, the Struts 2 framework will
 *  inspect the Action class and look for an object named
 *  studentInfo. It will create that object using the Student 
 *  class¡¯s default constructor. 
*/	
	public void setStudentInfo(Student p) {
		studentInfo = p;
	}
}
