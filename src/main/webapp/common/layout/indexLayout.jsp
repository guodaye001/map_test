<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:set value="${pageContext.request.contextPath }" var="resPath" scope="page" />
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>

<!--[if lt IE 9]>
<script type="text/javascript" src="http://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
<![endif]-->

</head>
<body class="body-bg">
	<div class="container-fluid">
		<div>
			<tiles:insertAttribute name="header"></tiles:insertAttribute>
		</div>
		<div ></div>
		<div class="main" style="position: relative;top: 60px;">
			<tiles:insertAttribute name="main"></tiles:insertAttribute>
			<div class="clearfix"></div>
		</div>
		<div class="modal-area"></div>
		<div>
			<tiles:insertAttribute name="footer"></tiles:insertAttribute>
		</div>
	</div>
</body>
</html>