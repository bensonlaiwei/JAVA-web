<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
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



<%//for %>



<table style="border: 1px solid;">
	<tr>
		<th>編號</th>
		<th>姓名</th>
		<th>郵件</th>
		<th>年紀</th>
	</tr>
	<tr>
		<td>${requestScope.list[0]}</td>
		<td>${requestScope.list[1]}</td>
		<td>${requestScope.list[2]}</td>
		<td>${requestScope.list[3]}</td>
	</tr>

</table>



<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" ></script>

</body>
</html>