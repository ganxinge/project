<%@ page language="java" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath() + "/";
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
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
					html+='<tr class="odd gradeX">'
						+'<td><input type="checkbox" class="checkboxes" value="1" /></td>'
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
<div class="row">
	<div class="col-md-12">
		
		<ul class="page-breadcrumb breadcrumb">
			<li><i class="fa fa-home"></i> <a href="index.html">Home</a> <i
				class="fa fa-angle-right"></i></li>
			<li><a href="#">Data Tables</a> <i class="fa fa-angle-right"></i>
			</li>
			<li><a href="#">Managed Datatables</a></li>
		</ul>
		<!-- END PAGE TITLE & BREADCRUMB-->
	</div>
</div>

<div class="row">
	<div class="col-md-12">
		<!-- BEGIN EXAMPLE TABLE PORTLET-->
		<div class="portlet box grey-cascade">
			<div class="portlet-title">
				<div class="caption">
					<i class="fa fa-globe"></i>Managed Table
				</div>
				<div class="tools">
					<a href="javascript:;" class="collapse"> </a> <a
						href="#portlet-config" data-toggle="modal" class="config"> </a> <a
						href="javascript:;" class="reload"> </a> <a href="javascript:;"
						class="remove"> </a>
				</div>
			</div>
			<div class="portlet-body">
				<div class="table-toolbar">
					<div class="row">
						<div class="col-md-6">
							<div class="btn-group">
								<button id="sample_editable_1_new" class="btn green">
									Add New <i class="fa fa-plus"></i>
								</button>
							</div>
						</div>
						<div class="col-md-6">
							<div class="btn-group pull-right">
								<button class="btn dropdown-toggle" data-toggle="dropdown">
									Tools <i class="fa fa-angle-down"></i>
								</button>
								<ul class="dropdown-menu pull-right">
									<li><a href="javascript:;"> Print </a></li>
									<li><a href="javascript:;"> Save as PDF </a></li>
									<li><a href="javascript:;"> Export to Excel </a></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
				<table class="table table-striped table-bordered table-hover"
					id="sample_1">
					<thead>
						<tr>
							<th class="table-checkbox"><input type="checkbox"
								class="group-checkable" data-set="#sample_1 .checkboxes" /></th>
							<th>商品编号</th>
							<th>商品名称</th>
							<th>商品URL</th>
							<th>单价</th>
							<th>折扣价</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody id="mydata">
						<!-- <tr class="odd gradeX">
							<td><input type="checkbox" class="checkboxes" value="1" /></td>
							<td>shuxer</td>
							<td><a href="mailto:shuxer@gmail.com"> shuxer@gmail.com
							</a></td>
							<td>120</td>
							<td class="center">12 Jan 2012</td>
							<td><span class="label label-sm label-success">
									Approved </span></td>
						</tr> -->
					</tbody>
				</table>
			</div>
		</div>
		<!-- END EXAMPLE TABLE PORTLET-->
	</div>
</div>