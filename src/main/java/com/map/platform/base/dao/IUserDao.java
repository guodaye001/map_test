package com.map.platform.base.dao;

import com.map.platform.base.bean.User;

public interface IUserDao {
	public User getUserById(String classMethod, Integer id);
}
