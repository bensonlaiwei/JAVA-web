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
	String name = "Benson";
	String pass = "123";
	if(name.equals("Benson") && pass.equals("123")){
		out.print("true");
	}
	else
	{
		out.print("false");
	}
	%>

</body>
</html>