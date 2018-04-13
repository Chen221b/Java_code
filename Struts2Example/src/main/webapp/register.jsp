<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<body>
		<s:form action="register">
			<s:textfield name="studentInfo.name" label="Name"/>
			<s:textfield name="studentInfo.age" label="Age"/>
			<s:textfield name="studentInfo.sex" label="Sex"/>
			<s:submit value="submit"/>
		</s:form>
	</body>
</html>