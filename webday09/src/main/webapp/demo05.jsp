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

<%
	request.setAttribute("numbers", 6);

%>

<c:choose>
	<c:when test="${requestScope.numbers == 1}">星期1</c:when>
	<c:when test="${requestScope.numbers == 2}">星期2</c:when>
	<c:when test="${requestScope.numbers == 3}">星期3</c:when>
	<c:when test="${requestScope.numbers == 4}">星期4</c:when>
	<c:when test="${requestScope.numbers == 5}">星期5</c:when>
	<c:otherwise>error</c:otherwise>
</c:choose>




</body>
</html>