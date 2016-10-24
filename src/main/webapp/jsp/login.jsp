<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set value="${pageContext.request.contextPath}" var="resPath" scope="page" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="${resPath }/resources/css/login.css" rel="stylesheet" type="text/css"/>
<link href="${resPath }/resources/css/common.css" rel="stylesheet" type="text/css"/>
<script src="http://cdn.bootcss.com/jquery-placeholder/2.3.1/jquery.placeholder.min.js"></script>
<script src="http://www.gongjuji.net/Content/files/jquery.md5.js"></script>

		<script>
		$(function(){
			$("#username").focus();
			function loginClick(){
				var username = $("#username").val();
				var password = $("#password").val();
	       		var verifycode = $("#verifycode").val();
	       		var vcStatu = $("#vcStatu").val();
				if(username == ""){
					$("#username").focus();
				}else if(password == ""){
		       		$("#password").focus();
	       		}else if(verifycode == ""){
		       		$("#verifycode").focus();
	       		}else if(vcStatu != "1"){
		       		$("#verifycode").focus();
	       		}else{
		    		$("input[name='password']").val($.md5(password));
		    		$("#loginForm").submit();
			   	}
     		}
			
			$("#myCarousel").carousel({
            	interval: 3000
            });

			$(".carousel-indicators li:first-child").addClass("active");

			$(".carousel-inner div:first-child").addClass("active");
			
			$("#btn-login").click(function(){
	       		loginClick();
			});
			$(document).keydown(function(event){
      		 	if(event.keyCode==13){
      				loginClick();
      			}
      		});

	    	$("#changeCaptchaImage").click(function(){
	       		$("#randomImage").attr("src","${resPath}/captcha/image?" +Math.random());
	       	});
	    	
	    	//验证码keyup
	    	$("#verifycode").keyup(function(){
				$("#verifycode").css("border","solid 1px #0287CA");
	    		$("#verifycode").removeClass("yzmtxt_error").removeClass("yzmtxt_succ");
	    		var yzm = $("#verifycode").val();
	    		if(yzm.length>0){
	    			var param={verifycode:yzm};
	    			$.ajax({url:"${resPath}/login/checkCaptcha",data:param,type:"POST",dataType:"json",success:function(data){
	    				if (data.result == "-1"){
	    					//重置验证码
	    					$("#verifycode").css("border","solid 1px #f00");
	    					$("#verifycode").removeClass("yzmtxt_succ").addClass("yzmtxt_error");
	    					$("#vcStatu").val("-1");
	    					return;
	    				}else{
	    					$("#verifycode").css("border","solid 1px #0287CA");
	    					if (data.result == "1"){
	    						$("#verifycode").removeClass("yzmtxt_error").addClass("yzmtxt_succ");
	    						$("#vcStatu").val("1");
	    					}
	    				}
	    			}});
	    		}
			});
	    	
		 });
		</script>
</head>
<body>
	<div id="content" class="login-container" style="min-height: 611px;">
   		<div class="login-content clearfix">
		<form id ="loginForm" method="post" action="${resPath}/login/toLogin">
		<div class="content-left">
			<!--tms:登陆左侧的slide-->
			<div class="container-fluid">
				<!-- style="width:960px;margin:35px auto 25px;"-->
				<div>
				
					 <div id="myCarousel" class="carousel slide" style="background-size: 100% 100%;  width: 605px;">
					    <!-- 轮播（Carousel）指标 -->
					    <ol class="carousel-indicators">
					    
					    <!--
					        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
					        <li data-target="#myCarousel" data-slide-to="1"></li>
					        <li data-target="#myCarousel" data-slide-to="2"></li>
					    -->
					    
					        <c:forEach items="${webImgList }" var="img">
					        	<li data-target="#myCarousel" data-slide-to="${img.imgIndex }"></li>
							</c:forEach>
					    </ol>   
					    <!-- 轮播（Carousel）项目 -->
					    <div class="carousel-inner">
					    
					    <!--
					        <div class="item active">
					            <img src="https://img.alicdn.com/tps/TB16C3eNFXXXXbqXFXXXXXXXXXX-605-262.jpg" alt="First slide">
					        </div>
					        <div class="item">
					            <img src="https://img.alicdn.com/tps/TB1ZmyMNXXXXXaLXFXXXXXXXXXX-605-262.jpg" alt="Second slide">
					        </div>
					        <div class="item">
					            <img src="https://img.alicdn.com/tps/TB1RU.QKVXXXXbaXpXXXXXXXXXX-605-262.jpg" alt="Third slide">
					        </div>
					        
					    -->
					        
					        <c:forEach items="${webImgList }" var="img">
					        	<div class="item">
					        		<a href="${img.linkAddr }">
					            		<img src="${img.imgAddr }" alt="${img.title }">
					            	</a>
					        	</div>
							</c:forEach>
					    </div>
					</div>
				</div>
			 </div>
			</div>
	    
    <div class="content-right">
    	<div class="login-box">
        	 <ul>
                <li class="login-title font18">登录</li>
                <li>
					<input type="text" class="font14 light-grey" id="username" name="username" placeholder="用户账号（注册邮箱地址）" />
				</li>
                <li class="login-password">
                	<input type="password" class="font14 light-grey" id="password" placeholder="密码"/>
                	<input type="hidden"   name="password">
                </li>
                                             
				 <li class="verifycode">
					<input type="text"  placeholder="验证码" id="verifycode" name="verifycode" class="font14 light-grey verifycodebox"/>
					<img id="randomImage" src="${resPath }/captcha/image" />
					<input type="hidden" id="vcStatu" value="-1" />
					<a id="changeCaptchaImage" href="#">看不清，换一张</a>
				 </li>		  
			   				   
                <li style="margin-top: 10px;">
					<button id="btn-login" type="button" class="m-btn m-btn-or" data-ga="阿里云.登录.登录" >登 录</button>
					<span class="font-lightgray"><a href="jumpRegister" data-ga="阿里云.登录.免费注册" >免费注册</a>&nbsp;|&nbsp;
						<a  href="/account/find_pwd" data-ga="阿里云.登录.忘记密码" >忘记密码</a>
					</span> 
				</li>
        	</ul>
        </div>
    </div>

    </form>
	
	
	</div>
		<div class="module-wrap J_tb_lazyload">
		  <div class="important-notice">
		    <h6 class="font18 font-n">重要通知</h6>
		    <ul>
		    	<c:forEach items="${webNewsList }" var="news">
		    		<li>
		          		<span class="font-yellow padding-r10">${news.title }</span>
		          		${fn:substring(news.content, 0, 48)}
		          		<a target="_blank" href="${news.newsAddr }">查看详情</a>
		        	</li>
				</c:forEach>
						       
		    </ul>
		  </div>
		</div>
    		
   </div>
</body>
</html>