<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Login</title>
</head>
<body>
<form action="/BookManagement/book/login.action" method="post">

	<table cellpadding="0" cellspacing="0" border="solid 1px black">
		<tr>
			<td>用户名:</td>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td>密码:</td>
			<td><input type="password" name="pwd"></td>
		</tr>
		<tr align="center">
			<td colspan="2">
				<input type="submit" value="提交">
			</td>
		</tr>
	</table>
</form>
</body>
</html>