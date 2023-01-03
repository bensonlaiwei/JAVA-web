<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
可以寫java城市
<%
	String a = "我是JSP";
	//顯示，也可以跟上面那行分開寫
	out.println(a);
%>
<%
	String ss = "我是Servelt";
%>
顯示
<h1><%=ss %></h1>

<%=10*10 %>

</body>
</html>