package com.study.spring.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.spring.dao.UserMapper;
import com.study.spring.pojo.User;
import com.study.spring.service.UserService;

/**
 * UserService实现类
 * 
 * @Title:UserServiceImpl.java
 * @Package:com.study.spring.impl
 * @Description:
 * @author:yangrong
 * @date:2018年6月12日下午4:45:19
 * @updater:
 * @version:V1.0
 * @updates:
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper;

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(userId);
	}

}
