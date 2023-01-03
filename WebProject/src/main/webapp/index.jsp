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
<%@ include file="header.jsp" %>

<div class="container">
 	<div class="row justify-content-center align-items-center g-2">
 		<!-- foreach start -->
 		<c:forEach items="${productValue}" var="product">
 		<div class="col-12 col-md-3">
 			<div class="card" style="width: 18rem;">
				  <img src="${product.pImage}" class="card-img-top" alt="...">
				  <div class="card-body">
				    <h5 class="card-title">${product.pName}</h5>
				    <p class="card-text">${product.pDoc}</p>
				    <p class="btn btn-primary" href="#" >NT:${product.pPay}</p>
				  </div>
				</div>
 		</div>
 		</c:forEach>
 	</div>
</div>



<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" ></script>

</body>
</html>