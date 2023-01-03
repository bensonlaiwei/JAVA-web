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
<%
	String code = request.getParameter("code");//用戶輸入的
	String rand = session.getAttribute("rand").toString();//自動產生的
	
	if (rand.equalsIgnoreCase(code)){
%>
	<jsp:forward page="login.jsp"></jsp:forward>

<%
	}
%>








<%
	String name= request.getParameter("username");
	String pass= request.getParameter("userpass");

	
	if("Tom".equalsIgnoreCase(name)  && "123".equalsIgnoreCase(pass))
	{
		out.println("成功");
		response.setHeader("refresh", "3;url=welcome.jsp");
		session.setAttribute("id", name);
	

%>
	<h1>用戶燈登入成功歡迎您，3秒後轉跳歡迎畫面</h1>
<%
}else{
	response.setHeader("refresh", "3;url=login.jsp?error=Erigrr");
	
	%>
<h1>用戶燈登入失敗，帳號或密碼失敗</h1>
<%

}

%>








<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" ></script>

</body>
</html>