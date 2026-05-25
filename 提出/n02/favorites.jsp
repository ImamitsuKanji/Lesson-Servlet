<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お気に入り登録</title>

<style>
ul {
	list-style: none;
	padding-left: 0;
}

li::before {
	content: "・";
	margin-right: 5px;
}
</style>

</head>
<body>
	<form action="favorite-servlet" method="get" class="entry">
		<h1>お気に入り登録</h1>
		名前: <input type="text" name="name"> URL: <input type="text"
			name="URL"> <input type="submit" value="追加">
	</form>

	<form action="clear-servlet" method="post" class="favorite">
		<h2>登録一覧</h2>
		<ul id="list"></ul>
		<input type="submit" value="クリア">
	</form>

</body>
<script>
	function addItem() {
		const input = 

		 const li = document.createElement("li");
		  li.textContent = value;

		  document.getElementById("list").appendChild(li);

		  input.value = ""; // 入力欄クリア
	}
	li.textContent = value;
</script>


</html>