<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    String path = request.getContextPath() + "/";
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=basePath%>app/lib/jquery/jquery.min.js"></script>

<script type="text/javascript">
	$(function(){
		$.ajax({
			type:"get",
			url:"<%=basePath%>product/select",
			dataType: "json",
			success:function(data){
				var result = data['data']['rows']['result'];//获取查询的数据
				var total = data['data']['rows']['totalCount'];//获取查询的总数
				var html;
				//遍历查询的数据
				$.each(result,function(index,comment){
					html+='<tr>'
						+'<td>'+comment['productNumbre']+'</td>'
						+'<td>'+comment['productName']+'</td>'
						+'<td>'+comment['imageUrl']+'</td>'
						+'<td>'+comment['price']+'</td>'
						+'<td>'+comment['discountPrice']+'</td>'
						+'<td>'+'</td>'
						+'</tr>';
				});
				$("#mydata").html(html);
			},
			error:function(){
				alert("error");
			}
		});
	});
</script>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<td>商品编号</td>
				<td>商品名称</td>
				<td>商品URL</td>
				<td>单价</td>
				<td>折扣价</td>
				<td>操作</td>
			</tr>
		</thead>
		<tbody id="mydata">
		</tbody>
		<%-- <c:forEach items="${ProductPage.result}"  var="product">
			<tr>
				<td>${product.productNumbre }</td>
				<td>${product.productName }</td>
				<td>${product.imageUrl }</td>
				<td>${product.price }</td>
				<td>${product.discountPrice }</td>
				<td>
					<a href="product/selectById?id=${product.productId }">查看</a>
					<a href="product/deleteById?id=${product.productId }">删除</a>
				</td>
			</tr>
		</c:forEach> --%>
	</table>
	<div>
		<a href="product/addUI">新增产品</a>
	</div>
</body>
</html>