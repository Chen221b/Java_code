<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<body>
		<h2>textfield tag</h2>
		<s:form action="register">
			<s:textfield name="studentInfo.name" label="Name"/>
			<s:textfield name="studentInfo.age" label="Age"/>
			<s:textfield name="studentInfo.sex" label="Sex"/>
			<s:submit value="submit"/>
		</s:form>
		
		<h2>textfield tag with key attribute</h2>
		<s:form action="register">
			<s:textfield key="studentInfo.name"/>
			<s:textfield key="studentInfo.age"/>
			<s:textfield key="studentInfo.sex"/>
			<s:submit value="submit"/>
		</s:form>
	</body>
</html>