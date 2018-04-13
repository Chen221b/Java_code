<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<body>
		<h2>Hello World!</h2>
		<h2><a href="<s:url action='information'/>">showinformation</a></h2>
		<s:form action="information">
			<s:textfield name="userName" label="Label"/>
			<s:submit value="submit"/>
		</s:form>
		<h2><a href="register.jsp">Register</a></h2>
	</body>
</html>
