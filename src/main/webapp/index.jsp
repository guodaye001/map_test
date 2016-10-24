<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PageAdmin企业网站管理系统-Powered by PageAdmin CMS</title>
<meta name="keywords" content="pageadmin cms,企业网站管理系统" />
<meta name="description" content="PageAdmin网站管理系统是基于.NET开发的CMS网站系统，强大、灵活、易用，广泛用于制作学校网站,政府网站和企业网站建设,超过50万个网站采用PageAdmin CMS系统建网站。" />
<meta name="Author" content="PageAdmin CMS" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<link href="index/css/style.css" type="text/css" rel="stylesheet" />
<link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<script type="text/javascript">var submenu_style=0;</script>
<link rel="stylesheet" type="text/css" href="index/css/dropmenu.css" />
<script src="index/js/script.js" type="text/javascript"></script>
<script src="index/js/QQ.js" type="text/javascript"></script>
</head>
<body>
<div class="page_style lanmupage page_l61">
<div class="top_box">
 <div class="top_box_inner">
   <div class="topcontent"><div class="top_t">
	<div class="top">
		<span>欢迎访问某某公司官方网站！</span> 
	</div>
	<div class="rexian">
		<input class="txt-ss" placeholder="请输入关键字" id="searchkw" type="text" /><input onclick="search_kw()" class="btn-ss" value="" type="button" /> 
	</div>
</div>
<script type="text/javascript">
function search_kw()
 {
  var search_url="/index.aspx?lanmuid=61&sublanmuid=719"; //这里改为上个步骤新建的子栏目页面的地址;
  var searchkw=document.getElementById("searchkw");
 if(searchkw.value=="")
  {
   alert("请输入搜索关键词！");
   searchkw.focus();
   return;
  }
 if(search_url.indexOf("?")<0)
 { 
  search_url+="?"; 
 } 
else 
 {
 search_url+="&"; 
 }
 search_url+="kw="+encodeURIComponent(searchkw.value);
 location.href=search_url; 
} 
</script></div><div class="clear"></div>
   <div class="logo"><a href="/"><img src="index/img/logo.png" border="0"></a></div>
   <div class="menu_box" id="Menu"><ul>
<li class="menu_style_homepage menu_current" id="MenuItem61" name="MenuItem"><a href="/index.aspx" class="menu">首页</a><ul><li><a href="链接">链接内容</a></li></ul></li>
<li class="menu_style" id="MenuItem62" name="MenuItem"><a href="/index.aspx?lanmuid=62" class="menu">产品与方案</a><ul>
<li><a href="/index.aspx?lanmuid=62&sublanmuid=647">企业简介</a></li>
<li><a href="/index.aspx?lanmuid=62&sublanmuid=648">企业相册</a></li>
<li><a href="/index.aspx?lanmuid=62&sublanmuid=649">宣传视频</a></li>  
</ul></li>
<li class="menu_style" id="MenuItem67" name="MenuItem"><a href="/index.aspx?lanmuid=67" class="menu">案例展示</a><ul>
<li><a href="/index.aspx?lanmuid=67&sublanmuid=656">工业机械</a></li>
<li><a href="/index.aspx?lanmuid=67&sublanmuid=657">工业五金</a></li>
<li><a href="/index.aspx?lanmuid=67&sublanmuid=658">工业机床</a></li>
<li><a href="/index.aspx?lanmuid=67&sublanmuid=659">工业工具</a></li>
</ul></li>
<li class="menu_style" id="MenuItem63" name="MenuItem"><a href="/index.aspx?lanmuid=63" class="menu">新闻中心</a></li>
<li class="menu_style" id="MenuItem64" name="MenuItem"><a href="/index.aspx?lanmuid=64" class="menu">企业文化</a></li>
<li class="menu_style" id="MenuItem81" name="MenuItem"><a href="/index.aspx?lanmuid=81" class="menu">关于我们</a></li>
</ul></div>
 </div>
</div>
<script type="text/javascript">var IsPageHome="1";var Lanmu_Id="61";var Sublanmu_Id="0";ShowSubMenu(Lanmu_Id);</script>
<div class="banner" style="clear:both;text-align:center;width:1920px;margin:0px auto;height:470px;">
	<div id="myCarousel" class="carousel slide" style="height: 470px; width: 1920px;text-align:center;">
	   <!-- 轮播（Carousel）指标 -->
	   <ol class="carousel-indicators">
		  <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
		  <li data-target="#myCarousel" data-slide-to="1"></li>
		  <li data-target="#myCarousel" data-slide-to="2"></li>
	   </ol>   
	   <!-- 轮播（Carousel）项目 -->
	   <div class="carousel-inner">
		  <div class="item active">
			 <img src="index/img/banner/banner1.jpg" alt="First slide">
			 <div class="carousel-caption">标题 1</div>
		  </div>
		  <div class="item">
			 <img src="index/img/banner/banner2.jpg" alt="Second slide">
			 <div class="carousel-caption">标题 2</div>
		  </div>
		  <div class="item">
			 <img src="index/img/banner/banner3.jpg" alt="Third slide">
			 <div class="carousel-caption">标题 3</div>
		  </div>
	   </div>
	   <!-- 轮播（Carousel）导航 -->
	   <a class="carousel-control left" href="#myCarousel" 
		  data-slide="prev">&lsaquo;</a>
	   <a class="carousel-control right" href="#myCarousel" 
		  data-slide="next">&rsaquo;</a>
	</div>
</div>
<div class="main_box main_box_style">
 <div class="main_box_inner">
 

<ul class="h-zhyj-box w1050">
  <li class="h-zhyj-title">                                                          <!--标题-->
<div>中商科技是致力于<span>智慧信息化服务、智能硬件研发</span>为一体的国家级高新技术企业</div>
  </li>
  <li class="h-zhyj-con">
<div class="zhyj-con-l">
  <img src="index/img/ht1.jpg"/>
  <span class="zhyj-fdwz">智慧硬件</span>
  <p>某某智慧硬件包含3G/4G路由器，某某智慧网关，某某声波感知，智能云摄像头4类...</p>
  <a href="/index.aspx?lanmuid=62&sublanmuid=714">更多</a>
</div>
<div class="zhyj-con-l">
  <img src="index/img/ht2.jpg"/>
  <span class="zhyj-fdwz">智慧应用</span>
  <p>基于某某智慧硬件研发出的生活化应用无处不在，让城市生活变得有点意思...</p>
  <a href="/index.aspx?lanmuid=62&sublanmuid=647">更多</a>
</div>
<div class="zhyj-con-l">
  <img src="index/img/ht3.jpg"/>
  <span class="zhyj-fdwz">智慧办公</span>
  <p>商讯IM企业及时通讯工具，智能化企业管理系统GGwork，让管理不再那么难...</p>
  <a href="/index.aspx?lanmuid=62&sublanmuid=715">更多</a>
</div>

<div class="zhyj-con-r">
<span class="qdyhz-t"><a href="/index.aspx?lanmuid=67&sublanmuid=717">案例展示</a></span>
<embed src="http://www.tudou.com/v/cT_X_qDfn3A/&bid=05&resourceId=0_05_05_99/v.swf" type="application/x-shockwave-flash" allowscriptaccess="always" allowfullscreen="true" wmode="opaque" width="235" height="160"></embed>
</div>
  </li>
</ul>

   




<div style="background:#EEE;margin-top:30px;">
<ul class="h-xwzx-box w1050">
  <li class="h-xwzx-l">                                             <!--左-->
<div class="xwzx-l-l">
  <h1>NEWS</h1>
  <p>IT新闻中心</p>
  <a href="/index.aspx?lanmuid=63&sublanmuid=654">更多</a>
</div>
<div  class="xwzx-l-r"><div class="article">
<ul>

<li><span class="title">
<a href="/index.aspx?lanmuid=67&sublanmuid=717&id=510" target="_self" title="硬件五" style="">硬件五</a></span>
<span class="date">11-19</span>
</li>

<li><span class="title">
<a href="/index.aspx?lanmuid=67&sublanmuid=717&id=509" target="_self" title="硬件四" style="">硬件四</a></span>
<span class="date">11-19</span>
</li>

<li><span class="title">
<a href="/index.aspx?lanmuid=67&sublanmuid=717&id=508" target="_self" title="硬件三" style="">硬件三</a></span>
<span class="date">11-19</span>
</li>

<li><span class="title">
<a href="/index.aspx?lanmuid=67&sublanmuid=717&id=507" target="_self" title="硬件二" style="">硬件二</a></span>
<span class="date">11-19</span>
</li>

<li><span class="title">
<a href="/index.aspx?lanmuid=67&sublanmuid=717&id=506" target="_self" title="案例一" style="">案例一</a></span>
<span class="date">11-19</span>
</li>

<li><span class="title">
<a href="/index.aspx?lanmuid=0&sublanmuid=0&id=505" target="_self" title="车主风采4" style="">车主风采4</a></span>
<span class="date">10-30</span>
</li>

<li><span class="title">
<a href="/index.aspx?lanmuid=0&sublanmuid=0&id=504" target="_self" title="车主风采3" style="">车主风采3</a></span>
<span class="date">10-30</span>
</li>

</ul></div>
</div>
  </li>
  <li class="h-xwzx-r">                                     <!--右-->
<a class="qywh-box" href="/index.aspx?lanmuid=64&sublanmuid=710">
  <img src="index/img/img_2.png"/>
  <span>企业文化</span>
  <div>用核心技术打造现代电子商务...</div>
</a>
<a class="qywh-box" style="margin-bottom:0px;" href="/index.aspx?lanmuid=81&sublanmuid=720">
  <img src="index/img/video_2.png"/>
  <span>宣传片</span>
  <div>X9重新定义内容，让城市生活有点意思...</div>
</a>
  </li>
</ul>
</div>

   




<ul class="h-cxlb-box w1050">
  <li class="cxlb-bg1"><span>诚信为本</span>信以立身 诚以待人</li>
  <li class="cxlb-bg2"><span>客户至上</span>专业品质 用心服务</li>
  <li class="cxlb-bg3"><span>精益求精</span>细节之道 品味极致</li>
  <li style="padding-right:0px;" class="cxlb-bg4"><span>创造辉煌</span>追求卓越 铸造辉煌</li>
</ul>



   



 </div>
 <div class="clear main_box_inner_bottom"></div>
</div><div class="bottom_box"><ul class="db-box">
	<li class="db-left">
		<span style="font-size:20px;">24小时服务热线：0000-000-000</span> <span>地址：中山市某某区某某路00-7号</span> <span>备案号：粤ICP备12345678号-1</span> <span><b style="font-size:12px;font-weight:normal;">版权所有 &copy; 2014-2015</b>中山某某IT公司</span> 
	</li>
	<li class="db-right">
		<span>关注我们：</span><a target="_blank" href="http://weibo.com/login.php"><img src="index/img/xl.png" /></a><a target="_blank" href="http://t.qq.com/"><img src="index/img/tx.png" /></a><a target="_blank" href="#"><img src="index/img/wx.png" /></a> 
	</li>
</ul></div><div align='center' style='padding:5px'>Powered by <a href='http://www.pageadmin.net' target='_blank'><strong>PageAdmin CMS</strong></a>
</div>
</div>
<script>
   $(function(){
      // 初始化轮播
      $("#myCarousel").carousel('cycle');

      $("#myCarousel").carousel('cycle');
   });
</script>
</body>
</html>