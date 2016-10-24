package com.map.platform.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.map.platform.base.bean.User;
import com.map.platform.base.dao.IUserDao;
import com.map.platform.base.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{
    @Autowired
    IUserDao userDao;
    
	@Override
	public User getUserById(String classMethod, Integer id) {
		// TODO Auto-generated method stub
		return userDao.getUserById(classMethod, id);
	}

}
