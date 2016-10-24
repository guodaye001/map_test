<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://guosw.com/jsp/jstl/functions" prefix="myTld" %>
<core:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
	<head>
		<title>${title}</title> 
		<link rel="icon" href="favicon.ico" type="image/x-icon"/>
		<link rel="shortcut icon" href="favicon.ico" type="image/x-icon"/>
		<meta http-equiv="Cache-Control" content="no-cache"/>
		<meta http-equiv="Content-Type" content="text/html charset=utf-8">
		<!-- ie中超连接不弹出新窗口 --> 
		<base target="_self">  
		<!-- 标签栏图标 -->
		<script type="text/javascript">
			//返回到登录页面 
			function toLoginJsp(){
				parent.location.href="${ctx}/login.jsp";
			}
			//跳转到sessiontimeout 页面 
			function ajaxTimeOutContinue(){
				window.location.href="${ctx}/common/errorPage/sessionTimeOut.jsp";
			}
		</script>
	</head>
</html>