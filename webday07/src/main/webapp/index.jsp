<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="500.jsp"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<!-- 使用 include file="header.jsp 會與include的頁面整合成一個頁面" -->
<body>
<%@ include file="header.jsp" %>


<c:import url="demo01.jsp"></c:import>
<!-- 使用jsp:include 會建立單獨 -->
<jsp:include page="footer.jsp" ></jsp:include>


</body>
</html>