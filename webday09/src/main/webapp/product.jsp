<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet">
<h3>產品</h3>
	<div class="container text-center">
	  <div class="row g-2">
	  <c:forEach var="list" items="${product}">
	    <div class="col-3">
		    <div class="card" style="width: 18rem;">
			  <img src="${list.image}" class="card-img-top" alt="...">
			  <div class="card-body">
			    <h5 class="card-title">${list.name}</h5>
			    <p class="card-text">${list.doc}</p>
			    <a href="#" class="btn btn-primary">${list.pay}</a>
			  </div>
			</div>
	    </div>
	  </c:forEach>
	     
	     
	     
	  
	    </div>
	 </div>

</head>
<body>

<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" ></script>

</body>
</html>