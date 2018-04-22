<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<body>
		<h1>Basic Strtus</h2>
		<h2><a href="<s:url action='information'/>">showinformation</a></h2>
		<s:form action="information">
			<s:textfield name="userName" label="Label"/>
			<s:submit value="submit"/>
		</s:form>
		<h1>From Processing</h2>
		<h2><a href="register.jsp">Register</a></h2>
		<h1>From Processing with message resources</h2>
		<h2><a href="registerInput.action">Register</a></h2>
		<h1>Debugging Struts</h1>
		<h3>The Struts 2 config browser plugin provides details about the configuration the Struts 2 framework is using to run your application. </h3>
		<h2><a href='<s:url action="index" namespace="config-browser"/>'>Launch the configuration browser</a></h2>
	</body>
</html>
