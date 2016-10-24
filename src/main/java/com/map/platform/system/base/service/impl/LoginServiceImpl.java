package com.map.platform.system.base.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.map.platform.commons.dao.BaseDao;
import com.map.platform.system.base.bean.WebImg;
import com.map.platform.system.base.bean.WebNews;
import com.map.platform.system.base.service.LoginService;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
	private static final Logger logger = Logger.getLogger(LoginServiceImpl.class);

	@Autowired
	public BaseDao baseDao;

	@Override
	public List<WebImg> getLoginImgList(String imgType) {
		List<WebImg> webImgList = new ArrayList<WebImg>();
		try {
			webImgList = baseDao.getSearchListByObj("LoginMapper.getLoginImgList", imgType);
		} catch (Exception e) {
			logger.error("获取登录界面Banner图片列表异常!",e);
		}
		return webImgList;
	}

	@Override
	public List<WebNews> getLoginNewsList(String isLoginNews,int size) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("isLoginNews", isLoginNews);
		param.put("size", size);
		List<WebNews> webNewsList = new ArrayList<WebNews>();
		try {
			webNewsList = baseDao.getSearchList("LoginMapper.getLoginNewsList", param);
		} catch (Exception e) {
			logger.error("获取登录界面公告列表异常!",e);
		}
		return webNewsList;
	}


	
	
}
