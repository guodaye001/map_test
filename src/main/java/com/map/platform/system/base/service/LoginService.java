package com.map.platform.system.base.service;

import java.util.List;

import com.map.platform.system.base.bean.WebImg;
import com.map.platform.system.base.bean.WebNews;


public interface LoginService{

	public List<WebImg> getLoginImgList(String imgType);

	public List<WebNews> getLoginNewsList(String isLoginNews,int size);
	
}
