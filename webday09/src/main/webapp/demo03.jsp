<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<!-- 03只接改成04的內容 -->
<!--  只有if 沒有else  -->
<%
	request.setAttribute("number", 9);

%>


	<c:if test="${number %2 !=0 }">
		${number}為
	</c:if>


</body>
</html>