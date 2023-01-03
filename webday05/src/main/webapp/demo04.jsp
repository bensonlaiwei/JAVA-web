<%@page import="tw.com.web.code.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	Employee emp = new Employee();
	emp.setId(1);
	emp.setName("TOM");
	emp.setAge("20");

%>

<%=emp.getId() %>
<%=emp.getName() %>
<%=emp.getAge() %>

</body>
</html>