
//顶部fixed
 $(window).bind("scroll", function () {  
                var sTop = $(window).scrollTop();  
                var sTop = parseInt(sTop);  
                if (sTop >= 32) {
					        $(".top_box").css({"height":"55px","position":"fixed","background":"white","z-index":"6","border":"1px #DDD solid"});
                            $(".topcontent").css("display","none");
							$(".top_box .logo").css({"height":"55px","margin-top":"0px"});
							$(".top_box .logo img").css({"height":"55px","width":"168px"});
							$(".top_box .menu_box").css({"height":"55px","margin-top":"10px"});
                }else { 
							$(".top_box").css({"height":"130px","position":"relative","background":"url(index/img/top-bg.jpg) repeat-x top center","border":"0px #333 solid"});
                            $(".topcontent").css("display","block");
							$(".top_box .logo").css({"height":"98px","margin-top":"10px"});
							$(".top_box .logo img").css({"height":"87px","width":"168px"});
							$(".top_box .menu_box").css({"height":"76px","margin-top":"32px"});
                }   
            });  





//右侧返回顶部图标
$(function(){
     var icon='<a class="gotoptop_icon" id="gotoptop_icon" href="#" title="返回顶部"></a>';
     $("body").append(icon);
     var $window=$(window);
     var $gotoptop_icon=$("#gotoptop_icon");
     var $body = (window.opera) ? (document.compatMode == "CSS1Compat" ? $('html') : $('body')) : $('html,body'); // opera fix
     $(window).bind('scroll resize',function(){
        if($window.scrollTop()>0)
         {
          $gotoptop_icon.show();
         }
        else
         {
          $gotoptop_icon.hide();
         }
     });
     $gotoptop_icon.bind('click',function(){
        $body.animate({scrollTop:'0px'},"fast");
         return false;
     });
});


function gotoposition(id) //页面转到指定id位置
  {
     var pos=0;
     var obj=$(id);
     if(obj.size()==0){return;}
     pos=obj.offset().top;
     pos=pos-137;
     var $body = (window.opera) ? (document.compatMode == "CSS1Compat" ? $('html') : $('body')) : $('html,body'); // opera fix
     $body.animate({scrollTop:pos+'px'});
 }






