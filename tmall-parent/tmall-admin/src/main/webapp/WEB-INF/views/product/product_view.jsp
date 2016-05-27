<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/tmall-admin/product/update" id="form">
		<input type="hidden" value="${product.productId }" name="productId">
		<table border="1">
			
			<tr>
				<td>产品编号</td>
				<td><input type="text" value="${product.productNumbre }" name="productNumbre"></td>
			</tr>
			<tr>
				<td>产品名称</td>
				<td><input type="text" value="${product.productName }" name="productName"></td>
			</tr>
			<tr>
				<td>商品URL</td>
				<td><input type="text" value="${product.imageUrl }" name="imageUrl"></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="修改"/> 
				</td>
			</tr>
		</table>
	</form>
</body>
</html>