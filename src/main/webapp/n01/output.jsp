<%@page import="n01.NameInputServlet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>名前表示</title>
</head>
<body>
		<h1>
			こんにちは${sessionScope.name}さん！
		</h1>
		<input type="button" value="戻る" onclick="history.back()">


</body>
</html>