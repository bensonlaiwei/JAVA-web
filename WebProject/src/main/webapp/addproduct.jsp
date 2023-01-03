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
        	<h1 class="text-center">新增產品</h1>
        	<form action="productServlet" method="POST">
        		<div class="mb-3">
					  <label for="exampleFormControlInput1" class="form-label">產品名稱 :  </label>
					  <input type="text" name="pName" class="form-control" id="exampleFormControlInput1" placeholder="請輸入產品名稱">
				</div>
				<div class="mb-3">
				  <label for="exampleFormControlInput1" class="form-label">產品說明 : </label>
				  <input type="text" name="pDoc" class="form-control" id="exampleFormControlInput1" placeholder="請輸入產品說明">
				</div>
				<div class="mb-3">
				  <label for="exampleFormControlInput1" class="form-label">產品圖片 :</label>
				  <input type="text" name="pImage" class="form-control" id="exampleFormControlInput1" placeholder="請輸入產品圖片">
				</div>
				<div class="mb-3">
				  <label for="exampleFormControlInput1" class="form-label">產品價錢 :</label>
				  <input type="text" name="pPay" class="form-control" id="exampleFormControlInput1" placeholder="請輸入產品價錢">
				</div>
				<div class="mb-3">
				 	<button type="submit" class="btn btn-primary mb-3">新增產品</button>
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