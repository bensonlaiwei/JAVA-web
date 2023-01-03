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

<!-- 
EL!表達式只能從bean 域對象取得值，以指定值
${域對象.域名}
1.pageScope
2.requestScope
3.sessionScope
4.applicationScope

 -->

<%
	request.setAttribute("request", "request");
	request.setAttribute("session", "session");
	
%>

${requestScope.request }
${sessionScope.request }

<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" ></script>

</body>
</html>