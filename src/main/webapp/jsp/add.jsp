<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<c:set value="${pageContext.request.contextPath}" var="resPath" scope="page" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="${resPath }/resources/css/login.css" rel="stylesheet" type="text/css"/>
<link href="${resPath }/resources/css/common.css" rel="stylesheet" type="text/css"/>

		<script>
		$(function(){
			$("#myCarousel").carousel({
            	interval: 3000
            });
		 });
		</script>
</head>
<body>
	<div id="content" class="login-container" style="min-height: 711px;">
         
   	<div class="login-content clearfix">
	
	<form id ="rc_ua_dedicated_form" method="post" onsubmit="return check();">
		
		 <input type="hidden" name="action" value="login_action"/>
		 <input type="hidden" name="event_submit_do_login" value="ok">
		<div class="content-left">
			<!--tms:登陆左侧的slide-->
			<div class="container-fluid">
				<!-- style="width:960px;margin:35px auto 25px;"-->
				<div>
				
					 <div id="myCarousel" class="carousel slide" style="background-size: 100% 100%;  width: 605px;">
					    <!-- 轮播（Carousel）指标 -->
					    <ol class="carousel-indicators">
					        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
					        <li data-target="#myCarousel" data-slide-to="1"></li>
					        <li data-target="#myCarousel" data-slide-to="2"></li>
					    </ol>   
					    <!-- 轮播（Carousel）项目 -->
					    <div class="carousel-inner">
					        <div class="item active">
					            <img src="https://img.alicdn.com/tps/TB16C3eNFXXXXbqXFXXXXXXXXXX-605-262.jpg" alt="First slide">
					        </div>
					        <div class="item">
					            <img src="https://img.alicdn.com/tps/TB1ZmyMNXXXXXaLXFXXXXXXXXXX-605-262.jpg" alt="Second slide">
					        </div>
					        <div class="item">
					            <img src="https://img.alicdn.com/tps/TB1RU.QKVXXXXbaXpXXXXXXXXXX-605-262.jpg" alt="Third slide">
					        </div>
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
										<input type="text" class="font14 light-grey" id="username" name="loginName" value="用户账号（注册邮箱地址）" _status="default" />
				</li>
                <li class="login-password"><input type="password" name="password" class="font14 light-grey" id="password" value="" _status="default" /><span id="pwd-placeholder" class="font14 light-grey">密码</span></li>
                                             
				 <li class="verifycode">
					<input type="text"  placeholder="验证码" id="verifycode" name="captcha" style=""  class="font14 light-grey verifycodebox" autocomplete="off"/>
					<img  id="randomImage" src="https://pin.aliyun.com/get_img?identity=gein.cn&sessionid=PT666591-B1TEKY2VSV4351M3RDGR1-PEHR18UI-C7K" />
					<a href="#" onclick="reloadImage();">看不清，换一张</a>
				 </li>		  
			   				   
                <li style="margin-top: 10px;">
					<button  type="submit" class="m-btn m-btn-or" data-ga="阿里云.登录.登录" >登 录</button>
					<span class="font-lightgray"><a href="jumpRegister" data-ga="阿里云.登录.免费注册" >免费注册</a>&nbsp;|&nbsp;
						<a  href="/account/find_pwd" data-ga="阿里云.登录.忘记密码" >忘记密码</a>
					</span> 
				</li>
        	</ul>
        </div>
        
        <div class="beian-question">
		  <ul>		
		  <div aliyun-lego-data="//www.aliyun.com/lego/beian/login/notice">
		  <link rel="stylesheet" type="text/css" href="//g.alicdn.com/ali-mod/aliyun-lego-beian-notice/0.0.1/index.css">
		  <div data-spm="245376" data-moduleid="88759" data-name="aliyun-lego-beian-notice" data-guid="245376" id="guid-245376" data-scene-id="264426" data-scene-version="0" data-hidden="" data-gitgroup="ali-mod" class="aliyun-lego-beian-notice J_Module" tms="aliyun-lego-beian-notice/0.0.1" tms-datakey="264426">
		  <div class="module-wrap J_tb_lazyload">
		  <li><a class="grey" href="http://help.aliyun.com/knowledge_detail/5974952.html" target="_blank" data-ga="">首次备案流程引导</a></li>
		  <li><a class="grey" href="http://help.aliyun.com/knowledge_detail/5974621.html" target="_blank" data-ga="">原备案不在阿里云</a></li>
		  <li><a class="grey" href="http://help.aliyun.com/knowledge_detail/5974925.html" target="_blank" data-ga="">变更备案流程介绍</a></li>
		  <li><a class="grey" href="https://bbs.aliyun.com/thread/218.html" target="_blank" data-ga="">备案交流区</a></li>
		  </div>
		  </div>
		  </div>
		  </ul>
		</div>
        
    </div>

    </form>
	
	
	</div>

    		
    <!--重要通知 tms-->
    <div>
    			<div  aliyun-lego-data="//www.aliyun.com/lego/baloginfo"></div>
    </div> 
   </div>
</body>
</html>