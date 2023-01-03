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
<h3>Login </h3>

<%
String error = request.getParameter("error");
if(!(error==null || "".equals(error))){
	%>	
	<h3>登入失敗</h3>
<% 
}
%>	





<form action="check.jsp" method="POST">
	帳號:<input type="text" name="username"><br>
	密碼:<input type="password" name="userpass"><br>
	驗證碼:<input type="text" maxlength="4" size="4" name="code"><img alt="" src="images.jsp"><br>
	<input type="submit" value="login">
	<input type="submit" value="reset">
</form>






<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" ></script>

</body>
</html>