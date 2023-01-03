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

<c:forEach items="${list}" varStatus="li" var="list">
	<!--
	${li.index}<br>
	${li.count} 
	-->
	${list.id}
	${list.name}
	${list.age}
	${list.email}
	<br>
</c:forEach>




</body>
</html>