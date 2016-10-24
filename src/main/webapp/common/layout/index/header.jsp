<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%> 
<c:set value="${pageContext.request.contextPath}" var="path" scope="page"/>
<nav class="navbar navbar-default navbar-fixed-top" role="navigation" style="background-color:rgb(240,240,240);">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">菜鸟教程</a>
		</div>
		<div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">iOS</a></li>
				<li><a href="#">SVN</a></li>
				<li class="dropdown">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown">
						Java
						<b class="caret"></b>
					</a>
					<ul class="dropdown-menu">
						<li><a href="#">jmeter</a></li>
						<li><a href="#">EJB</a></li>
						<li><a href="#">Jasper Report</a></li>
						<li class="divider"></li>
						<li><a href="#">分离的链接</a></li>
						<li class="divider"></li>
						<li><a href="#">另一个分离的链接</a></li>
					</ul>
				</li>
			</ul>
		</div>
	</div>
</nav>