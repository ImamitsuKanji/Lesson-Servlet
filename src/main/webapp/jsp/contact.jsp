<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>



<body>

	<form action="/servlet/ContactServlet" method="get">

		<p>名前</p>
		<input type="text" name="name">
		<p>会社</p>
		<input type="text" name="name">
		<p>メールアドレス</p>
		<input type="text" name="name">
		<p>お問い合わせ</p>
		<textarea type="textarea" name="name"></textarea>
		<p>メルマガ種類</p>
		<p>
			<input type="checkbox" name="typs" value="総合案内">総合案内
		</p>
		<p>
			<input type="checkbox" name="typs" value="セミナー案内">セミナー案内
		</p>
		<p>
			<input type="checkbox" name="typs" value="求人情報">求人情報
		</p>
		<p>資料請求希望</p>
		<input type="radio" name="contact" value="必要" checked="checked"> 
		Yes 
		<input type="radio" name="coontact" value="不要">
		 No<br> 
		 <input type="submit" value="送信">
		 
	</form>

</body>
</html>