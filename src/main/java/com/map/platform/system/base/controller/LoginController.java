package com.map.platform.system.base.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.map.platform.commons.utils.Constants;
import com.map.platform.system.base.bean.WebImg;
import com.map.platform.system.base.bean.WebNews;
import com.map.platform.system.base.service.LoginService;


@Controller
@RequestMapping("/login")
public class LoginController {
	private static Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired  
    private LoginService loginService;
      
    @RequestMapping("")
    public String toIndex(HttpServletRequest request,Model model){  
    	List<WebImg> webImgList = loginService.getLoginImgList(Constants.LOGIN_IMG_BANNER);
    	List<WebNews> webNewsList = loginService.getLoginNewsList("Y", 6);
    	logger.info(request.getRemoteAddr()+"------图片列表"+webImgList.size()+"-----公告列表"+webNewsList.size());
    	model.addAttribute("webImgList", webImgList);
    	model.addAttribute("webNewsList", webNewsList);
        return "system.login";  
    }
    
    @RequestMapping("/toLogin")
    public String toLogin(HttpServletRequest request){
    	String username = request.getParameter("username");
    	String password = request.getParameter("password");
    	String verifycode = request.getParameter("verifycode");
        System.out.println(username+"______"+password+"______"+verifycode);
        return "system.login";  
    }
    
    @RequestMapping("/checkCaptcha")
    @ResponseBody
    public Map<String,String> checkCaptcha(HttpServletRequest request){
    	String verifycode = request.getParameter("verifycode");
    	Map<String,String> result = new HashMap<String,String>();
    	String vc = (String)request.getSession().getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
    	System.out.println("********"+vc);
    	if(StringUtils.isNotEmpty(vc) && StringUtils.isNotEmpty(verifycode)){
	    	//-1:错误; 0:开头正确; 1:完全正确
	    	if(vc.equals(verifycode)){
	    		result.put("result", "1");
	    	} else if(vc.startsWith(verifycode)){
	    		result.put("result", "0");
	    	} else {
	    		result.put("result", "-1");
	    	}
    	}
        return result;  
    }
    
}
