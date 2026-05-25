<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%
    // セッションから値取得
    String name = (String)session.getAttribute("name");

    // null対策
    if(name == null){
        name = "";
    }
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>名前入力</title>
</head>
<body>

	<form action="name-input-servlet" method="post">
		名前：<input type="text" name="name" value="<%= name %>"> 
				<input type="submit" value="送信">
	</form>

</body>
</html>