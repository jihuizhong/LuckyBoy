<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Book</title>
<style type="text/css">
	.ready{
		font-size:"12px";
		color:red;
		display:none
	}
</style>
<script type="text/javascript" src="/BookManagement/js/public/jQuery-2.2.2.js"></script>
</head>
<body>
<form action="/BookManagement/book/addBook.action" method="post" enctype="multipart/form-data">

	<table cellpadding="0" cellspacing="0" border="solid 1px black">
		<tr>
			<td>书名:</td>
			<td><input type="text" name="bean.title" onblur="checkBook()" id="bookName"><span class="ready" id="title">图书已经存在</span></td>
		</tr>
		<tr>
			<td>图片:</td>
			<td><input type="file" name="fu.fileImage"></td>
		</tr>
		<tr>
			<td>作者:</td>
			<td><input type="text" name="bean.author"></td>
		</tr>
		<tr>
			<td>出版社:</td>
			<td><input type="text" name="bean.publisher"></td>
		</tr>
		<tr>
			<td>出版时间:</td>
			<td><input type="text" name="bean.time"></td>
		</tr>
		<tr>
			<td>价格:</td>
			<td><input type="text" name="bean.price"></td>
		</tr>
		<tr>
			<td>库存:</td>
			<td><input type="text" name="bean.balance"></td>
		</tr>
		<tr>
			<td>描述:</td>
			<td><input type="text" name="bean.depict"></td>
		</tr>
		<tr align="center">
			<td colspan="2">
				<input type="submit" value="提交" id="submit_button">
			</td>
		</tr>
	</table>
</form>
</body>
<script type="text/javascript" src="/BookManagement/js/private/checkBook.js"></script>
</html>