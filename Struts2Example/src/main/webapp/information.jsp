<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<body>
		<h2>information.jsp</h2>
		
		<!-- action类中必须要有bean类的单例且有getter方法 -->
		<h2><s:property value="person.name" /></h2>
		<h2><s:property value="person.age" /></h2>
		
		<!-- 没有指明方法时调用toString() -->
		<h2><s:property value="person"/></h2>
		
	</body>
</html>
