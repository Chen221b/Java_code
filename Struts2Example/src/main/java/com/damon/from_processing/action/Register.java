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
/**
 *  When the form is submitted, the Struts 2 framework will
 *  inspect the Action class and look for an object named
 *  studentInfo. It will create that object using the Student 
 *  class¡¯s default constructor. 
 */	
	public void setStudentInfo(Student p) {
		studentInfo = p;
	}
	
	
/**	
 * When the user presses the submit button on the register 
 * form, Struts 2 will transfer the user¡¯s input to the 
 * studentInfo¡¯s instance fields. Then Struts 2 will automatically 
 * execute the validate method. If any of the if statements 
 * are true, Struts 2 will call its addFieldError method 
 * (which our Action class inherited by extending ActionSupport).
 * If any errors have been added then Struts 2 will not proceed 
 * to call the execute method. Rather the Struts 2 framework 
 * will return input as the result of calling the action.
 */
	public void validate() {
		if(studentInfo.getName().length() == 0) {
			addFieldError("studentInfo.name", "name is required");
		}
	}
}
