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
<%@ include file="header.jsp" %>


 <div class="container">
      <div class="row justify-content-center align-items-center g-2">
        <div class="col-12 col-md-4"> </div>
        <div class="col-12 col-md-4">
        	<h1 class="text-center">新增會員</h1>
        	<form action="numberServlet" method="POST">
        		<div class="mb-3">
					  <label for="exampleFormControlInput1" class="form-label">帳號 : </label>
					  <input type="text" name="nName" class="form-control" id="exampleFormControlInput1" placeholder="請輸入帳號">
				</div>
				<div class="mb-3">
				  <label for="exampleFormControlInput1" class="form-label">郵件 : </label>
				  <input type="email" name="nEmail" class="form-control" id="exampleFormControlInput1" placeholder="請輸入郵件">
				</div>
				<div class="mb-3">
				  <label for="exampleFormControlInput1" class="form-label">密碼 :</label>
				  <input type="password" name="nPass" class="form-control" id="exampleFormControlInput1" placeholder="請輸入密碼">
				</div>
				<div class="mb-3">
				  <label for="exampleFormControlInput1" class="form-label">性別 :</label>
				  <input type="text" name="nSex" class="form-control" id="exampleFormControlInput1" placeholder="請輸入性別">
				</div>
				<div class="mb-3">
				 	<button type="submit" class="btn btn-primary mb-3">新增會員</button>
				 	<input type="hidden" name="status" value="add">
				</div>
        	</form>
        </div>
        <div class="col-12 col-md-4"></div>
      </div>
    </div>



<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" ></script>

</body>
</html>