<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<!-- navbar start -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="index.jsp">Navbar</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav mx-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.jsp">首頁</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="addproduct.jsp">新增產品</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="productServlet?status=search">搜尋產品</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="addnumber.jsp">新增會員</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="numberServlet?status=search">搜尋會員</a>
        </li>
        
        
        <li class="nav-item">
          <a class="nav-link" href="login.jsp" >登入</a>
        </li>
      </ul>
      <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>
<!-- navbar end -->

<!-- popwindows start -->
	
	<div class="modal fade" id="loginModal">
		<div class="modal-dialog">
			<div class="modal-content">
			<!-- header -->
				<div class="modal-header">
					<h3>會員登入</h3>
					<button class="btn-close" type="button" data-bs-dismiss="modal"></button>
				</div>
				
			<!-- body -->
				<div class="modal-body">
					<form action="numberServlet" method="POST">
						<div class="form-group">
							<input type="email" class="account form-control" placeholder="Email" name="nEmail">
						</div>
						<div class="form-group">
							<input type="password" class="password form-control" placeholder="password" name="nPass">
						</div>
						<div class="form-group">
							<input type="checkbox" class="remember">記住我的密碼
						</div>
						<button type="button" class="btn btn-info">登入</button>
						<input type="hidden" name="status" value="login">
					
					</form>
				</div>
				
				<!-- footer -->
					<div class="modal-footer">
						<div class="signup">
							<span>尚未成為會員</span>
							<a herf="#" type="button" class="member">立即加入</a>
						
						</div>
					</div>
			
			
			</div>
		
		</div>
	
	
	
	
	
	
	</div>




<!-- popwindows end -->









<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" ></script>

</body>
</html>