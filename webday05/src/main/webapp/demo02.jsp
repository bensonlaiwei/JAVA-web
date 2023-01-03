<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table action="sv" method="POST">
		<tr>
			<th>名稱</th>
			<th>價錢</th>
			<th>備註</th>
		</tr>
		<tr>
			<td><%=request.getAttribute("un") %></td>
			<td><%=request.getAttribute("up") %></td>
			<td><%=request.getAttribute("unote") %></td>
		</tr>
	</table>

</body>
</html>