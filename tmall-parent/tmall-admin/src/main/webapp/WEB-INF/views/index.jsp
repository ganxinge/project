<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en" class="no-js">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
<base href="<%=basePath%>">
<meta charset="utf-8" />
<title>Quick4j</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1.0" name="viewport" />
<meta content="" name="description" />
<meta content="" name="author" />
<meta name="MobileOptimized" content="320">

<!-- BEGIN GLOBAL MANDATORY STYLES -->
<link href="assets/plugins/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css" />
<link href="assets/plugins/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<link href="assets/plugins/uniform/css/uniform.default.css"
	rel="stylesheet" type="text/css" />
<!-- END GLOBAL MANDATORY STYLES -->

<!-- BEGIN THEME STYLES -->
<link href="assets/css/style-metronic.css" rel="stylesheet"
	type="text/css" />
<link href="assets/css/style.css" rel="stylesheet" type="text/css" />
<link href="assets/css/style-responsive.css" rel="stylesheet"
	type="text/css" />
<link href="assets/css/plugins.css" rel="stylesheet" type="text/css" />
<link href="assets/css/pages/tasks.css" rel="stylesheet" type="text/css" />
<link href="assets/css/themes/default.css" rel="stylesheet"
	type="text/css" id="style_color" />
<link href="assets/css/custom.css" rel="stylesheet" type="text/css" />
<!-- END THEME STYLES -->

<link rel="shortcut icon" href="app/img/favicon.ico" />
</head>
<!-- END HEAD -->

<!-- begin body -->
<body class="page-header-fixed page-quick-sidebar-over-content page-sidebar-closed-hide-logo page-container-bg-solid">
	<!-- begin header -->
	<div class="header navbar navbar-inverse navbar-fixed-top">
		<!-- begin top navigation bar -->
		<div class="page-header-inner">
			<!-- begin logo -->
			<a class="navbar-brand" href="javascript:;"> <img
				src="assets/img/logo.png" alt="logo" class="img-responsive" />
			</a>
			<!-- end logo -->
			<!-- begin responsive menu toggler -->
			<a href="javascript:;" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-collapse"> <img
				src="assets/img/menu-toggler.png" alt="" />
			</a>
			<!-- end responsive menu toggler -->
			<!-- begin top navigation menu -->
			<ul class="nav navbar-nav pull-right">
				<li class="dropdown user"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" data-hover="dropdown"
					data-close-others="true"> <img alt=""
						src="assets/img/avatar1_small.jpg" /> <span class="username">
							${userInfo.username } </span> <i class="fa fa-angle-down"></i>
				</a>
					<ul class="dropdown-menu">
						<li><a href="rest/user/logout"> <i class="fa fa-user"></i>
								个人中心
						</a></li>
						<li><a href="rest/user/logout"> <i class="fa fa-rocket"></i>
								我的任务
						</a></li>
						<li><a href="rest/user/logout"> <i class="fa fa-key"></i>
								退出
						</a></li>
					</ul></li>
				<!-- end user login dropdown -->
			</ul>
			<!-- end top navigation menu -->
		</div>
		<!-- end top navigation bar -->
	</div>
	<!-- end header -->
	<div class="clearfix"></div>
	<!-- begin container -->
	<div class="page-container">
		<!-- begin sidebar -->
		<div class="page-sidebar-wrapper">
			<div class="page-sidebar navbar-collapse collapse">
				<!-- begin sidebar menu -->
				<ul class="page-sidebar-menu" id="page-sidebar-menu" data-keep-expanded="false" data-auto-scroll="true" data-slide-speed="200">
					<li class="sidebar-toggler-wrapper">
						<!-- BEGIN SIDEBAR TOGGLER BUTTON -->
						<div class="sidebar-toggler"></div> <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
					</li>

					<li class="start active open">
						<a href="dashboard"id="btn-dashboard"> 
							<i class="fa fa-home"></i>
							<span class="title"> 首页 </span>
							<span class="selected"></span>
						</a>
					</li>
					<!-- 商品管理 -->
					<li class="">
						<a href="javascript:;"> 
							<i class="fa fa-folder"></i> 
							<span class="title"> 商品 </span> 
							<span class="arrow "></span>
						</a>
						<ul class="sub-menu">
							<li>
								<a href="javascript:;"> 
								<i class="fa fa-globe"></i>
								<span class="title"> 商品管理 </span> 
								<span class="arrow "></span>
									<ul class="sub-menu">
										<li><a href="product/query"><i class="fa fa-link"></i> 商品列表 </a></li>
										<li><a href="javascript:;"> <i class="fa fa-link"></i>添加商品 </a></li>
									</ul>
								</a>
							</li>
							
							<li>
								<a href="javascript:;"> <i class="fa fa-globe"></i>
									<span class="title"> 商品设置 </span> <span class="arrow "></span>
									<ul class="sub-menu">
										<li><a href="javascript:;"> <i class="fa fa-link"></i>一级分类 </a></li>
										<li><a href="javascript:;"> <i class="fa fa-link"></i>二级分类 </a></li>
										<li><a href="javascript:;"> <i class="fa fa-link"></i>三级分类 </a></li>
										<li><a href="javascript:;"> <i class="fa fa-link"></i>品牌列表 </a></li>
										<li><a href="javascript:;"> <i class="fa fa-link"></i>规格列表 </a></li>
									</ul>
								</a>
							</li>
							
							<li>
								<a href="javascript:;"> 
									<i class="fa fa-globe"></i>
									<span class="title"> 标签管理 </span> 
									<span class="arrow "></span>
									<ul class="sub-menu">
										<li><a href="javascript:;"> <i class="fa fa-link"></i>标签列表 </a></li>
										<li><a href="javascript:;"> <i class="fa fa-link"></i>商品标签设置 </a></li>
										<li><a href="javascript:;"> <i class="fa fa-link"></i>品牌标签设置 </a></li>
									</ul>
								</a>
							</li>
						</ul>
					</li>
					<!-- 商品管理end -->
					<!-- 订单管理 -->
					<li class="">
						<a href="javascript:;"> 
							<i class="fa fa-folder"></i> 
							<span class="title"> 订单 </span> 
							<span class="arrow "></span>
						</a>
						<ul class="sub-menu">
							<li>
								<a href="javascript:;"> 
								<i class="fa fa-globe"></i>
								<span class="title"> 订单管理 </span> 
								<span class="arrow "></span>
									<ul class="sub-menu">
										<li><a href="product/select"><i class="fa fa-link"></i>订单列表 </a></li>
										<li><a href="javascript:;"> <i class="fa fa-link"></i>待结算订单 </a></li>
										<li><a href="javascript:;"> <i class="fa fa-link"></i>待发货订单 </a></li>
										<li><a href="javascript:;"> <i class="fa fa-link"></i>待收货订单 </a></li>
									</ul>
								</a>
							</li>
							
							<li>
								<a href="javascript:;"> <i class="fa fa-globe"></i>
									<span class="title"> 单据管理 </span> <span class="arrow "></span>
									<ul class="sub-menu">
										<li><a href="javascript:;"> <i class="fa fa-link"></i>收款单 </a></li>
										<li><a href="javascript:;"> <i class="fa fa-link"></i>退货单 </a></li>
									</ul>
								</a>
							</li>
							
							<li>
								<a href="javascript:;"> 
									<i class="fa fa-globe"></i>
									<span class="title"> 发票管理 </span> 
									<span class="arrow "></span>
									<ul class="sub-menu">
										<li><a href="javascript:;"> <i class="fa fa-link"></i>发票内容管理 </a></li>
									</ul>
								</a>
							</li>
						</ul>
					</li>
					<!-- 订单管理end -->
					<!-- 会员管理 -->
					<li class="">
						<a href="javascript:;"> 
							<i class="fa fa-folder"></i> 
							<span class="title"> 会员 </span> 
							<span class="arrow "></span>
						</a>
						<ul class="sub-menu">
							<li>
								<a href="javascript:;"> 
								<i class="fa fa-globe"></i>
								<span class="title"> 订单管理 </span> 
								<span class="arrow "></span>
									<ul class="sub-menu">
										<li><a href="product/select"><i class="fa fa-link"></i>订单列表 </a></li>
										<li><a href="javascript:;"> <i class="fa fa-link"></i>待结算订单 </a></li>
										<li><a href="javascript:;"> <i class="fa fa-link"></i>待发货订单 </a></li>
										<li><a href="javascript:;"> <i class="fa fa-link"></i>待收货订单 </a></li>
									</ul>
								</a>
							</li>
							
							<li>
								<a href="javascript:;"> <i class="fa fa-globe"></i>
									<span class="title"> 单据管理 </span> <span class="arrow "></span>
									<ul class="sub-menu">
										<li><a href="javascript:;"> <i class="fa fa-link"></i>收款单 </a></li>
										<li><a href="javascript:;"> <i class="fa fa-link"></i>退货单 </a></li>
									</ul>
								</a>
							</li>
							
							<li>
								<a href="javascript:;"> 
									<i class="fa fa-globe"></i>
									<span class="title"> 发票管理 </span> 
									<span class="arrow "></span>
									<ul class="sub-menu">
										<li><a href="javascript:;"> <i class="fa fa-link"></i>发票内容管理 </a></li>
									</ul>
								</a>
							</li>
						</ul>
					</li>
					<!-- 会员管理end -->
					<!-- 促销管理 -->
					<li class="">
						<a href="javascript:;"> 
							<i class="fa fa-folder"></i> 
							<span class="title"> 促销 </span> 
							<span class="arrow "></span>
						</a>
						<ul class="sub-menu">
							<li>
								<a href="javascript:;"> 
								<i class="fa fa-globe"></i>
								<span class="title"> 订单管理 </span> 
								<span class="arrow "></span>
									<ul class="sub-menu">
										<li><a href="product/select"><i class="fa fa-link"></i>订单列表 </a></li>
										<li><a href="javascript:;"> <i class="fa fa-link"></i>待结算订单 </a></li>
										<li><a href="javascript:;"> <i class="fa fa-link"></i>待发货订单 </a></li>
										<li><a href="javascript:;"> <i class="fa fa-link"></i>待收货订单 </a></li>
									</ul>
								</a>
							</li>
							
							<li>
								<a href="javascript:;"> <i class="fa fa-globe"></i>
									<span class="title"> 单据管理 </span> <span class="arrow "></span>
									<ul class="sub-menu">
										<li><a href="javascript:;"> <i class="fa fa-link"></i>收款单 </a></li>
										<li><a href="javascript:;"> <i class="fa fa-link"></i>退货单 </a></li>
									</ul>
								</a>
							</li>
							
							<li>
								<a href="javascript:;"> 
									<i class="fa fa-globe"></i>
									<span class="title"> 发票管理 </span> 
									<span class="arrow "></span>
									<ul class="sub-menu">
										<li><a href="javascript:;"> <i class="fa fa-link"></i>发票内容管理 </a></li>
									</ul>
								</a>
							</li>
						</ul>
					</li>
					<!-- 促销管理end -->
					<!-- 页面管理 -->
					<li class="">
						<a href="javascript:;"> 
							<i class="fa fa-folder"></i> 
							<span class="title"> 页面 </span> 
							<span class="arrow "></span>
						</a>
						<ul class="sub-menu">
							<li>
								<a href="javascript:;"> 
								<i class="fa fa-globe"></i>
								<span class="title"> 订单管理 </span> 
								<span class="arrow "></span>
									<ul class="sub-menu">
										<li><a href="product/select"><i class="fa fa-link"></i>订单列表 </a></li>
										<li><a href="javascript:;"> <i class="fa fa-link"></i>待结算订单 </a></li>
										<li><a href="javascript:;"> <i class="fa fa-link"></i>待发货订单 </a></li>
										<li><a href="javascript:;"> <i class="fa fa-link"></i>待收货订单 </a></li>
									</ul>
								</a>
							</li>
							
							<li>
								<a href="javascript:;"> <i class="fa fa-globe"></i>
									<span class="title"> 单据管理 </span> <span class="arrow "></span>
									<ul class="sub-menu">
										<li><a href="javascript:;"> <i class="fa fa-link"></i>收款单 </a></li>
										<li><a href="javascript:;"> <i class="fa fa-link"></i>退货单 </a></li>
									</ul>
								</a>
							</li>
							
							<li>
								<a href="javascript:;"> 
									<i class="fa fa-globe"></i>
									<span class="title"> 发票管理 </span> 
									<span class="arrow "></span>
									<ul class="sub-menu">
										<li><a href="javascript:;"> <i class="fa fa-link"></i>发票内容管理 </a></li>
									</ul>
								</a>
							</li>
						</ul>
					</li>
					<!-- 页面管理end -->
					<!-- 统计管理 -->
					<li class="">
						<a href="javascript:;"> 
							<i class="fa fa-folder"></i> 
							<span class="title"> 统计 </span> 
							<span class="arrow "></span>
						</a>
						<ul class="sub-menu">
							<li>
								<a href="javascript:;"> 
								<i class="fa fa-globe"></i>
								<span class="title"> 订单管理 </span> 
								<span class="arrow "></span>
									<ul class="sub-menu">
										<li><a href="product/select"><i class="fa fa-link"></i>订单列表 </a></li>
										<li><a href="javascript:;"> <i class="fa fa-link"></i>待结算订单 </a></li>
										<li><a href="javascript:;"> <i class="fa fa-link"></i>待发货订单 </a></li>
										<li><a href="javascript:;"> <i class="fa fa-link"></i>待收货订单 </a></li>
									</ul>
								</a>
							</li>
							
							<li>
								<a href="javascript:;"> <i class="fa fa-globe"></i>
									<span class="title"> 单据管理 </span> <span class="arrow "></span>
									<ul class="sub-menu">
										<li><a href="javascript:;"> <i class="fa fa-link"></i>收款单 </a></li>
										<li><a href="javascript:;"> <i class="fa fa-link"></i>退货单 </a></li>
									</ul>
								</a>
							</li>
							
							<li>
								<a href="javascript:;"> 
									<i class="fa fa-globe"></i>
									<span class="title"> 发票管理 </span> 
									<span class="arrow "></span>
									<ul class="sub-menu">
										<li><a href="javascript:;"> <i class="fa fa-link"></i>发票内容管理 </a></li>
									</ul>
								</a>
							</li>
						</ul>
					</li>
					<!-- 统计管理end -->
					<!-- 设置管理 -->
					<li class="">
						<a href="javascript:;"> 
							<i class="fa fa-folder"></i> 
							<span class="title"> 设置 </span> 
							<span class="arrow "></span>
						</a>
						<ul class="sub-menu">
							<li>
								<a href="javascript:;"> 
								<i class="fa fa-globe"></i>
								<span class="title"> 订单管理 </span> 
								<span class="arrow "></span>
									<ul class="sub-menu">
										<li><a href="product/select"><i class="fa fa-link"></i>订单列表 </a></li>
										<li><a href="javascript:;"> <i class="fa fa-link"></i>待结算订单 </a></li>
										<li><a href="javascript:;"> <i class="fa fa-link"></i>待发货订单 </a></li>
										<li><a href="javascript:;"> <i class="fa fa-link"></i>待收货订单 </a></li>
									</ul>
								</a>
							</li>
							
							<li>
								<a href="javascript:;"> <i class="fa fa-globe"></i>
									<span class="title"> 单据管理 </span> <span class="arrow "></span>
									<ul class="sub-menu">
										<li><a href="javascript:;"> <i class="fa fa-link"></i>收款单 </a></li>
										<li><a href="javascript:;"> <i class="fa fa-link"></i>退货单 </a></li>
									</ul>
								</a>
							</li>
							
							<li>
								<a href="javascript:;"> 
									<i class="fa fa-globe"></i>
									<span class="title"> 发票管理 </span> 
									<span class="arrow "></span>
									<ul class="sub-menu">
										<li><a href="javascript:;"> <i class="fa fa-link"></i>发票内容管理 </a></li>
									</ul>
								</a>
							</li>
						</ul>
					</li>
					<!-- 设置管理end -->
					<li class=""><a href="javascript:;"> <i class="fa fa-user"></i><span
							class="title"> 个人中心 </span><span class="arrow "> </span>
					</a>
						<ul class="sub-menu">
							<li><a href="javascript:;"> 信息修改 </a></li>
							<li><a href="javascript:;"> 密码修改 </a></li>

							<!-- 测试权限控制 -->
							<shiro:hasAnyRoles name="super_admin">
								<li><a href="javascript:;">super_admin 拥有此角色</a></li>
							</shiro:hasAnyRoles>

							<shiro:hasPermission name="user:create">
								<li><a href="javascript:;">user:create 拥有此权限</a></li>
							</shiro:hasPermission>

							<shiro:hasPermission name="user:update">
								<li><a href="javascript:;">user:update 拥有此权限</a></li>
							</shiro:hasPermission>

						</ul></li>

				</ul>
				<!-- end sidebar menu -->
			</div>
		</div>
		<!-- end sidebar -->
		<!-- begin content -->
		<div class="page-content-wrapper">
			<div class="page-content">
				<!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->
				<div class="modal fade" id="portlet-config" tabindex="-1"
					role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true"></button>
								<h4 class="modal-title">Modal title</h4>
							</div>
							<div class="modal-body">Widget settings form goes here</div>
							<div class="modal-footer">
								<button type="button" class="btn blue">Save changes</button>
								<button type="button" class="btn default" data-dismiss="modal">
									Close</button>
							</div>
						</div>
						<!-- /.modal-content -->
					</div>
					<!-- /.modal-dialog -->
				</div>
				<!-- /.modal -->
				<!-- END SAMPLE PORTLET CONFIGURATION MODAL FORM-->
				<!-- BEGIN STYLE CUSTOMIZER -->
				<div class="theme-panel hidden-xs hidden-sm">
					<div class="toggler"></div>
					<div class="toggler-close"></div>
					<div class="theme-options">
						<div class="theme-option theme-colors clearfix">
							<span> 主题颜色 </span>
							<ul>
								<!-- <li class="color-black current color-default"
									data-style="default"></li> -->
								<li class="color-blue current tooltips" data-style="default" data-container="body" data-original-title="Default">
								</li>
								<li class="color-black" data-style="black"></li>
								<li class="color-brown" data-style="brown"></li>
								<li class="color-purple" data-style="purple"></li>
								<li class="color-grey" data-style="grey"></li>
								<li class="color-white color-light" data-style="light"></li>
							</ul>
						</div>
						<div class="theme-option">
							<span> 布局 </span> <select
								class="layout-option form-control input-small">
								<option value="fluid">顺序</option>
								<option value="boxed">盒状</option>
							</select>
						</div>
						<div class="theme-option">
							<span> 标题 </span> <select
								class="header-option form-control input-small">
								<option value="fixed">固定</option>
								<option value="default">默认</option>
							</select>
						</div>
						<div class="theme-option">
							<span> 工具栏 </span> <select
								class="sidebar-option form-control input-small">
								<option value="fixed">固定</option>
								<option value="default">默认</option>
							</select>
						</div>
						<div class="theme-option">
							<span> 工具栏位置 </span> <select
								class="sidebar-pos-option form-control input-small">
								<option value="left">左边</option>
								<option value="right">右边</option>
							</select>
						</div>
						<div class="theme-option">
							<span> 页脚 </span> <select
								class="footer-option form-control input-small">
								<option value="fixed">固定</option>
								<option value="default">默认</option>
							</select>
						</div>
					</div>
				</div>
				<!-- END STYLE CUSTOMIZER -->
				
				

				<!-- BEGIN DASHBOARD STATS -->
				<div id="main-content"></div>

				<!-- END PORTLET-->
			</div>
		</div>
		<!-- END CONTENT -->
	</div>
	<!-- END CONTAINER -->
	<!-- BEGIN FOOTER -->
	<div class="footer">
		<div class="footer-inner">2014 &copy; Quick4j By Eliteams.</div>
		<div class="footer-tools">
			<span class="go-top"><i class="fa fa-angle-up"></i></span>
		</div>
	</div>
	<!--[if lt IE 9]>
        <script src="assets/plugins/respond.min.js"></script>
        <script src="assets/plugins/excanvas.min.js"></script>
        <![endif]-->
	<script src="assets/plugins/jquery-1.10.2.min.js"
		type="text/javascript"></script>
	<script src="assets/plugins/jquery-migrate-1.2.1.min.js"
		type="text/javascript"></script>
	<script src="assets/plugins/jquery-ui/jquery-ui-1.10.3.custom.min.js"
		type="text/javascript"></script>
	<script src="assets/plugins/bootstrap/js/bootstrap.min.js"
		type="text/javascript"></script>
	<script
		src="assets/plugins/bootstrap-hover-dropdown/twitter-bootstrap-hover-dropdown.min.js"
		type="text/javascript"></script>
	<script src="assets/plugins/jquery-slimscroll/jquery.slimscroll.min.js"
		type="text/javascript"></script>
	<script src="assets/plugins/jquery.blockui.min.js"
		type="text/javascript"></script>
	<script src="assets/plugins/jquery.cokie.min.js" type="text/javascript"></script>
	<script src="assets/plugins/uniform/jquery.uniform.min.js"
		type="text/javascript"></script>

	<script
		src="assets/plugins/jquery-validation/dist/jquery.validate.min.js"
		type="text/javascript"></script>
	<script type="text/javascript"
		src="assets/plugins/select2/select2.min.js"></script>

	<script src="assets/scripts/app.js" type="text/javascript"></script>
	<script type="text/javascript" src="app/js/index.js"></script>
	
	<script src="assets/scripts/table-managed.js" type="text/javascript"></script>
	
	<script>
		jQuery(document).ready(function() {       
		   //Metronic.init(); // init metronic core components
		//Layout.init(); // init current layout
		//QuickSidebar.init(); // init quick sidebar
		//Demo.init(); // init demo features
		   TableManaged.init();
		});
	</script>
	<!-- <script data-main="app/js/main" src="app/lib/requirejs/require.js"></script> -->
</body>
</html>