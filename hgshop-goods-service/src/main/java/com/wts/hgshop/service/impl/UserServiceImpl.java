package com.wts.hgshop.service.impl;

import org.apache.dubbo.config.annotation.Service;

import com.wts.hgshop.service.UserService;

/**
 * @ClassName: UserServiceImpl 
 * @Description: TODO
 * @author:wts 
 * @date: 2020年3月3日 下午4:25:53
 */
@Service(interfaceClass=UserService.class,version="1.0.0")
public class UserServiceImpl implements UserService{

	public boolean login(String userName, String passWord) {
		return "admin".equals(userName) && "123456".equals(passWord);
	}
}
