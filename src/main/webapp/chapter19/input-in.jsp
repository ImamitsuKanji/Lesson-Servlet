<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include	file="/tool/header.html"%>

<h1>お知らせを設定</h1>

<form action="set-notice" method="post">

${message}
<br>
<input type="text" name="notice">
<input type="submit" value="設定">
<br>
<a href="http://localhost:8080/Servlet2/chapter19/output.jsp">お知らせを確認</a>

</form>

<%@include	file="/tool/footer.html"%>