<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>登录</title>
<%@include file="/WEB-INF/views/common/header.jsp"%>
<link rel="stylesheet" type="text/css" href="<%=basePath%>resources/css/shopping-mall-index.css" />
</head>

<body>

	<div class="sign-logo w1200">
	<h1><a href="#" title="宅客微购"><img src="<%=basePath%>resources/images/logo.jpg" /></a></h1>
</div>

	<div class="sign-con w1200">
	<img src="<%=basePath%>resources/images/logn-tu.gif" class="sign-contu f-l" />
    <div class="sign-ipt f-l">
    	<p>用户名</p>
        <input type="text" placeholder="手机号/邮箱" />
        <p>密码</p>
        <input type="text" placeholder="密码可见" /><br />
        <button class="slig-btn" onclick="login();">登录</button>
        <p>已有账号？请<a href="index.html">登录</a><a href="#" class="wj">忘记密码？</a></p>
        <div class="sign-qx">
        	<a href="#" class="f-r"><img src="<%=basePath%>resources/images/sign-xinlan.gif" /></a>
        	<a href="#" class="qq f-r"><img src="<%=basePath%>resources/images/sign-qq.gif" /></a>
            <div style="clear:both;"></div>
        </div>
    </div>
    <div style="clear:both;"></div>
</div>

    <!--底部服务-->
    <!--底部 版权-->
    <%@include file="/WEB-INF/views/common/footer.jsp"%>
    
</body>
</html>
