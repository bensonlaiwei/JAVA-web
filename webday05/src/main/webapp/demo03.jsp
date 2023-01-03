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
		request.setAttribute("un", "Mac電腦");
		request.setAttribute("up", "Nt:54000");
		request.setAttribute("unote", "好用的產品");
	%>
	<%=request.getAttribute("un") %>
	<%=request.getAttribute("up") %>
	<%=request.getAttribute("unote") %>

</body>
</html>