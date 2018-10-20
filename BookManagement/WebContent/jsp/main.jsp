<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Main</title>
</head>
<body>
<s:debug></s:debug>
<button id="toAdd" onclick="add()">添加图书</button>
<table border="solid 1px black" cellpadding="0" cellspacing="0">
	<thead>
		<tr align="center">
			<th>图书名称</th>
			<th>图片</th>
			<th>作者</th>
			<th>出版社</th>
			<th>出版日期</th>
			<th>价格</th>
			<th>库存</th>
			<th>描述</th>
			<th colspan="3">操作</th>
		</tr>
	</thead>
	<tbody>
		<s:iterator value="#AllBook">
			<tr align="center">
				<td><s:property value="title"/></td>
				<td><img src="<s:property value="image"/>" width="30px"></td>
				<td><s:property value="author"/></td>
				<td><s:property value="publisher"/></td>
				<td><s:property value="time"/></td>
				<td><s:property value="price"/></td>
				<td><s:property value="balance"/></td>
				<td><s:property value="depict"/></td>
				<td><a href="#">详情</a></td>
				<td><a href="/BookManagement/book/editBook.action?id=<s:property value='id'/>">编辑</a></td>
				<td><a href="/BookManagement/book/deleteBook.action?id=<s:property value='id'/>">删除</a></td>
			</tr>
		</s:iterator>
	</tbody>
</table>
</body>
<script type="text/javascript">
function add(){
	window.location.href="../jsp/addbook.jsp";
}
</script>
</html>