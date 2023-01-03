<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet">



</head>
<body>
<h3>歡迎光臨，恭喜您</h3>

<%
	if(session.getAttribute("id")!=null){
			
%>
	<h1>歡迎你的登入</h1>
	<a href="logout.jsp">登出</a>
	
<%
	}else{
		response.setHeader("refresh", "3;url=logout.jsp");
		
%>
	<h3>非會員無法登入</h3>
<% 

	}
%>

<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" ></script>

</body>
</html>