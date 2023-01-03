<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<!--nName、nEmail、nPass、nSex -->



<%@ include file="header.jsp" %>

<div class="container">
 
	<table class="table table-hover">
		 <thead>
	    <tr>
	      <th scope="col">#</th>
	      <th scope="col">帳號</th>
	      <th scope="col">郵件</th>
	      <th scope="col">性別</th>
	       <th scope="col">更新</th>
	    </tr>
	  </thead>
	  <tbody>
	  <c:forEach items="${number}" var="number">
	    <tr>
	      <th scope="row">${number.nId}</th>
	      <td>${number.nName}</td>
	      <td>${number.nEmail}</td>
	     <td>${number.nSex}</td>
	     <td>更新</td>
	    </tr>
	   </c:forEach>
	  </tbody>
	</table>
 
 
 
 
 
</div>







<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" ></script>

</body>
</html>