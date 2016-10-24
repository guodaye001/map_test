package com.map.platform.base.dao.impl;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.map.platform.base.bean.User;
import com.map.platform.base.dao.IUserDao;

@Repository("userDao")
public class UserDaoImpl extends SqlSessionDaoSupport implements IUserDao{
	@Resource  
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){  
        super.setSqlSessionFactory(sqlSessionFactory);  
    } 
	
	@Override
	public User getUserById(String classMethod,Integer id) {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne(classMethod, id);
	}

}
