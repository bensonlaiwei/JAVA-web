<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2>�w����{</h2>
	<%
		Object number = request.getAttribute("name");
	
	%>
	
	<h1>
	�w��<%=number %>�n�J
	</h1>
</body>
</html>