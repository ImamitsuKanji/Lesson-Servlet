<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/tool/header.html" %>

<form action="product" method="get">
<button><a href="product?sort=asc">商品価格が安い順</a></button>
<button><a href="product?sort=desc">商品価格が高い順</a></button>

</form>

<%@include file="/tool/footer.html" %>