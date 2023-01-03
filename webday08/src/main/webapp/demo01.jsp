<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet">



</head>
<body>

<!-- EL表達式 用於計算、顯示
	1.算數運算 + - * / %
	2.比較運算 > < >= <= == !=
	3.邏輯運算 && || !(not)
	4.空運算 empty 用於判斷字串，集合，陣列是否為null
		JSTL表達式 判斷，迴圈等
		合在一起用 效用較大
		-->
<%
	//Servlet 前端頁面進入後端程式，危險性較高，程式碼結構也會很亂，不建議使用
	%>
<!-- EL語法如下 最上面需做isELIgnored="false"設定，如改成true就不能使用-->
${3+4} <br>
${3-4} <br>
${3%4} <br>
${3/4} <br>
${3%4} <br>


<h2>比較運算</h2>
${3>4} <br>
${3<4} <br>
${3>=4} <br>
${3<=4} <br>
${3==4} <br>
${3!=4} <br>


<h2>邏輯運算</h2>
${true && true} <br>
${true && false} <br>
${false && true} <br>
${false && false} <br>

${true || true} <br>
${true || false} <br>
${false || true} <br>
${false || false} <br>

${!false} <br>


<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" ></script>

</body>
</html>