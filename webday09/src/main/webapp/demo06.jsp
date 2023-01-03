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

<!-- 
begin = "" 開始
end = ""結束
var = "i"
step="1" 每次加1
varStatus="s" 迴圈對象

 -->
 
 
<c:forEach begin = "1" end="10" var="i" step="1" varStatus="s">
	${i} 

</c:forEach>




</body>
</html>