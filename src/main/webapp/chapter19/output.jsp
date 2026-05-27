<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>お知らせを設定</h1>
	<%
	List<String> notice = (List<String>) application.getAttribute("notice");

	if (notice != null) {
		for (String n : notice) {
	%>
	<p><%=n%></p>
	<%
	}
	} else {
	%>
	<p>現在お知らせはありません</p>
	<%
	}
	%>
	<br>
	<a href="http://localhost:8080/Servlet2/chapter19/input-in.jsp">お知らせを設定する</a>
</body>
</html>